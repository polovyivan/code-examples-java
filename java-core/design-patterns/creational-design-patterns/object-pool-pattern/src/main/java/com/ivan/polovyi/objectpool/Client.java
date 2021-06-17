package com.ivan.polovyi.objectpool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> OBJECT_POOL = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        Bitmap bitmap1 = OBJECT_POOL.get();
        bitmap1.setLocation(new Point2D(1, 1));
        Bitmap bitmap2 = OBJECT_POOL.get();
        bitmap2.setLocation(new Point2D(2, 2));
        bitmap1.draw();
        bitmap2.draw();

        OBJECT_POOL.release(bitmap1);
        OBJECT_POOL.release(bitmap2);

    }
}
