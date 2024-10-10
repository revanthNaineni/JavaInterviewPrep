package javaInterviewQs;


enum QEnum implements TestI{
	MONDAY("Hello1","World1"){


		@Override
		public void hello() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void test() {
			System.out.println("Test method is called Monday");
		}
		
	},
	TUESDAY("Hello2","World2") {
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
	
	 QEnum() {
		 System.out.println("Enum constructor called");
	}

	
	QEnum(String string, String string2) {
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
