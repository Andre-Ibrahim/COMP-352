import java.util.Arrays;
public class Version2 {
	
    public static void permu(String shortString, String longString){
    	String previousString = ""; // used latter to make sure we dont find more than one match per permutation 
        char[] shortA = shortString.toCharArray();
        Arrays.sort(shortA);
        shortString = new String(shortA);

        for(int i = 0; i < longString.length() - shortString.length() + 1; i++){// search with O(m)

            String originalSub = longString.substring(i, i + shortString.length());
            char[] temp = originalSub.toCharArray();
            Arrays.sort(temp);// sort method has complexity of n*log(n)
            String sortedSub = new String(temp);
            if (sortedSub.equals(shortString) && !previousString.equals(originalSub)){ // checking for only the first match of the permutation
            	previousString = originalSub;
                System.out.println("found one match: " + originalSub + " is in " + longString + " at location " + i);
            }
                
                
        } 

    }
}
