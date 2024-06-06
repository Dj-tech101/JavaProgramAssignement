package Programms;

public class ConsecutiveString {

	 public static void main1(String[] args) 
	   {
	      String s = "AAAADDDCCCA";
	      int count = 1;
	      String re = "" ;
	      for (int i = 0 ; i <=s.length()-1; i++ )
	      {
	    	  
	         if ( i == s.length()-1 & count == 1 )
	         {
	            re = re + s.charAt(i)+count;

	            System.out.println("test  "+re);
	            break ;
	         }
	         if ( s.charAt(i) == s.charAt(i+1))
	         {
	            count++;
	         }
	         else
	         {
	            re = re + s.charAt ( i ) + count ;
	            count = 1 ;
	         }
	      }
	      System.out.println ( re ) ;
	   }
	 
	 
	 public static void main(String[] args) {
	        String input = "aaabbacdcccc";
	        String consecutiveCounts = getConsecutiveSubstringCounts(input);
	        System.out.println("Consecutive substring counts: " + consecutiveCounts);
	    }

	    public static String getConsecutiveSubstringCounts(String input) {
	        if (input == null || input.isEmpty())
	            return "";

	        StringBuilder result = new StringBuilder();
	        
	        char prevChar = input.charAt(0);
	        
	        System.out.println("preve char  "+prevChar);
	        
	        int count = 1;

	        for (int i = 1; i < input.length(); i++) {
	        	
	            char currentChar = input.charAt(i);
	            
	            System.out.println("current char  "+currentChar);
	            
	            
	            if (currentChar == prevChar) {
	                count++;
	                 } 
	            else {
	                result.append(prevChar);
	                if (count > 1) {
	                    result.append(count);
	                }
	                prevChar = currentChar;
	                count = 1;
	            }
	        }

	        System.out.println("result "+result);
	        
	        result.append(prevChar);
	        if (count > 1) {
	            result.append(count);
	        }

	        return result.toString();
	    }
	 
	
}
