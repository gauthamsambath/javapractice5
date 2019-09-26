package PracticeExercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReplaceWordInList
    {
        public void ReplaceWordInListFunction()
            {
                Scanner scanner=new Scanner(System.in);
                System.out.printf("\n Start entering the Elements of the List in a line \n");
                String listElements=scanner.nextLine();
                String[] wordsInList=listElements.split(" ");
                List<String> wordList= Arrays.asList(wordsInList);
                System.out.printf("\n Enter the word in the list to replace \n");
                String replaceWord=scanner.next();
                System.out.println("\n Enter the word to replace word in list with \n");
                String replaceWithWord=scanner.next();
                Collections.replaceAll(wordList,replaceWord,replaceWithWord);
                System.out.println("\n Converted List : "+wordList.toString());
            }
    }
