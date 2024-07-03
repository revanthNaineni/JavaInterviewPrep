package javaInterviewQs;


enum DayOfTheWeek implements TestI{
	MONDAY("Hello","World"){


		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			System.out.println("Test method is called Monday");
		}
		
	},
	TUESDAY("Hello","World") {
		@Override
		public void test() {
			System.out.println("Test method is called Tuesday");
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	},
	WEDNESDAY {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	},
    THURSDAY {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	},
    FRIDAY {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	},
    SATURDAY {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	},
    SUNDAY {
		@Override
		public void test() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}
	};
	
	 DayOfTheWeek() {
		 System.out.println("Enum constructor called");
	}

	
	DayOfTheWeek(String string, String string2) {
		System.out.println("Enum parameterised constructor called");
		System.out.println(string + " : " + string2);
	}
	 

	public static void close() {
    System.out.println("static method");		
	}
	
	public void nonclose() {
	    System.out.println("non static method");		
		}
	
	abstract public void test();

}

class EnumClass{
	
	public static void main(String[] args) {
		DayOfTheWeek dayOfTheWeek=DayOfTheWeek.MONDAY;
		
		  System.out.println(dayOfTheWeek.getClass().getSimpleName());
		  DayOfTheWeek.close();
		  DayOfTheWeek.FRIDAY.nonclose();
		  DayOfTheWeek.MONDAY.test();
		 
	}
	
}
