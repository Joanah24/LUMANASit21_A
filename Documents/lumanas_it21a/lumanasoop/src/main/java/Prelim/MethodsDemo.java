package Prelim;
import java.util.Scanner;

public class MethodsDemo {
    
    
    static void Greetings(String name, int age){
        System.out.println("Hello, I am" + name + ". I am" + age +"years young!");
    }


    static int calculateRealAge(int currentYear, int birthYear) {
    return currentYear - birthYear;
    }

    public static void main(String[] args) {
        Greetings("Anne", 22);
    
        int calculatedAge = calculateRealAge(2026, 1999);
        System.out.println("I am actually" + calculatedAge + " :P");
    
        Scanner anne = new Scanner(System.in);
                System.out.println("\nWHO ARE YOU?");
                System.out.print("ENTER YOUR NAME: ");
                String name = anne.nextLine();
                System.out.println("ENTER YOUR AGE: ");
                int age = anne.nextInt();
                System.out.println("Hello " + name + ", you are " + age + "years old." );
            
        if (age < 17) {System.out.println("You are young"); }
        else if (age > 18 && age < 25) { System.out.println("You are a Teen"); }
        else { System.out.println("You are old"); }
    
        System.out.println("\nARE YOU TELLING THE TRUTH?");
        System.out.print("TELL ME THE YEAR TODAY: ");
        int yearToday = anne.nextInt();
        System.out.println("TELL ME YOUR BIRTHYEAR: ");
        int birthYear = anne.nextInt();
        int realAge = yearToday - birthYear;
        if (realAge == age) { System.out.println("You're telling the truth"); }
        else { System.out.println("You're a LIAR!!!"); }
            
        String[] children = {"Whitey", "Browney", "Blacky"};
    
        System.out.println("\nChildren of Anne: ");
        for (int cv = 0; cv < children.length; cv++) {
            System.out.println(children[cv]);
        }    


    }

}