package strings;

public class AllStrings {

	public static void main(String[] args) {
		
		String str = "Vaibhav";
		String str2 = "vaibhav";
		String str3 = "Vaibhav-Dilip Bhamare";
		
		String[] chr = str.split("");
		for(String c : chr) {
			System.out.println(c);
		}
		
		System.out.println("++++++++");
		for(String w:str.split("",3)){   //2 means lines 
			System.out.println(w);  
			}  
		for(String w:str3.split("-",3)){   //2 means lines 
			System.out.println(w);  
			}
		System.out.println("-------------");
		
		System.out.println(str.equalsIgnoreCase(str2));  //equalsIgnoreCase() compare without case
		String format = str.format("name is %s", str2);  //format()
		System.out.println(format); //
		
		char charAt = str.charAt(0);                   //charAt()
		System.out.println(charAt);
		
		char[] charArray = str.toCharArray();          //toCharArray();
		
		for(char ch : charArray)
		{
			System.out.print(ch+" ");
		}
		
		str.concat("Is immutable");
		
		str = str.concat("Bhamare");                     //concat()
		
		System.out.println(str+" "+str.length());       //length()
		System.out.println(str.contains("Vaibhav"));	//contains()	
		System.out.println(str.endsWith("re"));         //endWith()
		System.out.println(str.equals(str2));           //equals()    case sensitive
		System.out.println(str == str3);
		
		System.out.println("---------------");
		String sr = "Hello";
		//String sr2 = "Hello";
		//String sr3 = "Hello Vaibhav";
		StringBuffer sb = new StringBuffer("Hello");
	
		
		//System.out.println(sr == sr2);//true
		//System.out.println(sr.equals(sr2));//true
		System.out.println(sr.equals(sb));//false
		
		StringBuffer sb1 = new StringBuffer("Hello,World");
		sr.concat(",World");
		System.out.println(sr);
		sb1.append(" Vaibhav");
		//System.out.println(sr.equals(sr2));
		
	}

}
