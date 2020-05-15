
public class driver {
	public static void main(String[] args) {
		
		timePermu1("abc", "acbdsjkfgsabcsdkkdfsdfbca");
		
		timePermu1("abcd", "acbdsjkfgsabcsdkdfsdfbdca");
		
		timePermu1("abcdef", "acbdsjkfgsabcsdkdfsdfbdefca");
		
		timePermu1("abcdefg", "acbdsjkfgsabcsdkkdfsfbdegfca");
		
		timePermu2("abc", "acbdsjkfgsabcsdkkdfabcsdfbca");
		
		timePermu2("abcd", "acbdsjkfgsabcsdkdfsdfbdca");
		
		timePermu2("abcdef", "acbdsjkfgsabcsdkdfsdfbdefca");
		
		timePermu2("abcdefgk", "acbdsjkfgsabcsdkkdfsfbdegfcak");
		
	}
	
	public static void timePermu1(String sS,String lS) { // this method calls the permu function for the given call and outputs the time used
        long startTime = System.currentTimeMillis();
        Version1.permu(sS, lS, 0, sS.length() - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
	public static void timePermu2(String sS,String lS) { // this method calls the permu function for the given call and outputs the time used
        long startTime = System.currentTimeMillis();
        Version2.permu(sS, lS);
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

    }
}
