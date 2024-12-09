package lab8DemoTestLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {
    public static String[] readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mishanya\\IdeaProjects\\untitled\\src\\Lab_8_Main\\specification_main.txt"));
        String line;
        StringBuilder sb = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }

        reader.close();
        return sb.toString().split("\n");
    }
}

