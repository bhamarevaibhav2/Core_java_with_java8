package core_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class Collections_Internal {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("Vaibhav");
		set.add(null);
		set.add("");
		set.add(null);
		set.add("Vaibhav");
		set.add("Dipak");

		// HashMap allows null keys and null values.
		//a HashMap uses an array of buckets to store key-value pairs. 
		//Each bucket can contain multiple entries in the form of linked lists (or trees in case of high collision).
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Vaibhav", 23);
		map.put(null, null);
		map.put("Dipak", 34);
		map.put(null, 12);
		map.put(null, null);
		map.put("", 12);
		map.put("Vaibhav", 26);
		map.put("Vaibhav", 23);

		// ConcurrentHashMap generally has better performance than HashMap in
		// multi-threaded environments
		// due to its fine-grained locking mechanism.which allows higher concurrency
		//Instead of locking the entire map, it locks only the segment or bucket being accessed. 
		//This significantly improves performance in multi-threaded environments
		
		// ConcurrentHashMap does not allow null keys or null values.
		// Attempting to insert a null key or value will result in a
		// NullPointerException.
		
		//A ConcurrentHashMap is divided into segments (or buckets), each of which can be locked independently. 
		//This allows multiple threads to read and write to different segments concurrently without blocking each other.
		
		//It can resize without locking the entire map, 
		//allowing other threads to continue accessing the map during the resizing process.
		ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();

		cmap.put("Vaibhav", 23);
		cmap.put("Dipak", 34);
		// cmap.put(null, 12); not allowed
		// cmap.put(null, null); not allowed
		cmap.put("", 12);
		cmap.put("Vaibhav", 26);
		cmap.put("", 22);
		cmap.put("", 22);
		// cmap.put("", null); not allowed
		cmap.put("Vaibhav", 23);

	}

}
