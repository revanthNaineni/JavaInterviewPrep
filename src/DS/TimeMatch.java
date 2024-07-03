package DS;

public class TimeMatch {

	public static void main(String[] args) {
		
		String time="13:58";
		
		System.out.println(isValidTime(time));
		

	}

	private static boolean isValidTime(String time) {
		String[] strings = time.split(":");
		
		if((Integer.parseInt(strings[0])>=0 && Integer.parseInt(strings[0])<24) && (Integer.parseInt(strings[1])>=0 && Integer.parseInt(strings[1])<60)) {
			
			return true;
			
		}else {
			return false;
		}
	}

}
