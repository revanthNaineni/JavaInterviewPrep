package oOPS;

import modifierprotected.QProtected;

public class QProtectedSub extends QProtected{
	
	public void getInfo() {
		System.out.println(super.age);
		System.out.println(name);
		getDetails();
		
	}

}

class QProtectedSubSub extends QProtectedSub{
	
	public void getDesc() {
		System.out.println(age);
		System.out.println(name);
		getDetails();
		getInfo();
	}
}

class QProtectedMain{
	public static void main(String[] args) {
		QProtectedSubSub protectedSubSub=new QProtectedSubSub();
		protectedSubSub.getDesc();
	}
}
