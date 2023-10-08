package stream_files_and_directories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P1SumLines {
    public static void main(String[] args) {

        String path = "C:\\Users\\Georgi Danailov\\Desktop\\JavaAdvanced\\src\\stream_files_and_directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));) {
            String line = bufferedReader.readLine();
            
            while (line != null) {
                long sum = 0;
                for (char c : line.toCharArray()) {
                    sum += c;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
