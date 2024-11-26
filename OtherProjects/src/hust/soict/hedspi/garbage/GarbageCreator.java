package hust.soict.hedspi.garbage;

import java.io.*;
import java.nio.file.*;

public class GarbageCreator {

	public static void main(String[] args) throws IOException{
		String filename = "C:\\Users\\LAPTOP\\OneDrive - Hanoi University of Science and Technology\\Desktop\\large.txt";
		byte[] inputBytes = { 0 };
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
		String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
