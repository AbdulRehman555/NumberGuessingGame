import java.util.Scanner;
public class Main {
    public static void main(String [] arg){
        System.out.println("-----------------Welcome to the number guessing game -------------------");
        int randomNum=(int)((Math.random()*100)+1);
        boolean hasWon=false;
        Scanner scanner=new Scanner(System.in);
        for(int i=5;i>0;i--){
            System.out.println("-----------------      You have"+i+" guesses left       -------------------");
            int guess=scanner.nextInt();
            if(guess<randomNum) {
                System.out.println("----It is larger than " + guess + "-----");
            }
            else if(guess>randomNum) {
                System.out.println("----It is smaller than " + guess + "-----");
            }
            else{
                hasWon=true;
                break;
            }
        }
        if(hasWon){
            System.out.println("---- Correct Answer ----");
            System.out.println("---- Number is"+randomNum+" ----");
        }
        else{
            System.out.println("---- Game Over ----");
            System.out.println("---- You Lose ----");
            System.out.println("---- Number is"+randomNum+" ----");
        }
    }
}
