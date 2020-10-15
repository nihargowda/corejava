package eg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Collectors;

public class Stream_demo {

	public static void main(String[] args) {
		List<Integer> lis= new ArrayList<>(Arrays.asList(2,4,5,7,5,1,6));
		int su = lis.stream().filter(i->i>4).mapToInt(i->i).sum();
		System.out.println(lis);
		System.out.println(su);
		List<String> lisstring= new ArrayList<>(Arrays.asList("a","nihar","b","helo","hii","java","jvm"));
		List<String> results = lisstring.stream().sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		
	System.out.println(results);
	results= lisstring.stream().filter(s->s.length()>1&&s.length()<4).map(String::toUpperCase).sorted(Collections.reverseOrder()).collect(Collectors.toList());
	System.out.println(results);

	}

}
