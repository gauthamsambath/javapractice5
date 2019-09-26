package PracticeExercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckForMultipleOccurence
    {
        public void CheckForMultipleOccurenceFunction()
            {
                System.out.println("\n Enter the elements of your string array by putting spaces in between and pressing enter when finished \n");
                Scanner scanner=new Scanner(System.in);
                String word=scanner.nextLine();
                String[] wordArray=word.split(" ");
                HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
                    for (int i=0;i<wordArray.length;i++)
                    {
                        if(hash_map.containsKey(wordArray[i])==false)
                        {
                            hash_map.put(wordArray[i],1);
                        }
                        else
                        {
                            hash_map.put(wordArray[i],hash_map.get(wordArray[i])+1);
                        }
                    }
                Map<String,Boolean> hashMapBoolean=new HashMap<String, Boolean>();
                for (Map.Entry<String,Integer> entry : hash_map.entrySet())
                    {
                        if(entry.getValue()>1)
                            {
                                hashMapBoolean.put(entry.getKey(),true);
                            }
                        else
                            {
                                hashMapBoolean.put(entry.getKey(),false);
                            }
                    }
                System.out.println("\n True when there is multiple occurence = "+hashMapBoolean+"\n");

            }
    }
