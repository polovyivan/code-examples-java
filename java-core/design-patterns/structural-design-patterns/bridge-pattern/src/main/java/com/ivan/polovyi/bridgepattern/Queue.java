package com.ivan.polovyi.bridgepattern;

//A refined abstraction.
public class Queue<T> implements FifoCollection<T>{

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    private LinkedList <T> list;

    @Override public void offer(T element) {
        list.addLast(element);
    }

    @Override public T poll() {
        return list.removeFirst();
    }
}
