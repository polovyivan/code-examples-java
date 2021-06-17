package com.ivan.polovyi.objectpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.function.Supplier;

public class ObjectPool<T extends Poolable> {
    //in memory cache
    private BlockingQueue<T> availablePool;

    public ObjectPool(Supplier<T> creator, int count) {
        availablePool = new LinkedTransferQueue<>();
        for (int i =0;i<count;i++){
            availablePool.offer(creator.get());
        }
    }

    public T get() {
        try {
            return availablePool.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void release(T obj) {
        obj.reset();
        try {
            availablePool.put(obj);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
