package hust.soict.hedspi.garbage;

import java.io.*;
import java.nio.file.*;

public class NoGarbage {

	public static void main(String[] args) throws IOException{
		String filename = "C:\\Users\\LAPTOP\\OneDrive - Hanoi University of Science and Technology\\Desktop\\large.txt";
		byte[] inputBytes = { 0 };
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
          outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
