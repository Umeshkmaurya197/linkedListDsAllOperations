package com.java.linkedlist.ds.withgenerics;


public class Node<T> {

	T data;
	Node<T> next;

	public Node() {
		super();
	}

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return data + "";
	}
}