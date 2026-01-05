package com.linkedlist.SinglyLinkedList.SocialMediaFriends;

//Represents a single friend in a user's friend list
class FriendNode {
	int friendId;
	FriendNode next;

	public FriendNode(int friendId) {
		this.friendId = friendId;
		this.next = null;
	}
}