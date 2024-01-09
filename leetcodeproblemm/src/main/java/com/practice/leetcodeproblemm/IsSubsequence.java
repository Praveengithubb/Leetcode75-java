package com.practice.leetcodeproblemm;

public class IsSubsequence {
	public static boolean isSubsequence(String s, String t) {
		int n=0;
		for(int i=0;i<t.length()&&n<s.length();i++)
		{
			if(t.charAt(i)==s.charAt(n))
			{
				n++;
			}
		}
		return n==s.length();
	}
public static void main(String[] args) {
	String s="abc";
	String t="ahbgdc";
	System.out.println(isSubsequence( s, t)); 
}
}
