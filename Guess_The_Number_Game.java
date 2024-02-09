package Java_2K23.DSA;
import java.util.Scanner;
public class Guess_The_Number_Game {


        public static void guessNum(int num){
            Scanner Sc = new Scanner(System.in); // for input
            int guess =0;
            int tries =10;
            while(tries!=0){
                tries--;
                System.out.println("enter a number to guess");
                guess= Sc.nextInt();

                if(guess>num){

                    System.out.println("guess is high");
                }
                else if(guess<num){
                    System.out.println("guess is low");
                }
                else {
                    System.out.println("correct you won!");
                    break;
                }
            }
        }
        public static void main(String[] args){
            // Generating random number to guess
            int num = (int)(Math.random()*100);

            guessNum(num);
        }

    }

