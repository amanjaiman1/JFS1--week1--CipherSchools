import java.util.Scanner;

// dynamic polymorphism
abstract class Doctor{
    abstract void treatPatient();
}
class Physician extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Hi! I am Physician \n I treat Patients using Medicines");
    }
}
class Surgeon extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Hi! I am Surgeon \n I treat patients using surgery");
    }
}
class Dentist extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("Hi! I am Dentist \nI Treat patients Teeth");
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hi! I am Lucy! Receptionist at Max care");
        System.out.println("Who you are looking for ?");
        System.out.println("Press1 . Physician\n2.Surgeon \n3. Dentist");
    int choice=sc.nextInt();
    Doctor doc=null;
    switch(choice){
        case 1:
        doc=new Physician();
        break;
        case 2:
            doc=new Surgeon();
            break;
        case 3:
            doc=new Dentist();
            break;
        default:
            System.out.println("A oh! Invalid choice");
            break;
    }
    if(choice<0 || choice>3){
        System.exit(0);
    }
    else{doc.treatPatient();
    }
    }
}
