package com.example.laud.laud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LAUD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laud);
    }
}

//package com.example.laud.laud;
//
//        import android.app.Activity;
//        import android.content.Context;
//        import android.media.AudioManager;
//        import android.media.MediaPlayer;
//        import android.net.Uri;
//        import android.os.Bundle;
//        import android.support.design.widget.FloatingActionButton;
//        import android.support.design.widget.Snackbar;
//        import android.support.v7.app.AppCompatActivity;
//        import android.support.v7.widget.Toolbar;
//        import android.util.Log;
//        import android.view.View;
//        import android.view.Menu;
//        import android.view.MenuItem;
//        import android.widget.Button;
//
//        import java.io.IOException;
//
//public class ScrollingActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_scrolling);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Log.i("Click to action","Try play mus");
//                String url = "http://streams.lrn.fm:8100/";//"rtsp://192.168.110.49:8554/5";
////                String url = "rtsp://192.168.110.49:8554/5";
//                MediaPlayer mp = new MediaPlayer();
//                try {
//                    mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                    mp.setDataSource(getApplicationContext(), Uri.parse(url));
//                    mp.prepare();
//                    mp.start();
//                } catch (Exception e) {
//                    Log.i("Exception", "Exception in streaming mediaplayer e = " + e);
//                    e.printStackTrace();
//                }
//            }
//        });
//
//
//    }
//
//    /** Called when MediaPlayer is ready */
//    public void onPrepared(MediaPlayer player) {
//        player.start();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}
