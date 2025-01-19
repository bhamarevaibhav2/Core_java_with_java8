package java11;

public class Normal {
	
	public static void main(String[] args) {
		
		String s1 = " ";
		
		boolean isblank = s1.isBlank();
		System.out.println(isblank);
		System.out.println(s1.isEmpty());
		
		String multiline = "line1\nline2";
		multiline.lines().forEach(System.out::println);
		
		String str1 = " Hello World ";
		System.out.println(str1.strip()); //remove all spaces
		System.out.println(str1.stripLeading()); // remove leading spaces
		System.out.println(str1.stripTrailing()); //remove trailing spaces
	}

}
