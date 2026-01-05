package com.linkedlist.SinglyLinkedList.SocialMediaFriends;

public class  Main {
    public static void main(String[] args) {
        SocialMedia network = new SocialMedia();

        // Adding Users
        network.addUser(1, "Harsh", 25);
        network.addUser(2, "Namrata", 24);
        network.addUser(3, "Anand", 26);
        network.addUser(4, "Riya", 23);

        // Building Connections
        network.addFriend(1, 2); // Harsh and Namrata
        network.addFriend(1, 3); // Harsh and Anand
        network.addFriend(4, 2); // Riya and Namrata
        network.addFriend(4, 3); // Riya and Anand

        // Display Friends
        network.displayFriends(1);
        network.displayFriends(4);

        // Find Mutual Friends between Harsh (1) and Riya (4)
        // Expected: Namrata and Anand
        network.findMutualFriends(1, 4);
    }
}