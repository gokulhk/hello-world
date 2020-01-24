
public class DAS_12{
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("James");
		System.out.println(sb);
		int low=0, high = sb.length()-1, n = high+1;
		for(int i=0; low<high && i<n;++i){
			char temp = sb.charAt(low);
			sb.setCharAt(low, sb.charAt(high)); 
			sb.setCharAt(high, temp); 
			low++;
			high--;
		}

		System.out.println(sb);
	}
}