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
    private static Stream playingStream;
    public MediaControl(){
        if(this.player == null){
            this.player = new MediaPlayer();
        }
    };

    public void playStream(Stream stream) throws IOException {
        if(stream.isPlaying){
            stopStream();
            return;
        }
        if(playingStream != null && playingStream.isPlaying)
            stopStream();

        this.player.setAudioStreamType(AudioManager.STREAM_MUSIC);
        this.player.setDataSource(stream.url);
        player.prepare();
        player.start();
        stream.isPlaying = true;
        playingStream = stream;
    }

    public void stopStream(){
       this.player.reset();
        playingStream.isPlaying = false;
    }

}
