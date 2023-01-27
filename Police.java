import java.util.*;
public class Police {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter speed :");
        int speed=sc.nextInt();
        System.out.println("Today is your birthday : ");
        boolean isBirthday=sc.nextBoolean();
        if(isBirthday){
            speed-=5;
        }
        if(speed>80){
            System.out.println("high ticket");
        }
        else if(speed>=60){
            System.out.println("mid ticket");
        }
        else{
            System.out.println("no ticket");
        }
        }
    }

