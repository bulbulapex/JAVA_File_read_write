import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main{
	public static void main(String[] args){
		
		
		//take input from users through console
		Scanner scanner = new Scanner(System.in);
		
		
		//The application should ask for the required inputs. Here show name value is required. And read input one by one.
		String name;
		do {
            System.out.println("*Input Name: ");
            name = scanner.nextLine();
            if (name == null || name.trim().isEmpty()) {
                System.out.println("--Name required. Please enter name.--");
            }
        } while (name == null || name.trim().isEmpty());
		
		System.out.println("Input Gender: ");
		String gender = scanner.nextLine();
		System.out.println("Input Phone: ");
		String phone = scanner.nextLine();
		System.out.println("Input Email: ");
		String email = scanner.nextLine();
		System.out.println("Input Address: ");
		String address = scanner.nextLine();
		System.out.println("Input Birthdate: ");
		String birthDate = scanner.nextLine();
		System.out.println("Input Age: ");
		int age = scanner.nextInt();
		
		
		//Keep all contacts those are already saved
		String fullText = "";
        try {
            FileReader reader = new FileReader("write.txt");
            BufferedReader br = new BufferedReader(reader);

            String line = null;
            while((line = br.readLine()) != null) {
                fullText += line;
                fullText += "\n";
            }

        } catch(Exception ex) {
            System.out.println("File Not Found");
        }
		
		
		
		Contact obj1 = new Contact(name, gender, phone, email, address, age, birthDate);
		//additional function 'contactInfo' added for get contract info and next store it write.txt file. 
		String contactInfo = obj1.contactInfo();
		
		//store the contact information to the file
		try {
			FileWriter writer = new FileWriter("write.txt");
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write(fullText);
            bw.write(contactInfo);
            bw.newLine();

            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
		
		//Print all contacts those are already saved
		try {
            FileReader rf = new FileReader("write.txt");
            BufferedReader br1 = new BufferedReader(rf);

            String line = null;
            while((line = br1.readLine()) != null) {
                System.out.println(line);
            }

        } catch(Exception ex) {
            System.out.println("File Not Found");
        }
		
	}
}