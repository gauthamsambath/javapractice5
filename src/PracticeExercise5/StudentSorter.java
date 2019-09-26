package PracticeExercise5;

import java.util.Collections;
import java.util.List;

public class StudentSorter
    {
        public List<Student> StudentSorterFunction(List<Student> studentList)
            {

                for (int i = 0; i < studentList.size()-1; i++)
                    {
                    for (int j = 0; j < studentList.size() - i - 1; j++)
                        {
                        if (studentList.get(j).getAge() > studentList.get(j + 1).getAge())
                            {
                            Collections.swap(studentList, j, j + 1);
                            }
                        else if (studentList.get(j).getAge() == studentList.get(j + 1).getAge())
                            {
                            if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) > 0)
                                {
                                Collections.swap(studentList, j, j + 1);
                                }
                            else if (studentList.get(j).getName().compareTo(studentList.get(j + 1).getName()) == 0)
                                {
                                if (studentList.get(j).getId() > studentList.get(j + 1).getId())
                                    {
                                    Collections.swap(studentList, j, j + 1);
                                    }
                                }
                            }
                        }
                    }
                return studentList;
                }
        }
