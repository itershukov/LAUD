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

    public MediaControl(){
        if(this.player == null){
            this.player = new MediaPlayer();
        }
    };

    public void playStream(Stream stream) throws IOException {
        stopStream();
        this.player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        this.player.setDataSource(stream.url);
        player.prepare();
        player.start();
    }

    public void stopStream(){
       this.player.reset();
    }

}
