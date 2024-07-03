package sealed;

 sealed class Shape permits Circle, Square, Triangle {
    // Class definition
}

 final class Circle extends Shape {
    // Class definition
}

 final class Square extends Shape {
    // Class definition
}

 final class Triangle extends Shape {
    // Class definition
}
 
 final class Rectangle extends Shape{
	 
 }
 


// Another attempt to subclass Shape (not permitted)
// This would result in a compilation error
// public class Rectangle extends Shape {
//     // Class definition
// }


public class SealedClass1 {

}
