package exercise1;

import java.util.Scanner;

/*
Author: Cheuk Man Edmond, To - 301378748
Date:   Sep 25, 2024
Description:
COMP228-006-2024F
Lab 2 - Exercise 1
Write a Java application that simulates a test.
The test contains at least five questions about first three lectures of this course.
Each question should be a multiple-choice question with 4 options.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Test test = new Test(); //create a Test object
        test.inputAnswer(); //start the test by calling inputAnswer method

    }
}