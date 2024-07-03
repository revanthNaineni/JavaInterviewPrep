package strings;

 class CharacterCount {

	public static void main(String[] args) {

		String str= "InterviewBit eee";
		char ch='e';
		
		char [] arr=str.toCharArray();
		int j=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==ch) {
				j++;
			}
		}
		System.out.println(j);
	}

}
