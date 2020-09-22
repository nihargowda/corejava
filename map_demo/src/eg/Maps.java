package eg;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		Map<Integer,String> ht= new HashMap<>();
ht.put(5,"nihar");
ht.put(4, "bunty");
ht.put(3, "vviet");
ht.put(2,"java");
ht.put(1,null);
System.out.println(ht);
ht.remove(5);
System.out.println(ht);
System.out.println(ht.containsKey(1));
System.out.println(ht.containsValue("vviet"));
for(Entry<Integer,String> sss:ht.entrySet()) {
	System.out.println(sss.getKey()+""+sss.getValue());
}


		

	}

}