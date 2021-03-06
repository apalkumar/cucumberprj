import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class convertandaddelementinarraylist {
	
	public static void main(String[] args) {
		
//		Third Approach Using Collection
		String[] strArrayNewer = {"Gwalior","Agra","Faridabad","Delhi"};
		List<String> strArrlistNewer = new ArrayList<String>();
//		BElow three lines throw compilation error
//		List<String> strArrlistNewer = Arrays.asList(strArrayNewer);
//		strArrlistNewer.add("To Check");
//		strArrlistNewer.add("To Check Again");
		Collections.addAll(strArrlistNewer, strArrayNewer);
		System.out.println(strArrlistNewer);
		
//		Convert Array to Array List
		String[] strArray = {"Anil","Neeraj","Bro","Gwalior"};
		ArrayList<String> strArrlist = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(strArrlist);
//		Adding element in arraylist
		strArrlist.add("New");
		strArrlist.add("Old");
		System.out.println(strArrlist);
		
//		Second Approach which throws an error i.e. java.lang.UnsupportedOperationException
		String[] strArrayN = {"Kumar","Singh","Rajput","Chauhan"};
		List<String> strArrlistN = Arrays.asList(strArrayN);
		System.out.println(strArrlistN);
//		Adding element in arraylist
		strArrlistN.add("Newest");
		strArrlistN.add("Oldest");
		System.out.println(strArrlistN);
				

		
		
		
		
		
		}
	}


