package setClass;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {
	
	public static void main(String args[]) {
		HashSet<String> set = new HashSet<String>();
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test2");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}