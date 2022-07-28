package com.java.linkedlist.ds;

class LinkedListDemo {
	Node head;
	private int size;

	public LinkedListDemo() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// add - first , last
	public void addFirst(String data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		// newNode.next=null;
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		}
		size--;
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is empty ");
		}
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -->");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		linkedListDemo.addFirst(" a ");
		linkedListDemo.addFirst(" is ");

		linkedListDemo.printList();

		linkedListDemo.addFirst(" This");
		linkedListDemo.addLast(" list");
		linkedListDemo.printList();

		linkedListDemo.deleteFirst();
		linkedListDemo.printList();

		linkedListDemo.deleteLast();
		linkedListDemo.printList();

		System.out.println(" Size Of List : " + linkedListDemo.getSize());

		linkedListDemo.addFirst(" This");
		linkedListDemo.printList();

		System.out.println(" Size Of List : " + linkedListDemo.getSize());

	}
}
