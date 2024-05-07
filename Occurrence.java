
import java.util.HashMap;

public class Occurrence {

	public static void main(String[] args) {
		
		String s= "This is parrot what is parrot";
		String[] words=s.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		for(String word:words)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else
			{
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
	}

}
