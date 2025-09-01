import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class MyMain2 {
    
public static void main(String[] args)  {
		PersonList people = new PersonList();
		try {
			File file = new File("data.txt");
			Scanner myReader = new Scanner(file);
			people.store(myReader);


		} catch(FileNotFoundException e) {
			System.out.println("an error occured.");
			e.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			people.display(myWriter);


		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.println(people.find("12345"));

		System.out.println(people.find("67890"));
		System.out.println(people.find("11111"));
	


	}
    
    }
