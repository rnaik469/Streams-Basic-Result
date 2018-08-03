package in.co.cg.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StreamBasic {
	public void readBoy() throws IOException {

		FileReader file = new FileReader("boy.txt");
		BufferedReader reader = new BufferedReader(file);
		ArrayList<Integer> treeSet = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			treeSet.add(Integer.valueOf(reader.readLine()));
		}
		reader.close();
		//stream for sorting
		treeSet.stream().distinct().sorted().forEach(System.out::println);

	}
		
	//prints sorted numbers
	public void writeToBoy() throws IOException {
		FileWriter file = new FileWriter("boy.txt");
		BufferedWriter writer = new BufferedWriter(file);
		for (int i = 0; i < 100; i++) {
			String value = String.valueOf(((int) ((Math.random() * 1000) % 100) + 1));
			writer.write(value+ "\r\n");
		}
		writer.close();
	}
}
