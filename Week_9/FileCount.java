import java.io.*;
import java.util.*;

public class FileCount {
    public static void main(String[] args) throws Exception{
        

        File sourceFile = new File("Exercise12_13.txt");

        if ( !sourceFile.exists()){
            System.out.println("Source file " + "Exercise12_13.txt" + " does not exist");
            System.exit(2);
        }

        Scanner inputFile = new Scanner(sourceFile);

        int lineCount = 0, wordCount = 0 ;
        while(inputFile.hasNext()){
            String oneLine = inputFile.nextLine();
            lineCount++;
            wordCount += countWords(oneLine);
        }

        inputFile.close();

        System.out.println("File " + sourceFile + " has ");
        System.out.println(sourceFile.length() + " characters");
        System.out.println(wordCount + " words");
        System.out.println(lineCount + " lines");
    }

    private static int countWords(String s){        
        String[] words = s.split("[ \\t\\n\\r]");
        int count = 0;

        for (String wrd : words){
            if (wrd.length() > 0)
                count++;
        }
        return count;
    }
}