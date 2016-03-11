package com.example.laud.laud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.io.IOException;

public class LAUD extends AppCompatActivity {
    String TAG = "LAUD";
    MediaControl md;
    Stream baseStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laud);
        md = new MediaControl();
        Stream one = new Stream("http://streams.lrn.fm:8100/", "Стрим 1", "ссылка на картинку");
        Stream two = new Stream("rtsp://195.209.248.200:554/tvorigin/33", "Стрим 2", "ссылка на картинку");
        baseStream = two;
    }

    public void startStream(View view) {
        Log.d(TAG, "Try start stream");
        try {
            md.playStream(baseStream);
        } catch (IOException e) {
            e.printStackTrace();
            Log.d(TAG, "stream start problem");
        }
    }

    public void stopStream(View view) {
        Log.d(TAG, "try stop stream ");
        md.stopStream();
    }
}
