package oOPS;

import java.util.ArrayList;
import java.util.List;

interface Window{
	void render();
}

class WindowsWindow implements Window{

	@Override
	public void render() {
		System.out.println("Windows window rendering");
		
	}
	
}

class MacWindow implements Window{

	@Override
	public void render() {
		System.out.println("Mac window rendering");
	}
	
}

interface Button{
	void click();
}

class WindowsButton implements Button{

	@Override
	public void click() {
		System.out.println("WindowsButton clicked");
	}
	
}

class MacButton implements Button{

	@Override
	public void click() {
		System.out.println("MacButton clicked");
	}
	
}

interface Factory{
	Window windowsInstance();
	Button buttonInstance();
}

class WindowsFactory implements Factory{

	@Override
	public Window windowsInstance() {
		// TODO Auto-generated method stub
		return new WindowsWindow();
	}

	@Override
	public Button buttonInstance() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}
	
}

class ButtonFactory implements Factory{

	@Override
	public Window windowsInstance() {
		// TODO Auto-generated method stub
		return new MacWindow();
	}

	@Override
	public Button buttonInstance() {
		// TODO Auto-generated method stub
		return new MacButton();
	}
	
}



public class Aggregation {

	public static void main(String[] args) {
		Factory windowsFactory = new WindowsFactory();
		Window windowsInstance = windowsFactory.windowsInstance();
		windowsInstance.render();
		Button buttonInstance = windowsFactory.buttonInstance();
	}

}
