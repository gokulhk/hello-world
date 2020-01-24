import java.util.Collections;
import java.util.Arrays;


public class DAS_14s1{
	public static void main(String[] args) {
		String s1 = "god", s2 = "mad";
		boolean anagram;

		DAS_14s1 obj = new DAS_14s1();
		anagram = obj.isAnagram(s1,s2);
		System.out.println("given strings "+s1+" and "+s2+" are "+ ( (anagram)?"":" Not ") + "Anagrams");


	}

	public boolean isAnagram(String s1, String s2){


		if(s1.length() != s2.length())
			return false;

		//System.out.println("Flagger");//just for debugging serves no other purpose
			
		//converting the input string to Array for sorting
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);//Merge sort 
		Arrays.sort(c2);//Merge sort

		s1 = String.valueOf(c1);
		s2 = String.valueOf(c2);
		return (s1).equals(s2);
	}

}