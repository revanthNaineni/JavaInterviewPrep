package javaInterviewQs;

public class QEnumRun {
	public static void main(String[] args) {
		QEnum dayOfTheWeek=QEnum.MONDAY;
		
		  System.out.println(dayOfTheWeek.getClass().getSimpleName());
		  QEnum.close();
		  QEnum.FRIDAY.nonclose();
		  QEnum.MONDAY.test();
		 
	}

}
