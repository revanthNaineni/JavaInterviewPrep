package initializationBlocks;

public class IntializationBlocks2 {
	int age;

	 static{
    	 System.out.println("staic blocks");
    	 IntializationBlocks2 blocks2=new IntializationBlocks2();
    	 blocks2.age=20;
     }
	public static void main(String[] args) {
      System.out.println("Main Method");
    
	}

}
