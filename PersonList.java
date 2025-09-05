
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

class PersonList {

	private LinkedList<Person> people;

	public PersonList() {

		people = new LinkedList<>();

	}


	public void store(Scanner myReader) {


		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			// parse
			String[] arr1 = data.split(",");

			// create object
			Person newPerson = new Person(arr1[0],arr1[1],arr1[2]);
			// add to linkedList
			people.add(newPerson);
		}
		myReader.close();
	}

	public void display(FileWriter myWriter) throws IOException {
		for(int i  = 0; i < people.size();i++) {
			String outputString = people.get(i).toString();
			myWriter.write(outputString);
		}
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	}
	public int find(String sid) {


		int index = 0;

		if(sid == null) {
			return -1;
		}
		Iterator<Person> it = people.iterator();

		while(it.hasNext()) {

			Person p = it.next();
			if(p.getId().equals(sid)) {
				return index;	

			}
			index++;

		}
		return -1;

	}
}


