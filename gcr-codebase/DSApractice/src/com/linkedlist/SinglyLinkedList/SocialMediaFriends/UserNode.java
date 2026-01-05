package com.linkedlist.SinglyLinkedList.SocialMediaFriends;

//Represents a User on the platform
class UserNode {
	int userId;
	String name;
	int age;
	FriendNode friendListHead; // Head of the nested friend list
	UserNode next; // Pointer to the next user in the global system

	public UserNode(int userId, String name, int age) {
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.friendListHead = null;
		this.next = null;
	}
}