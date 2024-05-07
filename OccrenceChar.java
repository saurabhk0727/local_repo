

import java.util.HashMap;

public class OccrenceChar {

	public static void main(String[] args) {
		String s="Java";
		//j=1,a=2,v=1
		char ch[]=s.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(Character c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
				hm.put(c, 1);
			}
		}
		System.out.println(hm);
	}

}
