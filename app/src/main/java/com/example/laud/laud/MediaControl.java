package com.example.laud.laud;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by sinires on 10.03.16.
 */
public class MediaControl {
    private static MediaPlayer player = null;
    private Context context;

    public MediaControl(Context context){
        if(this.player == null){
            this.player = new MediaPlayer();
        }
        this.context = context;
    };

    public void playStream(Stream stream) throws IOException {
        stopStream();
        this.player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        this.player.setDataSource(context, stream.url);
        player.prepare();
        player.start();
    }

    public void stopStream(){
       this.player.reset();
    }

}

//Log.i("Click to action","Try play mus");
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