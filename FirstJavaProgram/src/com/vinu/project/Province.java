package com.vinu.project;

public class Province {
	public static void main(String args[])
	{
		/*String nav="MB|Manitoba";
		String retstr="";
		char[] ans=nav.toCharArray();
		for(char i:ans)
		{
			if(i=='|')
			{
				break;
			}
			retstr+=i;
		}
		System.out.println(retstr);
	}*/
	String s = "MB|Manitoba";
    String[] b = s.split(Constants.SEPARATOR);
	System.out.println(b[0]); 
	}

}
