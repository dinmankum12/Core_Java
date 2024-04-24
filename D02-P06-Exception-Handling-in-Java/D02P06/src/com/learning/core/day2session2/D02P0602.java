package com.learning.core.day2session2;

import java.util.Scanner;

class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}
 
class CricketRating {
    private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;
 
    public CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        calculateCoins();
    }
 
    public CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        calculateCoins();
    }
 
    private void calculateAverageRating(float critic1, float critic2) {
        avgRating = (critic1 + critic2) / 2;
    }
 
    private void calculateAverageRating(float critic1, float critic2, float critic3) {
        avgRating = (critic1 + critic2 + critic3) / 3;
    }
 
    private void calculateCoins() {
        if (avgRating >= 7) {
            coins = "Gold Coin";
        } else if (avgRating >= 5) {
            coins = "Silver Coin";
        } else if (avgRating >= 2) {
            coins = "Copper Coin";
        } else {
            coins = "Not Eligible";
        }
    }
 
    public void display() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Average Rating: " + avgRating);
        System.out.println("Coins: " + coins);
    }
}
 
public class D02P0602 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        System.out.print("Enter critic 1 rating: ");
        float critic1 = scanner.nextFloat();
        System.out.print("Enter critic 2 rating: ");
        float critic2 = scanner.nextFloat();
 
        CricketRating player1 = new CricketRating(playerName, critic1, critic2);
        player1.display();
 
        scanner.close();
    }
}