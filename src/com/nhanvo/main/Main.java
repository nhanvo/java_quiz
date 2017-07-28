package com.nhanvo.main;

import com.nhanvo.quiz.SingleLinkedList;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.appendAtStart(10);
		list.appendAtStart(20);
		list.display();
	}

}
