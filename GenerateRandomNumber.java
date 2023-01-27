import java.util.*;
public class GenerateRandomNumber {
    public static void main(String args[]){
        Random r =new Random();
        int computerchoice= r.nextInt(20);
        //System.out.println("Computer choice: "+computerchoice);
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
        System.out.println("Guess a number betwenn 0 and 20");
        int userChoice=sc.nextInt();
        if(userChoice>computerchoice){
            System.out.println("Your guess is too high");
        }
        else if(userChoice<computerchoice){
            System.out.println("Your guess is too low");
        }
        else{
            System.out.println("Your guess it right!!");
            break;
        }
    }
    }
}
