package com.linkedlist.SinglyLinkedList.SocialMediaFriends;

class SocialMedia {
	private UserNode head; // Global list of users

	// Helper: Find a user node by ID
	private UserNode findUser(int id) {
		UserNode temp = head;
		while (temp != null) {
			if (temp.userId == id)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	// ADD USER: Add a new profile to the platform
	public void addUser(int id, String name, int age) {
		UserNode newUser = new UserNode(id, name, age);
		if (head == null) {
			head = newUser;
		} else {
			UserNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newUser;
		}
	}

	//  ADD FRIEND: Create a two-way connection
	public void addFriend(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		if (u1 != null && u2 != null) {
			addFriendToUser(u1, id2);
			addFriendToUser(u2, id1);
			System.out.println("Success: " + u1.name + " and " + u2.name + " are now friends.");
		}
	}

	private void addFriendToUser(UserNode user, int friendId) {
		FriendNode newFriend = new FriendNode(friendId);
		if (user.friendListHead == null) {
			user.friendListHead = newFriend;
		} else {
			FriendNode temp = user.friendListHead;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newFriend;
		}
	}

	// FIND MUTUAL FRIENDS
	public void findMutualFriends(int id1, int id2) {
		UserNode u1 = findUser(id1);
		UserNode u2 = findUser(id2);

		if (u1 == null || u2 == null)
			return;

		System.out.print("Mutual friends of " + u1.name + " and " + u2.name + ": ");
		FriendNode f1 = u1.friendListHead;
		while (f1 != null) {
			FriendNode f2 = u2.friendListHead;
			while (f2 != null) {
				if (f1.friendId == f2.friendId) {
					UserNode mutual = findUser(f1.friendId);
					System.out.print(mutual.name + " ");
				}
				f2 = f2.next;
			}
			f1 = f1.next;
		}
		System.out.println();
	}

	//   DISPLAY FRIENDS
	public void displayFriends(int id) {
		UserNode user = findUser(id);
		if (user == null)
			return;

		System.out.print(user.name + "'s Friends: ");
		FriendNode temp = user.friendListHead;
		int count = 0;
		while (temp != null) {
			UserNode f = findUser(temp.friendId);
			System.out.print(f.name + " ");
			temp = temp.next;
			count++;
		}
		System.out.println("| Total: " + count);
	}
}