package collections;

import java.util.*;
import java.util.Map.Entry;

public class AllCollection {

    public static void main(String[] args) {
        //Internal implementation: ArrayList is backed by an Array while HashSet is backed by an HashMap.
        // ArrayList maintains the order and index of the object while hashset unordered and non index
        //ArrayList not apply any restriction, we can add any number of null value while HashSet allow one null value.
        //Stacks works on the LIFO principle,Queues work on the FIFO principle
        //Arrays can hold only homogeneous data types elements.
        int[] arr = new int[10];
        arr[0] = 1;

        //Collection can hold both homogeneous and heterogeneous elements.
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");//indexed data structure, duplicates allowed,

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------Set----------");
        //Set implementation classes are HashSet, LinkedHashSet, and TreeSet.
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");//duplicates not allowed in set

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("----------LinkedList----------");
        //LinkedList internally uses a doubly linked list to store the elements.That is why faster than arraylist
        //Arraylist good for storing and retriving operations and linkedlist good for manipulation operations
        //Manipulation with ArrayList is slow because it internally uses an array.
        // If any element is removed from the array, all the other elements are shifted in memory.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("A");

        for (String s : linkedList) {
            System.out.println(s);
        }

        //map does not allow duplicate keys
        //does not maintain insertion order
        //Map implementation classes are HashMap, HashTable, TreeMap, ConcurrentHashMap, and LinkedHashMap.
        //By default 16 bucket will create and threshold value will 12 
        //when bucket crossed 12 bucket threshold value will increase by 12 and bucket size also double as so on..
        //One bucket: Linked list node:
        //One Node: Hash -> Key -> Next -> Value
        //if key is null then that node goes to the 0th position
        //if value is same 2nd time then also that node goes to the 0th position
        System.out.println("----------Map----------");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "A");
        map.put(4, "D"); //duplicate key not allowed if is there then it will replace there value
        
        Iterator<Entry<Integer, String>> itr1 = map.entrySet().iterator();
        
        System.out.println("----------Iterator----------");
        while(itr1.hasNext()) {
        	
        	Map.Entry<Integer, String> current = itr1.next();
        	
        	System.out.println(current.getKey() + " = "+ current.getValue());
        	if(current.getKey().equals(3)) {
        		itr1.remove();
        	}
        	
        }
        System.out.println("--------------Keyset()-------------");
        for(Integer is : map.keySet()) {
        	System.out.println(is+"="+map.get(is));
        }
        System.out.println("--------------for loop-------------");
        for(Map.Entry<Integer,String> ma : map.entrySet()) {
        	
        	System.out.println(ma.getKey()+"="+ma.getValue());
        }
        System.out.println("-------------for each loop or lambda--------------");
        map.forEach((Key,Value) -> System.out.println(Key+"="+Value));
        System.out.println("--------------stream api-------------");
        map.entrySet().stream().forEach(input -> System.out.println(input.getKey()+"="+input.getValue()));
        
      
    }
}
