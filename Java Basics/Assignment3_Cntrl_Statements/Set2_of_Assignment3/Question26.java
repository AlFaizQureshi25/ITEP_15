import java.util.Scanner;

class Grades{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics, Chemistry, Biology, Mathematics and English out of 100:");
        
        System.out.println("Enter Physics Marks");
        int physics = sc.nextInt();
     
        System.out.println("Enter Chemistry Marks");
        int chemistry = sc.nextInt();
       
        System.out.println("Enter biology Marks");
        int biology = sc.nextInt();
       
        System.out.println("Enter Mathematics Marks");
        int mathematics = sc.nextInt();
     
        System.out.println("Enter English  Marks");
        int English = sc.nextInt();

        int obtained = physics + chemistry + biology + mathematics +English;
        
        double percent = (obtained/500.0)*100.0;
        if(percent >= 90){
            System.out.println("Grade A");
        }
        else if(percent >= 80){
            System.out.println("Grade B");
        }
        else if(percent >= 70){
            System.out.println("Grade C");
        }
        else if(percent >= 60){
            System.out.println("Grade D");
        }
        else if(percent >= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}