package eg1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainBody {

	public static void main(String[] args) {
		java.util.List<Product> list = new ArrayList<>();
		list.add(new Product(1,"tv",23,3.6f) );
		list.add(new Product(3,"tv",26,3.7f) );
		list.add(new Product(4,"tv",23,2.9f) );
		list.add(new Product(2,"tv",19,3.0f) );
		list.add(new Product(0,"tv",20,3.1f) );
		printproducts(list);
		
		Collections.sort(list,(Product p1,Product p2)->{
			Double d1= p1.getCost();
			Double d2= p2.getCost();
			return d2.compareTo(d1);});
		System.out.println("\nprinting products based on cost");
		printproducts(list);
		Collections.sort(list,(Product p1,Product p2)->
		{
	
		Float f1= p1.getRating();
		Float f2= p2.getRating();
		int x= f2.compareTo(f1);
		if(x==0) {
			Double d1= p1.getCost();
			Double d2= p2.getCost();
			x=d1.compareTo(d2);
					}
		return x;
				
	});
		System.out.println("\n printing products based on rating and if same rating sorting based on cost");
		printproducts(list);


	}
	
		public static void printproducts(java.util.List<Product> list){
			for(Product p:list)
			{
				System.out.println(p);
			}

	

}}
