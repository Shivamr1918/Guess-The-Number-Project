import java.util.Random; // For random
import java.util.Scanner;//For user input

// Making game  class 
class game{

    // for random number
    private int num;

    // for user input
    private int inputNum;

    // for guess
    private int noOfGuesses = 0;

    // Constructor for running random
    game(){
        Random rd = new Random();
        this.num = rd.nextInt(100);
    }
     
    // Getting user input
    void userInput(){
        System.out.println("Guess the num : ");
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
    }

    // For know guess or conditional
    boolean isCorrectNum(){
        noOfGuesses++;
        if (num==inputNum){
            System.out.printf("You guess right \n it was %d You guess it in %d times",num,noOfGuesses);
            return true;
        }
        else if(inputNum<num){
            System.out.println("Choose big num..");
        }
        else if(inputNum>num){
            System.out.println("choose small num..");
        }
        return false;
    }

}

// main function
public class guess_the_num {
    public static void main(String[] args) {

        // run class
        game g = new game();

        // for running isCorrectNum function 
         boolean b = false; // Because when guess draw its return true for running method we need to run false variable

       // when true its close
       while (!b){
           g.userInput();
           b = g.isCorrectNum();
       }


    }
}
