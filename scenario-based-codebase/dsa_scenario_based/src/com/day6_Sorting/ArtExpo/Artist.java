package com.day6_Sorting.ArtExpo;

public class Artist {
	String id;
	String time;
	
	Artist(String id, String time){
		this.id=id;
		this.time=time;
	}
	
	void display() {
		System.out.println("ID:"+id+"| time:"+time);
	}
	
}
