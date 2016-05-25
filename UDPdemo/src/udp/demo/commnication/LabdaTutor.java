package udp.demo.commnication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LabdaTutor {

	public LabdaTutor() {
		// TODO Auto-generated constructor stub
	}
 public static final List<String> friends=Arrays.asList("TBrayan","Tommy","Daney","Themothy","scotte");
 public static  List<String> res=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer > myList=new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add(i);
			
		}
		friends.stream().map(name->name.length()).forEach(count->System.out.println(count+" "));
		res=friends.stream().filter(name->name.startsWith("T")).collect(Collectors.toList());
		System.out.println("Size "+res.size());
		res.stream().forEach(name->System.out.println(name));
		
		
		
		
		
	
		
		
	}

}
