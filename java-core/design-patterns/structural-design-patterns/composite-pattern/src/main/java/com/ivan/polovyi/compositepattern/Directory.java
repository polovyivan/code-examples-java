package com.ivan.polovyi.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite in the composite pattern
public class Directory extends File {

    private List<File> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void ls() {
        System.out.println("getName() = " + getName());
        children.forEach(File::ls);
    }

    public void addFile(File file) {
        children.add(file);
    }

    public File[] getFiles() {
        return children.toArray(new File[children.size()]);
    }

    public boolean removeFile(File file) {
        return children.remove(file);
    }

}
