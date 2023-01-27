import java.util.*;
public class EmployeePayRoll{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double hra=0,da=0,gp=0;
        double n=sc.nextFloat();
        if(n>=5000){
            hra=0.1*(n);
            da=0.2*(n);
        }
        else{
            hra=0.2*(n);
            da=0.3*(n);
        }
        gp=hra+da+n;
        System.out.println("gp : "+gp);
    }
}