import java.util.ArrayList;

public class ProgrammingQ{
    public static void main(String[] args) {

        permu("bca", "hhhlajkjgabckkkkcbakkdfjknbbca", 0);// test case from the pdf
        
    }
    //version 1: recursive case
    public static int permu(String shortStr, String longStr, int index){
    
        String nString = new String(longStr);                                             // building a new string that will be used as an argument 
        int len = shortStr.length();                                                     // length of the short string which would be helpful for the base case
        if(len > longStr.length()){                                                      // base case 1 is if the long string is smaller than  the length
            System.out.println(shortStr);
            return -1;// returning -1 for no matches
        }
        else if(shortStr.equals(longStr.substring(0, len))){ // if there is  a match return the index
            System.out.println(shortStr);
            System.out.println("found one match: " + shortStr + "is in " + longStr + " at location " + index);
            return index;   
        }
        else{
            index++;    // incrementing index value if no match
            nString = nString.substring(1);
            permu(shortStr, nString, index);
        }
        return -1;//should never occure but makes compiler happy
        
    }//rip
    
}