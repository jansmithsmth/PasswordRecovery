package bg.kristiyan.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
	static String smallChars = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
	static String bigChars = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
	static String numbers = "1,2,3,4,5,6,7,8,9,0";

	public static void main(String[] args)
	{
		String fileName = "test";
		
		final Byte MINLEN = 4;
		final Byte MAXLEN = 8;
		
		List<String> charList = concatenateChars(smallChars, bigChars, numbers);
		
		String[][] allLists = new String[][]{};
		for (int i = MINLEN; i <= MAXLEN; i++)
		{
			String[] tempArray = generateCombinations(i, charList);
		}

	}

	static private String[] generateCombinations(int charLen, List<String> allChars)
	{
		List<StringBuffer> possibleCombinations = new ArrayList<>();
		

		boolean stayInLoop = true;
		do
		{

		}
		while (stayInLoop);

		return null;
	}
	
	static private List<String> concatenateChars(String... chars)
	{
		List<String> result = new ArrayList<>();
		
		for (String s: chars)
		{
			String[] cArray = s.split(",");
			result.addAll(Arrays.asList(cArray));
		}
		return result;
	}

}
