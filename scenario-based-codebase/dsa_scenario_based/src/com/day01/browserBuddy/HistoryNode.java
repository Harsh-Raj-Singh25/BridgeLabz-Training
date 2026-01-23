package com.day1.browserBuddy;

public class HistoryNode {
	String url;
	HistoryNode prev;
	HistoryNode next;
	
	HistoryNode(String url){
		this.url=url;
		this.next=null;
		this.prev=null;
	}
	
}
