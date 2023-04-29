package stingdemo;

import java.io.*;

class Demo3 {

static int countOccurrences(String str, String word)
{
	String a[] = str.split(" ");
	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	if (word.equals(a[i]))
		count++;
	}

	return count;
}

//Driver code
public static void main(String args[])
{
	String str = "welcome to urbanpro welcome to bangalore";
	String a[] = str.split(" ");
	int len = a.length, count = 0;
	String s[] = new String[len];
	for(int i = 0; i<a.length; i++) {
		for(int j = 0; j<s.length; j++) {
			if(a[i]==s[j]) {
				count++;
			}
			else {
				s[j] = a[i];
			}
		}
		if(count==0) {
			System.out.println(a[i]+"->"+ countOccurrences(str, a[i])+ "Times");
		}
		else {
			count = 0;
		}
	}
}
}

