import java.util.*;
public class DivisionRank {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Division");
        int div = sc.nextInt();
        switch(div){
            case 1:
            System.out.println("First rank");
            break;
            case 2:
            System.out.println("Second Rank");
            break;
            case 3:
            System.out.println("Third Rank");
            break;
            default:
            System.out.println("no rank");
            break;
        }
    }
}
