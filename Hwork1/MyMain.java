import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class MyMain {
	static void store(Scanner myReader, LinkedList<Person> personList) throws FileNotFoundException {


		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			// parse
			String[] arr1 = data.split(",");

			// create object
			Person newPerson = new Person(arr1[0],arr1[1],arr1[2]);
			// add to linkedList
			personList.add(newPerson);
		}
		myReader.close();

	}

	static void display(FileWriter myWriter, LinkedList<Person> personList) throws IOException {

		for(int i  = 0; i < personList.size();i++) {
			String outputString = personList.get(i).toString();
			myWriter.write(outputString);
		}
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	}

	static int find(String sid, LinkedList<Person> personList) {
		int index = 0;

		if(sid == null) {
			return -1;
		}
		Iterator<Person> it = personList.iterator();

		while(it.hasNext()) {

			Person p = it.next();
			if(p.getId().equals(sid)) {
				return index;	

			}
			index++;

		}
		return -1;

	}




	public static void main(String[] args)  {
		String sid = "12345";
		LinkedList<Person> personList = new LinkedList<Person>();
		try {
			File file = new File("data.txt");
			Scanner myReader = new Scanner(file);
			store(myReader,personList);


		} catch(FileNotFoundException e) {
			System.out.println("an error occured.");
			e.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			display(myWriter,personList);


		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		int index = find(sid,personList);
		System.out.println(index);



	}
}
