package lester.github.com.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lyy on 2017/6/19.
 */
public class WordCount {

    private WordCount() {

    }

    public static int countWordInFile(String word, String fileName) {
        int counter = 0;
        try (FileReader fileReader = new FileReader(fileName)) {
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    counter += countWordByIndex(word, line);
//                    counter += countWordByPattern(word, line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }

    public static int countWordByIndex(String word, String line) {
        int counter = 0;
        int index = -1;
        while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
            counter++;
            line = line.substring(index + word.length());
        }
        return counter;
    }

    public static int countWordByPattern(String word, String line) {
        int counter = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        String word = "§";
        String fileName = "WordCount.txt";
        URL url = WordCount.class.getClassLoader().getResource(fileName);
        System.out.println(WordCount.countWordInFile(word, url.getFile()));
    }
}
