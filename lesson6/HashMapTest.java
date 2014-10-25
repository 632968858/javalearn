import java.util.*;
public class HashMapTest {
	public static void print(Collection c)
	{
		Iterator it= c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void main(String[] args)
	{
		HashMap hm= new HashMap();
		hm.put("one","xiaoyu1");
		hm.put("two","xiaoyu2");
		hm.put("three","xiaoyu3");
		hm.put("four", "xiaoyu4");
		Set key=hm.keySet();
		Collection values=hm.values();
		System.out.println("key:");
		print(key);
		System.out.println("values:");
		print(values);
		Set enty=hm.entrySet();
		Iterator it =enty.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry)(it.next());
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
