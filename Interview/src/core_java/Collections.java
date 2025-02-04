package core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collections {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(12, "Sandip");
		map.put(14, "Sandip");
		map.put(16, "Vaibhav");
		map.put(13, "Sandip");
		map.put(15, "Sanjay");

		List<Map.Entry<Integer, String>> listofmap = new ArrayList<>(map.entrySet());

		System.out.println(listofmap);

		String st = "Sandip";

		List<Integer> listkey = new ArrayList<>();

		for (Map.Entry<Integer, String> im : map.entrySet()) {
			if (im.getValue().equals(st)) {
				listkey.add(im.getKey());
			}
		}

		List<Integer> keys = map.entrySet().stream().filter(entry -> entry.getValue() == st).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(listkey + " " + keys);

		List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Charlie", "Annie");

		// avoid concurrent modification exception
		Iterator<String> sr = names.iterator();
		// 1.using remove method of iterator
		while (sr.hasNext()) {
			String s = sr.next();
			if (s.equals("ss")) {
				sr.remove(); // safe removal
			}
		}
		// 2. using synchronized block
		synchronized (names) {
			for (String item : names) {
				if (item.equals("ss")) {
					names.remove(item);
				}
			}
		}

	}

}
