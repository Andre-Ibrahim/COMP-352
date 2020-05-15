
public class Version1 {
	
	 public static void permu(String shortStr, String longStr, int start, int end){// this function takes O(m * n!) wtih n being the length of the short string and m the length og the long string
	        if (start == end){// base case if the start is equal to the end we use that shortString to do our search
	            System.out.println(shortStr);

	            for(int i = 0; i < longStr.length() - shortStr.length() + 1; i++){// search with O(m)
	                if (longStr.substring(i, i + shortStr.length()).equals(shortStr)){
	                    System.out.println("found one match: " + shortStr + " is in " + longStr + " at location " + i);
	                    break;
	                }
	                    
	                    
	            } 
	        }
	        else { 
	            for (int i = start; i <= end; i++) { // swaping values and calling recursivly calling the function to keep swaping until base case is attained
	                shortStr = swap(shortStr, start, i); 
	                permu(shortStr, longStr, start + 1, end); // calling function on new string with swapped values 
	            } 
	        } 
	    }
	
	
	
	 private static String swap(String str, int s, int e){ // swap method operates at O(1)
	        char temp; 
	        char[] charArray = str.toCharArray(); 
	        temp = charArray[s]; 
	        charArray[s] = charArray[e]; 
	        charArray[e] = temp; 
	        return String.valueOf(charArray); 
	    }
}
