import java.util.ArrayList;
import java.util.Arrays;

public class duplicateremovalarraylistbyself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,1,2,3,6,7,5,8,9,10));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anil");
		list.add("Anil");
		list.add("Shubhra");
		list.add("Shubhra");
		list.add("Srishti");
		list.add("Srishti");
		list.add("Paal");
		list.add("Paal");
		list.add("Paal");
		list.add("Paal");
		list.add("Paal");
		list.add("Paal");
		
		
		
//		list.addAll(list);
		System.out.println("Array List containing the Duplicates-->"+list);
		
//		ArrayList<Integer> NewList = new ArrayList<Integer>();
		ArrayList<String> NewList = new ArrayList<String>();
		
//		for(int element : list) {
//			if(!NewList.contains(element)) {
//				NewList.add(element);
//			}
//		}
	
		  for (int i = 0; i < list.size(); i++) {
	            for (int j = 1; j < list.size(); j++) {
	                if (list.get(i) == list.get(j)) {
	                	list.remove(j);
	                }
	            }
		  }
		  System.out.println("After remove duplicate items : "+list);
		
		
		for(String element : list) {
			if(!NewList.contains(element)) {
				NewList.add(element);
			}
		}
	
		
		
//		System.out.println("Array List with Unique Value-->"+NewList);
		System.out.println("Array List with Unique Value-->"+NewList);

	}

}
