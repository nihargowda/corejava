package pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
	public static void main(String args[]) {
List l1= new ArrayList();
l1.add(222);
l1.add("nihar");
l1.add(true);
l1.add(null);
l1.add("a");
l1.add('a');
l1.add("nihar");
System.out.println(l1);
List<Integer> lk=new LinkedList<>();
lk.add(222);
lk.add(333);
lk.add(null);
lk.add(222);
lk.add(32123);
lk.add(44);
System.out.println(lk);

System.out.println(lk.size());
lk.add(1,11111);
System.out.println(lk);
lk.set(2,3221);
System.out.println(lk);
System.out.println(lk.get(2));
for (int i = 0; i < lk.size(); i++) {
	System.out.println(lk.get(i));
	}
lk.remove(4);
System.out.println(lk);
Integer i=222;
lk.remove(i);
System.out.println(lk);
}}
