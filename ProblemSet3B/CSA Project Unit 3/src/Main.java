import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int random = (int) (Math.random()*3);
        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades!");
        int player = 0;
        String userchoice = scan.nextLine();
        if (userchoice.length() <= 50) {
            System.out.println("Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose CROSSBLADES!");
            player = 3;
        } else if(userchoice.substring(userchoice.length() - 4).toLowerCase().equals("rock")) {
            player = 0;
        } else if (userchoice.substring(userchoice.length() - 5).toLowerCase().equals("paper")) {
            player = 1;
        } else if (userchoice.substring(userchoice.length() - 11).toLowerCase().equals("crossblades")) {
            player = 2;
        } else {
            player = 3;
            System.out.println("You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!");
        }
        if(player != 3) {
            if (random == 0) {
                System.out.println("In the battle of wits, only one emerges victorious! The champion stands tall with the power of ROCK!");
            } else if (random == 1) {
                System.out.println("As the tension mounts, the stage is set for an epic showdown... A hushed silence falls over the battlefield... Behold, the choice that reigns supreme: PAPER!");
            } else {
                System.out.println("In the throes of battle, the winds of fate have shifted against you... The shadows of doubt loom large... Alas, in this chapter, you face the crushing power of CROSSBLADES!");
            }
        }
        if((player == 0 && random ==2) || (player == 1 && random == 0) ||(player == 2 && random == 1)){
            System.out.println("You Win!");
        }
        else if(player == random){
            System.out.println("Unbelievable! We have tied! *Eye twitches*");
        }
        else{
            System.out.println("As I predicted, I have won this battle. The kingdom is MINE!");
        }
        }
}
