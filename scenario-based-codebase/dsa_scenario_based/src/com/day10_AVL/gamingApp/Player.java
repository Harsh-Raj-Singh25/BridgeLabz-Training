package com.day10_AVL.gamingApp;
/*
 * Story: Gaming App - Real-Time Leaderboard
Gamers earn and lose points rapidly.
Scenarios:
● 🔹 Scenario 1: Insert/Update Player — New players join or existing ones gain points.
● 🔹 Scenario 2: Display Top Players — Return top 10 players in rank.
● 🔹 Scenario 3: Remove Player — Handle user bans or exits efficiently.
 */
class Player {
    String username;
    int score;
    int height;
    Player left, right;

    Player(String username, int score) {
        this.username = username;
        this.score = score;
        this.height = 1;
    }
}


