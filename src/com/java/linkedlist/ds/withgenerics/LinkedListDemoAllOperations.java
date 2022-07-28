package com.java.linkedlist.ds.withgenerics;

public class LinkedListDemoAllOperations<T>{
	public static void main(String[] args) throws Exception {
		LinkedListAllOperations<Integer> linkedListDemo = new LinkedListAllOperations<Integer>();

		System.out.println("---------- Linked List Manipulation ------------- ");

		linkedListDemo.addFirst(34);
		System.out.print("After Adding 34 at first : ");
		linkedListDemo.printList();

		linkedListDemo.addFirst(36);
		System.out.print("After Adding 36 at first : ");
		linkedListDemo.printList();

		linkedListDemo.addLast(47);
		System.out.print("After Adding 47 at last : ");
		linkedListDemo.printList();

		linkedListDemo.addLast(67);
		System.out.print("After Adding 67 at last : ");
		linkedListDemo.printList();

		int num = 12343;
		int pos = 2;

		linkedListDemo.addMiddie(pos, num);
		System.out.print("After adding " + num + " at  " + pos + " position : ");
		linkedListDemo.printList();

		int data = 34;
		System.out.println("After searching for " + data + " result : " + linkedListDemo.searchList(data));

		linkedListDemo.deleteFirstNode();
		System.out.print("After deleting First Node : ");
		linkedListDemo.printList();

		linkedListDemo.deleteLastNode();
		System.out.print("After deleting Last Node : ");
		linkedListDemo.printList();

		int posi = 2;
		linkedListDemo.deleteNodeAt(posi);
		System.out.print("After deleting at " + pos + " position : ");
		linkedListDemo.printList();

		System.out.println(" Size of list is : " + linkedListDemo.getSize());
	}

}
