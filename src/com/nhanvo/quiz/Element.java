package com.nhanvo.quiz;

public class Element {
	private int data;
	private Element link;
	
	/*
	 * Constructor no argument
	 */
	public Element() {
		data = 0;
		this.link = null;
	}
	
	/* Constructor with two argument
	 * data: value of node
	 * link: point to next or previous node
	 */
	public Element(int data, Element link) {
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
	public Element getLink() {
		return link;
	}
	
	/*
	 * Set link to next node
	 */
	public void setLink(Element link) {
		this.link = link;
	}
	
	
}
