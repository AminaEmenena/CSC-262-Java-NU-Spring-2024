import java.util.Scanner;

public class AdventureGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        displayWelcomeMessage(); //displays welcome message when game is started
        firstChoice(); //stores user's first choice when prompted
    }

    private static void displayWelcomeMessage(){
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Your quest is to find the hidden treasure.");
    }

    private static void firstChoice() {
        System.out.println("You're standing in a dark forest and you lost your flashlight. Do you want to go 'left' or 'right'?");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("right")){
            goRight();
        } else if (choice.equalsIgnoreCase("left")){
            goLeft();
        } else {
            System.out.println("Invalid choice, please type 'left' or 'right'. " );
            firstChoice(); //ask the user the choice again
        }
        
    }

    private static void goLeft() {
        System.out.println("You've encountered a wild river surrounded by killer wolves. Health:-100, Game Over.");
        // Optionally, you can add more options or an option to restart the game.
    }

    private static void goRight(){
        System.out.println("You've found a small but dark hut. You go inside and fall through a trap door." +"\n" + "When you land, you discover a small treasure box. Congratulation! You Win.");
    }
}