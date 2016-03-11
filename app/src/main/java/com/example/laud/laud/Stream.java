package com.example.laud.laud;

import android.net.Uri;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by sinires on 10.03.16.
 */
public class Stream {
    public String url;
    public String name;
    public String description;
    public boolean isPlaying = false;

    public static ArrayList <Stream> streamList = new ArrayList<>();

    public Stream(String url, String name, String description){
        this.url = url;
        this.name = name;
        this.description = description;
        this.streamList.add(this);
    }

    public static String[] getStreamArrayName() {
        ArrayList <String> list = new ArrayList<String>();
        for(Stream stream:streamList){
            list.add(stream.name);
        }
        String[] array = {};
        array = list.toArray(new String[list.size()]);
        return array;
    }

    public static Stream getStreamByName(String name){
        for(Stream stream:streamList){
            if(stream.name.equals(name))
                return stream;
        }
        return null;
    };

}
