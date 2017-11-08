package com.udb.sv.Sensores.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.udb.sv.Sensores.Logic.GPSTracker;
import com.udb.sv.Sensores.R;

public class gpsActivity extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
        myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        double latitude= 0.00;
        double longitude = 0.00;
        GPSTracker gps= new GPSTracker(gpsActivity.this);
        if(gps.canGetLocation()){
            latitude = gps.getLatitude();
            longitude = gps.getLongitude();
        }else{
            gps.showSettingsAlert();
        }

        myWebView.loadUrl("https://www.google.com.sv/maps/" + "@"+latitude+","+longitude+",18.36z");


    }



}
