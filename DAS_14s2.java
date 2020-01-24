

public class DAS_14s2{
	public static void main(String[] args) {
			String s1 = "a", s2 = "";
			String yes_anagram = "Given String are Anagram", not_anagram = "Given Strings are not Anagram";

			if(s1.length() != s2.length()){
				System.out.println(not_anagram); return;
			}

			DAS_14s2 dd = new DAS_14s2();	
			int[] counter = new int[256];
			dd.countChars(counter , s1);
			System.out.println((dd.checkEquality(counter, s2))? yes_anagram: not_anagram);


		}

	public void countChars(int[] a, String s1){
		for(int val :s1.toCharArray()) //char to asci value conversion
			a[val]++;

	}	

	public boolean checkEquality(int[] a, String s2){
		for(int val :s2.toCharArray())
			if( (a[val]--) < 0 ) return false;

		for(int val: a) 
			if(val!=0) return false;

		return true;


	}	
}