
import java.util.*;
class Substring{

// Function to find and print longest
// substring without repeating characters.
public static String findLongestSubstring(String str)
{
	int i;
	int n = str.length();
	int st = 0;
	int currlen = 0;
	int maxlen = 0;
	int start = 0;
	HashMap<Character,Integer> pos = new HashMap<Character,Integer>();
	pos.put(str.charAt(0), 0);
	for (i = 1; i < n; i++)
	{
		if (!pos.containsKey(str.charAt(i)))
		{
			pos.put(str.charAt(i), i);
		}
		else
		{
			if (pos.get(str.charAt(i)) >= st)
			{
				currlen = i - st;
				if (maxlen < currlen)
				{
				maxlen = currlen;
				start = st;
				}
		
				st = pos.get(str.charAt(i)) + 1;
			}
			pos.replace(str.charAt(i), i);
		}
	}
	if (maxlen < i - st)
	{
		maxlen = i - st;
		start = st;
	}
	return str.substring(start,start +maxlen);
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
	String str = sc.nextLine();
	System.out.print(findLongestSubstring(str));
}
}

