package com.ivan.polovyi.compositepattern;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    public void ls() {
        System.out.println(getName() + "/t" + size);
    }

    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support add operation");
    }

    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node does not support get operation");
    }

    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support remove operation");
    }
}
