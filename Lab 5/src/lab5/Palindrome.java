package lab5;

public class Palindrome {
	
	public static boolean isaPalindrome(String str){
		int x = str.length() - 1;
		int i = 0;
		if(str.charAt(i) == str.charAt(x)){
			if(x < 0){
			x--;
			i++;
			isaPalindrome(str.substring(i, x));
			}
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args){
		String str1 = "racecar";
		String str2 = "jeremy";
		String str3 = "abba";
		
		System.out.println(isaPalindrome(str1));
		System.out.println(isaPalindrome(str2));
		System.out.println(isaPalindrome(str3));	
	}
}
