package com.day10_AVL.gamingApp;

//--- MAIN CLASS ---
public class GamingApp {
	public static void main(String[] args) {
		LeaderboardAVL leaderboard = new LeaderboardAVL();

		// Adding/Updating Players
		leaderboard.addOrUpdatePlayer("ShadowHunter", 1500);
		leaderboard.addOrUpdatePlayer("ProGamer99", 2200);
		leaderboard.addOrUpdatePlayer("NoobMaster", 800);
		leaderboard.addOrUpdatePlayer("GhostRider", 3000);
		leaderboard.addOrUpdatePlayer("PixelQueen", 1200);

		leaderboard.displayRankings();

		// Remove a player (Scenario 3: Ban "NoobMaster" with score 800)
		System.out.println("\n  Banning NoobMaster (Score: 800)...");
		leaderboard.removePlayer(800);

		// Leaderboard re-displays and remains balanced
		leaderboard.displayRankings();
	}
}
