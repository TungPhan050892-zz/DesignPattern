package com.tungphan.designpatternsample.structural.proxy;

import java.net.URL;

/**
 * Created by TungPhan on 1/5/18.
 */

public class RealImage implements Image {

    private URL url;

    public RealImage(URL url){
        this.url = url;
    }

    @Override
    public void displayImage() {

    }

}
