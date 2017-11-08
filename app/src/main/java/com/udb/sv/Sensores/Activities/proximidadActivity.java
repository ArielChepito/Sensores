package com.udb.sv.Sensores.Activities;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.udb.sv.Sensores.R;

public class proximidadActivity extends AppCompatActivity implements SensorEventListener {
    LinearLayout ln;
    SensorManager sm;
    Sensor sensor;
    TextView tv;
    String Sn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximidad);
        ln = (LinearLayout) findViewById(R.id.activity_main666);
        tv = (TextView) findViewById(R.id.text);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sm.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        String text = String.valueOf(event.values[0]);
        tv.setText(text);
        float valor = Float.parseFloat(text);
        if(valor == 3){

            ln.setBackgroundColor(Color.GREEN);
        }

        else{

            ln.setBackgroundColor(Color.RED);

        }

    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
