package collaboration;

import java.util.Scanner;

public class Project2 {
    static final String WORD = "hello";
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.print("Enter a word>>");
        userInput = input.nextLine();
        if(userInput.equalsIgnoreCase(WORD)){
            System.out.println("Good job you guessed the word>>");
        }else{
            System.out.println("You didnt guess the correct word please try again.");
        }
    }
}
