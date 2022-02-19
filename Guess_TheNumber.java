package com.Projects;

import java.util.Random;
import java.util.Scanner;

class game1{
    private int num;
    private int inputNum;
    private int noOfGuesses = 0;

    game1(){
        Random rd = new Random();
        this.num = rd.nextInt(100);
    }
     void userInput(){
        System.out.println("Guess the num : ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }
    boolean isCorrectNum(){
        noOfGuesses++;
        if (num==inputNum){
            System.out.printf("You guess right \n it was %d You guess it in %d times",num,noOfGuesses);
            return true;
        }
        else if(inputNum<num){
            System.out.println("Too low...");
        }
        else if(inputNum>num){
            System.out.println("Too high...");
        }
        return false;
    }

}





public class Guess_TheNumber {
    public static void main(String[] args) {

        game1 g = new game1();
         boolean b = false;
       while (!b){
           g.userInput();
           b = g.isCorrectNum();
       }


    }
}
