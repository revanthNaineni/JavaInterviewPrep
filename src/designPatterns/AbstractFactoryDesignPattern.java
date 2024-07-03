package designPatterns;

//Abstract Product A
interface Window {
	void render();
}

//Concrete Product A1
class WindowsWindow implements Window {
	@Override
	public void render() {
		System.out.println("Rendering a Windows window.");
	}
}

//Concrete Product A2
class MacWindow implements Window {
	@Override
	public void render() {
		System.out.println("Rendering a Mac window.");
	}
}

//Abstract Product B
interface Button {
	void click();
}

//Concrete Product B1
class WindowsButton implements Button {
	@Override
	public void click() {
		System.out.println("Clicked a Windows button.");
	}
}

//Concrete Product B2
class MacButton implements Button {
	@Override
	public void click() {
		System.out.println("Clicked a Mac button.");
	}
}

//Abstract Factory
interface GUIFactory {
	Window createWindow();

	Button createButton();
}

//Concrete Factory 1
class WindowsFactory implements GUIFactory {
	@Override
	public Window createWindow() {
		return new WindowsWindow();
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}

//Concrete Factory 2
class MacFactory implements GUIFactory {
	@Override
	public Window createWindow() {
		return new MacWindow();
	}

	@Override
	public Button createButton() {
		return new MacButton();
	}
}

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
		GUIFactory factory = new WindowsFactory();
		Window window = factory.createWindow();
		Button button = factory.createButton();

		window.render(); // Output: Rendering a Windows window.
		button.click();  // Output: Clicked a Windows button.

		factory = new MacFactory();
		window = factory.createWindow();
		button = factory.createButton();

		window.render(); // Output: Rendering a Mac window.
		button.click();  // Output: Clicked a Mac button.
	}

}
