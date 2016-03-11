package com.example.laud.laud;

import android.net.Uri;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by sinires on 10.03.16.
 */
public class Stream {
    public String url;
    public String name;
    public String description;

    public static ArrayList <Stream> streamList;

    public Stream(String url, String name, String description){
        this.url = url;
        this.name = name;
        this.description = description;
//        this.streamList.add(this);
    }


}
