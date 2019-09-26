package PracticeExercise5;

import java.util.*;

public class FindCountOfOnlyWords
    {
        public void FindCountOfOnlyWordsFunction()
            {
//                String str = new String("one one -one___two,,three,one @three*one?two");
                System.out.println("\n Enter the String to find count of only words \n");
                Scanner scanner=new Scanner(System.in);
                String str=scanner.nextLine();
                String[] words=str.split("[\\s\\W,_]");
                List<String> list = new ArrayList<String>(Arrays.asList(words));
//                System.out.println(list);
                list.removeAll(Arrays.asList("", null));
                HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
                for (String word:list)
                {
                   String[] w=word.split(" ");
                    for (int i=0;i<w.length;i++)
                    {
                        if(hash_map.containsKey(w[i])==false)
                        {
                            hash_map.put(w[i],1);
                        }
                        else
                        {
                            hash_map.put(w[i],hash_map.get(w[i])+1);
                        }
                    }
                }
               System.out.println("occurence of each word = "+ Arrays.asList(hash_map).toString());
            }
    }
