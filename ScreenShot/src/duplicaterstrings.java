import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class duplicaterstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,6,7,5,8,9,10));
		
		String[] geeks = {"Anil","Shubhra","Srishti","Paal", "Paal"};
		
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(geeks));
		System.out.println(list);
//		list.add("Anil");
//		list.add("Anil");
//		list.add("Shubhra");
//		list.add("Shubhra");
//		list.add("Srishti");
//		list.add("Srishti");
//		list.add("Paal");
//		list.add("Paal");
//		list.add("Paal");
//		list.add("Paal");
//		list.add("Paal");
//		list.add("Paal");

//		-------------------Two Approaches-----------------------------------------------------------
//		LinkedHashSet NewList = new LinkedHashSet(list);
//		System.out.println(NewList);
//		Second Approach
//		Set<Integer> NewList = new LinkedHashSet<Integer>(list);
//		System.out.println(NewList);
//		-------------------For Strings-----------------------------------------------------------
//		Set<String> NewList = new LinkedHashSet<String>(list);
//		System.out.println(NewList);
		LinkedHashSet NewList = new LinkedHashSet(list);
		System.out.println(NewList);
		
		
	}
}
