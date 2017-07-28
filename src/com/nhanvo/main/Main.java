package com.nhanvo.main;

import com.nhanvo.quiz.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		// Initialize single linked list
		SingleLinkedList list = new SingleLinkedList();
		System.out.println("Design an int type singly linkedlist class, and then implement some functions below using the self designed class." +
							"\nCan not use Java built in List interface\n");
		
		System.out.println("1. Append an element into the linked list");
		list.append(54);
		list.append(124);
		list.append(137);
		list.append(289);
		list.append(389);
		list.append(312);
		list.append(147);
		list.append(512);
		
		// Display data
		list.display();
		
		System.out.println("2. Remove the tail element from a linked list");
		list.removeTail();
		list.display();
		
		System.out.println("3. Remove all element in the linked list that is great than a target value equal 218");
		list.removeAll(218);
		list.display();
	}

}
