public class ProgrammingQ{
    public static void main(String[] args) {
        
        timePermu("abcdefghi", "abcdeasdeasdfedsdfsdcabawerhjkgkhgh");
        
    }

    public static void timePermu(String sS,String lS){ // this method calls the permu function for the given call and outputs the time used
        long startTime = System.currentTimeMillis();
        permu(sS, lS, 0, sS.length() - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }

    public static void permu(String shortStr, String longStr, int start, int end){
        if (start == end){// base case if the start is equal to the end we use that shortString to do our search
            System.out.println(shortStr);

            for(int i = 0; i < longStr.length() - shortStr.length() + 1; i++){// search with O(n)
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
    public static String swap(String str, int s, int e){ // since the swap is done more then once a helper method is ideal
        char temp; 
        char[] charArray = str.toCharArray(); 
        temp = charArray[s]; 
        charArray[s] = charArray[e]; 
        charArray[e] = temp; 
        return String.valueOf(charArray); 
    }
}