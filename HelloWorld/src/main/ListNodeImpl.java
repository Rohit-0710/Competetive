package main;

import model.ListNode;

public class ListNodeImpl {
	
	public static void main(String[] args) {
		ListNode node = new ListNode(0);
		ListNode temp = node;
		
		temp.next = null;
		temp.val = 1;
		
		System.out.println(node.toString());
		System.out.println(temp.toString());
	}

}
