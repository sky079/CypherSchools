import java.util.*;
public class bRurp {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("how long is your burp ?");
        int bruepLength =sc.nextInt();
        String msg="";
        for(int i=0;i<bruepLength;i++){
            msg+="r";
        }
        System.out.println("Bu"+msg+"p");
    }
}
