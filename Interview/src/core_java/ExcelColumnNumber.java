package core_java;

public class ExcelColumnNumber {

	public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int length = columnTitle.length();
        
        for (int i = 0; i < length; i++) {
            // Convert character to its corresponding number
            int currentCharValue = columnTitle.charAt(i) - 'A' + 1;
            // Update the column number
            columnNumber = columnNumber * 26 + currentCharValue;
        }
        return columnNumber;
    }
	
	 public static String getNextAlphabet(String current) {
	        // Convert the current string to a character array for manipulation
	        char[] chars = current.toCharArray();
	        int length = chars.length;

	        // Start from the last character and increment
	        for (int i = length - 1; i >= 0; i--) {
	            // If the character is 'Z', we need to carry over
	            if (chars[i] == 'Z') {
	                chars[i] = 'A'; // Reset current character to 'A'
	            
	            } else {
	                // Increment the current character and return the result
	                chars[i]++;
	                return new String(chars);
	            }
	        }
	        return "A"+ new String(chars); // Fallback (should not reach here)
	    }

    public static void main(String[] args) {
        String columnTitle = "ZAZ"; // Example input
//        int columnNumber = titleToNumber(columnTitle);
//        System.out.println("The column number for " + columnTitle + " is: " + columnNumber);
        
        String next = getNextAlphabet(columnTitle);
        System.out.println("The next alphabet after " + columnTitle + " is: " + next);
    }

}
