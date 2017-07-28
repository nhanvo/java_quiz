package com.nhanvo.quiz;

public class Node {
	private int data;
	private Node link;
	
	/*
	 * Constructor no argument
	 */
	public Node() {
		data = 0;
		this.link = null;
	}
	
	/* Constructor with two argument
	 * data: value of node
	 * link: point to next or previous node
	 */
	public Node(int data, Node link) {
		this.data = data;
		this.link = link;
	}
	
	/*
	 * Get data of current node
	 */
	public int getData() {
		return data;
	}
	
	/*
	 * Set data of current node
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/*
	 * Get link to next node
	 */
	public Node getLink() {
		return link;
	}
	
	/*
	 * Set link to next node
	 */
	public void setLink(Node link) {
		this.link = link;
	}
	
	
}
