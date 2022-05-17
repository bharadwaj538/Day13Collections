package ai.jobiak.hashset;
 //import java.time.LocalDateTime;
import java.util.*;
public class TestHashSet {
	public static void main(String args[])
	{
		HashSet<String> colors=new HashSet<String>();
		
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		colors.add("pink");
		colors.add("yellow");
		colors.add("orange");
		colors.add("white");
		colors.add("red");
		/*LocalDateTime ld = LocalDateTime.now();
		colors.add(ld);
		colors.add(new Boolean("false"));
		colors.add(new Integer("100"));
		colors.add(new Object());
		
		Iterator iter =colors.iterator();
		
		while(iter.hasNext()) {
			
			Object obj=iter.next();
			if(obj instanceof String) {
				String str=(String) iter.next();
				System.out.println(str);
			}
			else {
				System.out.println(obj);
			}
			
		}*/
		
		for(Object obj : colors)//enhanced for loop
		{
			System.out.println(obj);
		}
		
		System.out.println(colors);
		System.out.println(colors.size());
		System.out.println(colors.contains("purple"));
	}
}
