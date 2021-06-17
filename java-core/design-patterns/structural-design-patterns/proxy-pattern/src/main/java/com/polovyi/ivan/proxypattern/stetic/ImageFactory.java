package com.polovyi.ivan.proxypattern.stetic;

//Factory to get image objects. 
public class ImageFactory {
    //We'll provide proxy to caller instead of real object
    static public Image getImage(String fileName) {
        return new ImageProxy(fileName);
    }
}
