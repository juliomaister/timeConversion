package timeConverter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
	 public static void main(String[] args) throws IOException {

	        String s = "12:45:54PM";
		    List<String> sList = Arrays.asList("12:45:54PM", "3:01:00AM", "6:01:00AM", "3:01:00PM", "8:01:00PM", "12:01:00PM");
	        
		    for (Iterator iterator = sList.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				String result = Result.timeConversion(string);
				System.out.println(result);
			}

	    }
}
