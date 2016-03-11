package com.example.laud.laud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

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
        Stream stream1 = new Stream("http://streams.lrn.fm:8100/", "Стрим 1", "ссылка на картинку");
        Stream stream2 = new Stream("rtsp://195.209.248.200:554/tvorigin/33", "Стрим 2", "ссылка на картинку");
        Stream stream3 = new Stream("http://streams.lrn.fm:8100/", "Стрим 3", "ссылка на картинку");
        Stream stream4 = new Stream("rtsp://195.209.248.200:554/tvorigin/33", "Стрим 4", "ссылка на картинку");
        Stream stream5 = new Stream("http://streams.lrn.fm:8100/", "Стрим 5", "ссылка на картинку");
        Stream stream6 = new Stream("rtsp://195.209.248.200:554/tvorigin/33", "Стрим 6", "ссылка на картинку");
        baseStream = stream1;

        ListView streamList = (ListView) findViewById(R.id.streamList);
        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_checked, Stream.getStreamArrayName());
        streamList.setAdapter(adapter);

        streamList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = ((TextView) view).getText().toString();
                Log.d(TAG, "Try click in "+name+" stream" );
                Stream stream = Stream.getStreamByName(name);
                try {
                    md.playStream(stream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        Button btnNew = new Button(this);
        btnNew.setText("str 1");

    }

}
