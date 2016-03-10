package com.example.laud.laud;

import android.net.Uri;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by sinires on 10.03.16.
 */
public class Stream {
    public Uri url;
    public String name;
    public String description;

    private static ArrayList <Stream> streamList;

    public Stream(Uri url, String name, String description){
        this.url = url;
        this.name = name;
        this.description = description;
        streamList.add(this);
    }


}
