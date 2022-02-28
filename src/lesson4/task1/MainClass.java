package lesson4.task1;

import java.util.*;

public class MainClass {

    public static String[] arrayString = {
            "tomato", "orange", "tomato", "apple",
            "orange", "tomato", "orange", "orange",
            "tomato", "orange", "tomato", "apple",
            "orange", "tomato", "orange", "orange"};
    public static List<String> stringArrayList = Arrays.asList(arrayString);

    public static void main(String[] args) {

        System.out.println("List size =  " + stringArrayList.size());
        HashSet<String> targetSet = new HashSet<String>(stringArrayList);
        System.out.println("Set size =  " + targetSet.size());

        HashMap<String,Integer> result = new HashMap<>();
        for(String str: targetSet){
            result.put(str,count(str));
        }

        System.out.println(result);
    }

    public static Integer count(String str){
        Integer result = 0;
        for(String strThis : stringArrayList){
            if(strThis.equals(str)) result++;
        }
        return result;
    }

}
