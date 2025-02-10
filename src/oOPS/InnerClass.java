package oOPS;

import oOPS.OC.IC1;
import oOPS.OC.SIC1;

class OC {
	private int age = 20;
	
	public OC() {
		System.out.println("OC outer class constructor called");
	}
	
	public static void EPLTeam() {
		System.out.println("LIV");
	}
	public void height() {
		System.out.println(5.3);
		age=age+20;
		 class HeightmethodInnerClass{
			public static int speed=20;
			String type;
			  
			
			public static void iPLTeam() {
				System.out.println("SRH");
				//System.out.println(age);
				System.out.println();
			}
			static class HeightmethodInnerInnerClass{
				int speed4=40;
				void method1() {
					System.out.println("HeightmethodInnerInnerClass");
					//System.out.println(type);
					class Dembele{
						//static size=0;
						public int speed2=20;
						 void dribbler() {
							 speed4=60;
							 speed2=speed4+20;
							System.out.println("Ousmane Dembele"+speed2);

						}
					}
					Dembele dembele=new Dembele();
					dembele.dribbler();
					
				}
			}
		}
		
		HeightmethodInnerClass class1=new HeightmethodInnerClass();
		HeightmethodInnerClass.HeightmethodInnerInnerClass class2=new HeightmethodInnerClass.HeightmethodInnerInnerClass();
		class2.method1();
		System.out.println(HeightmethodInnerClass.speed);
		System.out.println(class1.type);
		//class1.team();
		HeightmethodInnerClass.iPLTeam();
		
	
	}

	 class IC1 {
		
		public IC1(){
			System.out.println("Inner class IC1 constructor called");
		}
		int jerseyNo=7;
		static String clubName="Barca";
		public void IC1Method() {
			System.out.println("Inside inner class method");
			System.out.println(age);
			height();
			EPLTeam();
		}
		public static void IC1Method2() {
			System.out.println("Inside inner class static method");
			//height();
		}
	}
	
	static class SIC1{
		String league="Laliga";
		
		SIC1(){
			System.out.println("Static Inner class SIC1 constructor called");
		}
		public void var() {
			System.out.println("Var is checking");
			
		}
		
		public static void offside() {
			System.out.println("offside");
			EPLTeam();
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		OC oc=new OC();
		//System.out.println(oc.age);
		oc.height();
		OC.IC1 ic1=oc.new IC1();
		ic1.IC1Method();
		System.out.println(ic1.jerseyNo);
		OC.IC1.IC1Method2();
		System.out.println(IC1.clubName);
		OC.SIC1 name=new OC.SIC1();
		System.out.println(name.league);
		name.var();
		SIC1.offside();
	}

}
