package com.ivan.polovyi.bridgepattern;

public class Client {

	public static void main(String[] args) {
		FifoCollection<Integer> queue = new Queue<>(new SinglyLinkedList<Integer>());

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);

		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

}
