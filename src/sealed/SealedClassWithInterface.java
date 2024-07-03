package sealed;

sealed interface Drawable permits Circle1, Rectangle1, SemiCircle {
    // Interface body
}

final class Circle1 implements Drawable {
    // Class body
}

final class Rectangle1 implements Drawable {
    // Class body
}

final class Triangle1 implements Drawable {
    // Class body
}

interface SemiCircle extends Drawable{
	
}


public class SealedClassWithInterface {

}
