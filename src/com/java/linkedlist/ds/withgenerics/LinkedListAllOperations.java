package com.java.linkedlist.ds.withgenerics;
public class LinkedListAllOperations<T> {
	Node<T> head;
	int size;

	public LinkedListAllOperations() {
		this.size = 0;
	}

	// add - first
	public void addFirst(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	// add - Last
	public void addLast(T data) {
		Node<T> newNode = new Node<>(data);
		size++;
		if (head == null) {
			head = newNode;
			return;
		}
		Node<T> currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	// add - middle
	public void addMiddie(int position, T data) {
		Node<T> newNode = new Node<>(data);
		// validate Position using size
		if (position > getSize()) {
			System.out.println(" Given position " + position + " is out of bound ");
		}
		size++;
		if (position == 1) {
			addFirst(data);
			return;
		}
		if (head == null) {
			head = newNode;
			return;
		}
		int count = 1;
		Node<T> currentNode = head;
		while (count < position - 1) {
			currentNode = currentNode.next;
			count++;
		}
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}

	// delete First Node
	public void deleteFirstNode() {
		if (head == null) {
			System.out.println(" List is Empty ");
			return;
		}
		size--;
		head = head.next;
	}

	// delete Last Node
	public void deleteLastNode() {
		if (head == null) {
			System.out.println(" List is Empty ");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
		}
		Node<T> secondLastNode = head;
		Node<T> lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLastNode = secondLastNode.next;
		}
		secondLastNode.next = null;
	}

	// delete at index position
	public int deleteNodeAt(int position) {
		size--;
		if (head == null) {
			System.out.println(" List is Empty ");
			return position;
		}
		if (position == 1) {
			deleteFirstNode();
			return position;
		}
		Node<T> currentNode = head;
		Node<T> previous = null;
		int count = 1;
		while (count < position) {
			count++;
			previous = currentNode;
			currentNode = currentNode.next;
		}
		previous.next = currentNode.next;
		currentNode.next = null;
		return position;

	}

	// get the list Size
	public int getSize() {
		return size;
	}

	// Search in the list
	public boolean searchList(T data) {
		Node<T> currentNode = head;
		while (currentNode != null) {
			if (data == currentNode.data) {
				return true;
			}
			currentNode = currentNode.next;
		}
		return false;

	}

	// get the print List
	public void printList() {
		if (head == null) {
			System.out.println(" List is Empty ");
			return;
		}
		Node<T> currentNode = head;
		while (currentNode != null) {
			System.out.print("" + currentNode + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}
}