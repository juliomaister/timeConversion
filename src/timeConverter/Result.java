package timeConverter;

public class Result {
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	String[] hora = s.split(":");
    	int hour = Integer.valueOf(hora[0]);
    	if (s.contains("PM")) {
    		if (hour != 12) {
    			hour += 12;
			}
    	}else {
			if (hour == 12) {
				hour = 0;
			}
		}
    	return String.format("%02d:%s:%s",hour, hora[1], hora[2].substring(0, 2));


    }

}
