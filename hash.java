package miniproject;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class hash {
	public static void main(String[] args) {
		Set<Integer>hs=new HashSet<>();
		hs.add(43);
		hs.add(32);
		hs.add(62);
		System.out.println("hashset\n\tset:"+hs);
		Set<Integer>ls=new LinkedHashSet<>();
		ls.add(23);
		ls.add(12);
		ls.add(98);
		ls.add(43);
		System.out.println("linked list:"+ls);
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(54);
		ts.add(87);
		ts.add(21);
		ts.add(10);
		System.out.println("tree se:"+ts);
		ts.addAll(ls);
		System.out.println(ts);
		Map<Integer,String>hm
		=new HashMap<>();
		hm.put(2,"prema");
		hm.put(5, "sai");
		hm.put(3, "");
		//hm.put(null, "nani");
		hm.put(1, null);
		System.out.println("hashmap:"+hm);
		TreeMap<Integer,String>tm=new TreeMap<>();
		tm.put(9,"shilpa");
		tm.put(6, "sami");
		tm.put(2,"sai");
		tm.put(5, null);
		System.out.println("treemaps:"+tm);
		//tm.putAll(hm);
		//System.out.println(tm);
		for(Map.Entry<Integer,String> b:tm.entrySet()) {
			System.out.println(b.getKey()+""+b.getValue());
		}
		LinkedHashMap<Integer,String>lm=new LinkedHashMap<>();
		lm.put(1,"chinu");
		lm.put(6,"sai");
		lm.put(3, null);
		lm.put(null, null);
		System.out.println(lm);
		lm.putAll(lm);
		System.out.println(lm);
		
		
	}

}
