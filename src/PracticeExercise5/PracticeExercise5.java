package PracticeExercise5;

import java.util.*;

public class PracticeExercise5
    {
        public static void main(String[] args)
        {
            char decision;
            Scanner scanner=new Scanner(System.in);
            int choice;
            do
            {
                System.out.printf("\n Choose an option \n");
                System.out.printf("1. Replace a word in a list \n");
                System.out.printf("2. Find the count of only words from the given string \n");
                System.out.printf("3. Check if a word has occured more than once in a string array \n");
                System.out.printf("4. Enter Student data and sort \n");
                System.out.printf("5. Demo of a hashmap operation \n");
                System.out.printf("6. Set Sorting \n");
                System.out.println("");
                choice=scanner.nextInt();
                switch (choice)
                {
                    case 1:
                        ReplaceWordInList replaceWordInList=new ReplaceWordInList();
                        replaceWordInList.ReplaceWordInListFunction();
                        break;
                    case 2:
                       FindCountOfOnlyWords findCountOfOnlyWords=new FindCountOfOnlyWords();
                       findCountOfOnlyWords.FindCountOfOnlyWordsFunction();
                       break;
                    case 3:
                        CheckForMultipleOccurence checkForMultipleOccurence=new CheckForMultipleOccurence();
                        checkForMultipleOccurence.CheckForMultipleOccurenceFunction();
                        break;
                    case 4:
                        System.out.println("\n Enter the number of students you want to add information \n");
                        int number=scanner.nextInt();
                        List<Student> studentList=new ArrayList<Student>();
                        for (int i = 0; i <number ; i++)
                            {
                                System.out.printf("\n Enter name of student "+(i+1)+"\n");
                                String name=scanner.next();
                                System.out.printf("\n Enter age of student "+(i+1)+"\n");
                                int age=scanner.nextInt();
                                System.out.println("\n Enter ID of student "+(i+1)+"\n");
                                long id=scanner.nextLong();
                                studentList.add(new Student(name,age,id));
                            }
                        StudentSorter studentSorter=new StudentSorter();
                        studentList=studentSorter.StudentSorterFunction(studentList);
                        System.out.println("\n Details of all student = "+Arrays.asList(studentList).toString()+"\n");
                        int i=0;
                        for (Student student:studentList)
                            {
                                System.out.printf("Details of Student "+(i+1)+"\n");
                                System.out.printf("\n name:-"+student.getName()+"\n");
                                System.out.printf("\n age:-"+student.getAge()+"\n");
                                System.out.printf("\n ID:-"+student.getId()+"\n");
                                System.out.printf("\n");
                            }
                        break;
                    case 5:
                        Map<String,String>stringMap=new HashMap<String,String>();
                        stringMap.put("val1","java");
                        stringMap.put("val2","c++");
                        System.out.printf("\n Initial map :"+Arrays.asList(stringMap)+"\n");
                        MapChanger mapChanger=new MapChanger();
                        Map<String, String> stringMap2 = mapChanger.MapChangerFunction(stringMap);
                        System.out.printf("\n Final map :"+Arrays.asList(stringMap2).toString()+"\n");
                        break;
                    case 6:
                        Set<String> set=new TreeSet<String>();
                        System.out.printf("\n Enter your strings \n");
                        scanner.nextLine();
                        String words=scanner.nextLine();
                        String[] wordList=words.split(" ");
                        for (String w:wordList)
                            {
                                set.add(w);
                            }
                        System.out.printf("\n set : "+set.toString()+"\n");
                        System.out.printf("\n ArrayList : "+Arrays.asList(set).toString()+"\n");
                        break;
                    default:
                        System.out.printf("\n Invalid Case \n");
                }

                System.out.printf("\n Press 'y' to continue or 'any key' to exit \n");
                decision=scanner.next().charAt(0);
            }while (decision=='y');
        }
    }
