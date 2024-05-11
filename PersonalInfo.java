
import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("\nThank you, " + name + " " + surname + ", for providing your information.");
        System.out.println("We have recorded that you are " + age + " years old.");
        System.out.println("Have a great day!");
        
        scanner.close();
    }
}
