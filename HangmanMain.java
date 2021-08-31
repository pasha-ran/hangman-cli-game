
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class HangmanMain {
    public static void main(String[] args) throws IOException{
        Boolean cont = true;
        while (cont == true) {
            System.out.println("Welcome to the Hangman game: Enter a letter to start guessing");
            String guessword = "";
            int i;
            String guess;
            String cool;
            String haveguess = "";
            String confirm;
            String Progress = " ";
            int failcounter = 1;
            int successcounter = 0;
            int indexofletter = 0;
            boolean chair = false;
            boolean looper = true;
            boolean table = false;
            String[] wordarray = { "horse" , "bear", "cat", "dog", "duck", "fox", "frog", "lion", "zebra"};
            Random rand = new Random(); 
            int number = rand.nextInt(9);
            guessword = wordarray[number];
            //System.out.print(guessword);
            for (i = 0; i < guessword.length(); i++) {
                Progress = Progress + " _";}
            System.out.println(Progress);
            char[] ProgressArray = Progress.toCharArray();
            String [] lettersword = new String[guessword.length()];
            for (i = 0; i < guessword.length(); i++) {
            lettersword[i] = Character.toString(guessword.charAt(i)); }
            do {
                Scanner input = new Scanner(System.in);
            guess = input.next(); 
            for (i = 0; i < guessword.length(); i++) {
            if (guess.contains(" ")) {
            chair = false;
            } else if (lettersword[i].contains(guess) ) {  
                System.out.println("correct!");  
                char c = guess.charAt(0);
                chair = true;
                indexofletter = guessword.indexOf(guess);
                ProgressArray[(indexofletter+1)*2] = c;
                System.out.println(String.valueOf(ProgressArray));
                System.out.println(" " + guess + " is a letter inside the word.   ");
                System.out.println("---------------------------------------------------");
                lettersword[indexofletter] = " ";
            }
            } 
            if (chair == true) {successcounter++;}
            if (chair == false) { System.out.println("Wrong! You have "  + failcounter + " strike(s). 6 strikes means failure. You have " + (6 - failcounter) + " strike(s) left. \n \nDo not guess the letters that have already been guessed. Guess Again! \b ");
                failcounter++; System.out.println("---------------------------------------------------");
            haveguess = haveguess + " " + guess; 
            System.out.println("LETTERS GUESSED: " + haveguess);
            }
            chair = false;


        if (successcounter >= guessword.length()) { System.out.println("\n Congratulations! You won!"); System.out.println("---------------------------------------------------");
        table = true;}
        //if ( chair == false) {System.out.println("wrong! You have "  + failcounter + "strike(s). 6 strikes means death. Guess Again!"); failcounter++;}
        if (failcounter > 6) {System.out.println(" \n The word you were trying to guess was " + guessword + ". You just lost. \n \n GAME OVER"); System.out.println("---------------------------------------------------");
        table = true;
        }
        if (failcounter == 2) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println("O"); System.out.println("---------------------------------------------------");
        table = false;
        } 
        if (failcounter == 3) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println("O"); System.out.println("|"); System.out.println("|"); System.out.println("---------------------------------------------------");
        table = false;
        } 
        if (failcounter == 4) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println(" \\  O"); System.out.println("  \\ |"); System.out.println("    |");  System.out.println("---------------------------------------------------");
        table = false;
        } 
        if (failcounter == 5) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println(" \\  O  /"); System.out.println("  \\ | /"); System.out.println("    |");  System.out.println("---------------------------------------------------");
        table = false;
        } 
        if (failcounter == 6) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println(" \\  O  /"); System.out.println("  \\ | /"); System.out.println("    |"); System.out.println("   /"); System.out.println("  /"); System.out.println("---------------------------------------------------");
        table = false;
        } 
        if (failcounter == 7) { System.out.println("STICK FIGURE DISPLAY:"); System.out.println(" \\  O  /"); System.out.println("  \\ | /"); System.out.println("    |"); System.out.println("   / \\"); System.out.println("  /   \\"); System.out.println("---------------------------------------------------");
        table = true;
        } 
            } while (table == false);
        while (looper == true) {
        System.out.println(" \n Would you like to play again? Type yes to play again or no to quit.");
        Scanner input2 = new Scanner(System.in);
        confirm = input2.next();
        String newman = confirm.toString();
        System.out.println("---------------------------------------------------");
         if (confirm.equalsIgnoreCase("yes")) {System.out.println("\n GAME IS RESTARTING... \n"); System.out.println("---------------------------------------------------"); cont = true; looper = false; } 
         else if (confirm.equalsIgnoreCase("no")) {System.out.println("\n Thanks for playing.I hope your experience with the Hangman game was fun. GoodBye.");cont = false; looper = false; }
        else { looper = true;}
         
        }
    }
            
    }  
}
