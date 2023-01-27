import Doctor.Physician;

abstract class Doctor{
abstract void treatPatient();

class Physician extends Doctor{

@Override

void treatPatient() {

}

}

class Surgeon extends Doctor{

@Override

void treatPatient() {

System.out.println("Hi! I am Surgeon \nI Treat atients using Surgery!");

}
}

class Dentist extends Doctor{

@Override

void treatPatient() {

System.out.println("Hi! I am Dentist \nI Treat Patients Teeth");

}
}
}
public class Program {

    public static void main(String[] args) {
    
    System.out.println("HI! I am Lucy! Receptioninst at Max Care");
    
    System.out.println("Who you are looking for ?");
    
    System.out.println("Press   1. Physician\n2. Surgeon \n3. Dentist");
    
    int choice = new java.util.Scanner(System.in).nextInt();
    
    Doctor doc;
    
    switch (choice) {
    
    case 1:
    
    doc= new Physician();
    
    break;
    
    case 2:
    
    doc= new Surgeon();
    
    break;
    
    case 3:
    
    doc = new Dentist();
    
    break;
    
    default:
    System.out.println("A Oh! Invalid Choice ");
    
    break;
    }
}
}
    

    
    