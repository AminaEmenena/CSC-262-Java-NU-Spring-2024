import java.util.Scanner;

public class AdventureGame {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        displayWelcomeMessage(); //displays welcome message when game is started
        //firstChoice(); //stores user's first choice when prompted
        //makeChoice();
        startAdventure();
    }

    private static void displayWelcomeMessage(){
        System.out.println("Welcome to the Adventure Game!");
        System.out.println("Your quest is to find the hidden treasure.");
    }

    /*private static void firstChoice() {
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
        
    }*/

    private static void startAdventure(){
        System.out.println("You're standing in a dark forest and you lost your flashlight...........");
        System.out.println("Do you want to go 'forward', 'backward', 'left' or 'right'?");
        makeChoice();
    }

    private static void makeChoice() {
        String choice = scanner.nextLine();
        switch (choice.toLowerCase()) {
            case "forward":
                goForward();
                makeChoice();
                break;
            case "backward":
                goBackward();
                makeChoice();
                break;
            case "left":
                goLeft();
                break;
            case "right":
                goRight();
                makeChoice();
                break;
            default:
                System.out.println("Invalid choice please type 'forward', 'backward', 'left' or 'right'");
                makeChoice(); //ask user again
                break;

        }
    }

    private static void goLeft() {
        System.out.println("You've encountered a wild river surrounded by killer wolves. Health:-100, Game Over.");
        // Optionally, you can add more options or an option to restart the game.
    }

    private static void goRight(){
        System.out.println("You've found a small but dark hut. You go inside and fall through a trap door." +"\n" + "When you land, you discover a small treasure box. Congratulation! You Win.");
    }

    private static void goForward(){
        System.out.println("You move 10 steps forward and find an apple of life. Health:+10, Keep searching for the treasure.");
    }

    private static void goBackward(){
        System.out.println("You move 10 steps backward, and step on a Scorpion. Health:-50, You now feel weak and dizzy. Keep search for the treasure.");
    }
}