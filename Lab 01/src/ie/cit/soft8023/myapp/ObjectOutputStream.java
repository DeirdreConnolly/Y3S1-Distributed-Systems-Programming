package ie.cit.soft8023.myapp;

import java.io.*;

/*
No idea how to use this
Guide: https://www.tutorialspoint.com/java/java_serialization.htm
 */

public class ObjectOutputStream {

	public ObjectOutputStream(FileOutputStream out) {

	}

	public static void main(String[] args) {

		String s = "Hello";

		try {
			// Create a new file with an ObjectOutputStream
			FileOutputStream out = new FileOutputStream("test.ser");
			ObjectOutputStream oout = new ObjectOutputStream(out);


			// Write something in the file
			oout.writeChars(s);
			oout.writeChars("World");


			// Close the stream
			oout.close();

			// Create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));


			// Read and print what we wrote before
			for (int i = 0; i < 10; i++) {
				System.out.print("" + ois.readChar());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void close() {
	}

	private void writeChars(String s) {
	}
}


// implements java.io.Serializable {
