package sealed;

sealed interface Drawable permits SemiCircle {
    // Interface body
}



non-sealed interface SemiCircle extends Drawable{
	
}


public class SealedInterfaceWithInterface {

}
