package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mymainclass {

    public static void main(String[] args) {

        //using comparable you can sort one time or for one member on the same class implements
        //using comparator you can sort multiple time or for all member with creating new class for each member
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(23, "Vaibhav"));
        students.add(new Student(24, "Vibhav"));
        students.add(new Student(11, "Ram"));
        students.add(new Student(20, "Amol"));

         //Collections.sort(students); //comparable
        Collections.sort(students, new Byname()); //comparator

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("--Duplicate char count-----");;
        
        String str= "vaibhav";
        char[] ch = str.toCharArray();
        
//        String[] arr = str.split("");
//        List<Character> st = new ArrayList(Arrays.asList(ch));
//        System.out.println(st.stream().filter(s -> Collections.frequency(st, s) > 1).count());
        
        List<Character> chlist = new ArrayList<>();
        for(char c : ch) { 
        	chlist.add(c);
        }
        
        Set<Character> set = new HashSet<>();
        //System.out.println(chlist.stream().filter(n -> !set.add(n)).count());
        //Or
       System.out.println(chlist.stream().filter(s -> Collections.frequency(chlist, s) > 1).count());

    }
}
