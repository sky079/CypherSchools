import java.util.Scanner;
public class sample {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Neutral");
        }
        else if(num>0){
            System.out.println("+ve");
        }
        else{
            System.out.println("_ve");
        }
    }
    
}
