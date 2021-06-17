package com.polovyi.ivan.proxypattern.stetic;

import javafx.geometry.Point2D;

//Proxy class.
public class ImageProxy implements Image {

    private BitmapImage bitmapImage;

    private String fileName;

    private Point2D location;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2D point2d) {
        if (bitmapImage != null) {
            bitmapImage.setLocation(point2d);
        } else {
            this.location = location;
        }
    }

    @Override
    public Point2D getLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (bitmapImage != null) {
            bitmapImage = new BitmapImage(fileName);
            if (location != null) {
                bitmapImage.setLocation(location);
            }
        }
        bitmapImage.render();
    }
}
