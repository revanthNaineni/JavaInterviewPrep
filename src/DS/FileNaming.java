package DS;

public class FileNaming {

	public static void main(String[] args) {
		
		String names [] = {"doc", "doc", "image", "doc(1)", "doc", "doc"};
		
		for (int i = 0; i < names.length; i++) {
			int count=0;
			for (int j = i+1; j < names.length; j++) {
				
				if(names[i].equals(names[j])) {
					++count;
					names[j]=names[j]+"("+count+")";
				}
				
			}
			
		}
		
		for (String string : names) {
			System.out.println(string);
		}
	}

}
