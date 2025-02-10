package strings;

public class RemoveUnderscoresAndConvertFirstLetterToUpperCase {

	public static void main(String[] args) {

		String str="remove_underscores_here";
		String replaceAll = str.replaceAll("_", "");
		String sub=str.substring(0,1);
		System.out.println(sub);
		String replaceFirst = replaceAll.replaceFirst(sub, sub.toUpperCase());
		System.out.println(replaceFirst);

	}

}
