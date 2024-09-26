package exercise2;

import exercise1.Test;

import java.util.Scanner;

/*
Author: Cheuk Man Edmond, To - 301378748
Date:   Sep 25, 2024

Description:

COMP228-006-2024F
Lab 2 - Exercise 2

Design a Lotto class with one array instance variable to hold three random integer values (from 1 to 9).
Include a constructor that randomly populates the array for a lotto object.
Also, include a method in the class to return the array.
Use this class to simulate a simple lotto game in which the user chooses a number between 3 and 27.
The user runs the lotto up to 5 times and each time the sum of lotto numbers is calculated.
If the number chosen by the user matches the sum, the user wins and the game ends.
If the number does not match the sum within five rolls, the computer wins.
Use methods of JOptionPane class to interact with the user.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lotto lotto = new Lotto();
        lotto.lottoGame();
    }
}
