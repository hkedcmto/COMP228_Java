package exercise2;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class Lotto {
    //one array instance variable to hold three random integer values
    private int[] lottoNumbers = new int[3];

    //Include a constructor that randomly populates the array for a lotto object
    public Lotto() {
        Random rand = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = rand.nextInt(9)+1;
        }
    }

    //include a method in the class to return the array.
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int sumLottoNum(int[] lottoNumArr) { //the sum of lotto numbers
        int result = 0;
        for (int i = 0; i < lottoNumArr.length; i++) {
            result += lottoNumArr[i];
        }
        return result;
    }

    //simulate lotto game
    public void lottoGame(){
        boolean inputValidate = false;
        int guessNumber = 0;

        for (int i = 0; i < 5; i++) { //runs the lotto up to 5 times
            Lotto lotto = new Lotto();
            int[] lottoNumArr = lotto.getLottoNumbers();
            int sumLottoNum = lotto.sumLottoNum(lottoNumArr);

            //ask user input guess number
            while(!inputValidate){
                try {
                    String input = JOptionPane.showInputDialog(null, "Enter lotto number between 3 and 27: ");
                    guessNumber = Integer.parseInt(input);
                    if (guessNumber < 3 || guessNumber > 27) {
                        JOptionPane.showMessageDialog(null, "Invalid input.\nPlease enter a number between 3 and 27");
                    } else {
                        inputValidate = true;
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Invalid input.\nPlease enter a number between 3 and 27");
                }
            }

            //compare user input with the sum
            if (guessNumber == sumLottoNum) { // If the number chosen by the user matches the sum, the user wins and the game ends
                JOptionPane.showMessageDialog(null, "You win! The game ends");
                return;
            }else {
                if(i < 4){ //if user still have chance
                    JOptionPane.showMessageDialog(null, "You lose!\nThe numbers are :"+ Arrays.toString(lottoNumArr)+" Sum: "+ sumLottoNum +"\nTry again");
                    inputValidate = false; //reset inputValidate for next roll
                }else{ // If the number does not match the sum within five rolls, the computer wins
                    JOptionPane.showMessageDialog(null, "You lose!\nThe numbers are :"+ Arrays.toString(lottoNumArr)+" Sum: "+ sumLottoNum +"\nComputer won finally");
                }
            }
        }
    }
}
