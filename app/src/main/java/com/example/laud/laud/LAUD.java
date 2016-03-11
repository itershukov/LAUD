package com.example.laud.laud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.io.IOException;

public class LAUD extends AppCompatActivity {

    MediaControl md;
    Stream baseStream;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laud);
        md = new MediaControl();
        Stream one = new Stream("http://streams.lrn.fm:8100/", "Стрим 1", "ссылка на картинку");
        baseStream = one;
    }

    public void startStream(View view) {
        try {
            md.playStream(baseStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stopStream(View view) {
        md.stopStream();
    }
}
