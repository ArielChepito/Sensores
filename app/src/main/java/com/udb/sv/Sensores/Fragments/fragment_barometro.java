package com.udb.sv.Sensores.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.udb.sv.Sensores.Activities.*;
import com.udb.sv.Sensores.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_barometro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_barometro extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public fragment_barometro() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_barometro.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_barometro newInstance(String param1, String param2) {
        fragment_barometro fragment = new fragment_barometro();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_barometro, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        try
        {

            Button boton = view.findViewById(R.id.btnBarometro);
            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), barometroActivity.class);
                    startActivity(intent);

                }
            });



            /*VideoView mVideoView= view.findViewById(R.id.bgVideoView3);

            Uri uri = Uri.parse("android.resource://"+getActivity().getPackageName()+"/"+R.raw.gps);
            Log.d("URL",uri +"");
            mVideoView.setVideoURI(uri);
            mVideoView.start();

            mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.setLooping(true);
                }
            });*/

        }
        catch(Exception e)
        {

            Log.d("URL",e.getMessage()+"");
        }



    }

}
