import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Personal_info {
	public static void main(String[] args) 
	{
		// We use try-with-resources to ensure that resources are closed properly
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println();
			System.out.print("Enter your name: ");
			String name = scanner.nextLine();
			System.out.print("Enter your surname: ");
			String surname = scanner.nextLine();
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();
			
			// Save the information to a file
			try (FileWriter writer = new FileWriter("personal_info.txt")) 
			{
				writer.write("Name: " + name + "\n");
				writer.write("Surname: " + surname + "\n");
				writer.write("Age: " + age + "\n");
				System.out.println("Information saved to personal_info.txt");
			} catch (IOException e) {
				System.out.println("An error occurred while saving the information to the file.");
				System.err.println(e.getMessage());
			}
			
			// Show a thank you message to the user along with the provided information
			System.out.println("\nThank you, " + name + " " + surname + ", for providing your information.");
			System.out.println("We have recorded that you are " + age + " years old.");
			System.out.println("Have a great day!");
		}
	}
}

