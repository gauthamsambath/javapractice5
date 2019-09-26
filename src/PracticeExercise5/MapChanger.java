package PracticeExercise5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MapChanger
    {
        public Map<String,String> MapChangerFunction(Map<String,String> stringMap)
            {
                List<String> keys=new ArrayList<String>(stringMap.keySet());
                List<String> values=new ArrayList<>();

                for (Map.Entry<String,String> entry :stringMap.entrySet())
                    {
                        keys.add(entry.getKey());
                        values.add(entry.getValue());
                    }
//                Collections.swap(values,0,1);
                values.set(1,values.get(0));
                values.set(0,"");
                stringMap.clear();
                stringMap.put(keys.get(0),values.get(0));
                stringMap.put(keys.get(1),values.get(1));
                return stringMap;
            }
    }
