package exercise1;

import javax.swing.*;
import java.util.Random;

public class Test {

    String[][] question = new String[5][2];
    String[][] answer = new String[5][4];


    //Constructor for store questions and answers array
    public Test() {
        question[0][0] = "What country does Toronto belongs to?"; //Question
        question[0][1] = "2"; //Correct answer
        answer[0][0] = "China"; //choices
        answer[0][1] = "Canada";
        answer[0][2] = "United Kingdom";
        answer[0][3] = "France";

        question[1][0] = "What is the capital of France?";
        question[1][1] = "3";
        answer[1][0] = "New York";
        answer[1][1] = "Ottawa";
        answer[1][2] = "Paris";
        answer[1][3] = "Tokyo";

        question[2][0] = "What is the capital of Japan?";
        question[2][1] = "4";
        answer[2][0] = "Canberra";
        answer[2][1] = "New Market";
        answer[2][2] = "Brasília";
        answer[2][3] = "Tokyo";

        question[3][0] = "What is the boiling point of water in Celsius?";
        question[3][1] = "1";
        answer[3][0] = "100";
        answer[3][1] = "80";
        answer[3][2] = "40";
        answer[3][3] = "50";

        question[4][0] = "What is the largest planet in our solar system?";
        question[4][1] = "3";
        answer[4][0] = "Mercury";
        answer[4][1] = "Mars";
        answer[4][2] = "Jupiter";
        answer[4][3] = "Venus";
    }

    //-	create a method to simulate the questions
    public void simulateQuestion(int questionNum) {
        String choice="";
        for (int i = 0; i < answer[i].length; i++) {
            choice += (i+1)+". "+answer[questionNum][i]+"\n";
        }
        JOptionPane.showMessageDialog(null, question[questionNum][0]+"\n"+choice); //Display the questions using methods of JOptionPane class.
    }

    //-	create a method to check the answer
    public boolean checkAnswer(int questionNum, String answer) {
        if(answer.equals(question[questionNum][1]))
        {
            return true;
        } else {
            return false;
        }
    }

    //-	create a method to display a random message for the user
    public String generateMessage(int result) {
        Random randomObject = new Random(); //-	Use random-number generation to choose a number from 1 to 4 that will be used to select an appropriate response to each answer.
        if (result == 0){ //-	If the user finds the right answer, display a random congratulatory message
            switch (randomObject.nextInt(4)) { //-	Use a switch statement to issue the responses
                case 0:
                    return "Excellent!";
                case 1:
                    return "Good!";
                case 2:
                    return "Keep up the good work!";
                case 3:
                    return "Nice work!";
            }
        }else{ //-	If the user responds incorrectly, display an appropriate message and the correct answer
            switch (randomObject.nextInt(4)) { //-	Use a switch statement to issue the responses
                case 0:
                    return "No. Please try again";
                case 1:
                    return "Wrong. Try once more";
                case 2:
                    return "Don't give up!";
                case 3:
                    return "No. Keep trying..";
            }
        }
        return null;
    }

    //-	create a method to interact with the user
    public void inputAnswer() { //main
        String correctAns;
        String input;
        int correctCount = 0;
        int wrongCount = 0;
        int percent = 0;

        //Use a loop to show all the questions.
        for (int i = 0; i < 5; i++) {
            simulateQuestion(i);
            input = JOptionPane.showInputDialog("Please input the number of answer: ");
            if (checkAnswer(i, input)) {
                correctCount++;
                JOptionPane.showMessageDialog(null, generateMessage(0));
            }else{
                JOptionPane.showMessageDialog(null, generateMessage(1));
            }
        }

        //At the end of the test display the number of correct and incorrect answers,
        // and the percentage of the correct answers.
        wrongCount = question.length - correctCount;
        percent = (int)((double)correctCount/question.length *100);
        JOptionPane.showMessageDialog(null, "Correct: "+correctCount+"\nIncorrect: "+wrongCount+"\nPercentage of correct answer: "+percent+"%");

    }



}