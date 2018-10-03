import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper, and 's' for scissors");

        /*
        r = rock
        p = paper
        s = scissors
        */

        String userChoice = input.nextLine();
        int computerChoice = (int) (Math.random() * 3);
        System.out.print("  Player choice:" + userChoice);
        System.out.println("     computer Choice:" + computerChoice);






        if (userChoice.equals("r")) {

            if (computerChoice == 0);
            System.out.println("Draw!");

            if (computerChoice == 1){
                System.out.println("You win!");
            }

            else
                System.out.println("You lose!");

        }

        else if (userChoice.equals ("p")) {

            if (computerChoice == 0)
                System.out.println("You win!");

            else if (computerChoice == 1){
                System.out.println("Draw!");
            }

            else
                System.out.println("You lose!");

        }


        else if (userChoice.equals("s")) {

            if (computerChoice == 0)
                System.out.println("You lose!");

            else if (computerChoice == 1){
                System.out.println("You win!");
            }

            else
                System.out.println("Draw!");

        }
        else{
            System.out.println("Invalid selection. Play again");
        }





    }
}





