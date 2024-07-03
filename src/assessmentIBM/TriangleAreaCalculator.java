package assessmentIBM;

/*Given 3 sets of distinct coordinates that form a triangle, determine the area of the triangle. At least one of the sides will be parallel to the x or yaxis.

Example

X=[0, 3, 0] y=[0, 5, 2]

Aligned by index, the 3 coordinates are [0,0], [3,5], [0,2]. The base of the triangle is 2, and the height is 3. The area of a triangle is (base height)/2, so 3* 2/2= 3. All resulting areas will be whole numbers.
Function Description

Complete the function get TriangleArea in the editor below.

getTriangleArea has the following parameter(s): int x [3]: An integer array that denotes the x coordinates.

int y[3]: An integer array that denotes the y coordinates, aligned with x by index.

Returns:

long int: the area of the triangle*/


public class TriangleAreaCalculator {

    public static long getTriangleArea(int[] x, int[] y) {
        int base = Math.abs(x[0] - x[2]); // Calculate the base length
        int height = Math.abs(y[0] - y[1]); // Calculate the height

        long area = (long) (base * height) / 2; // Calculate the area using the formula

        return area;
    }

    public static void main(String[] args) {
        int[] x = {0, 3, 0};
        int[] y = {0, 5, 2};
        long area = getTriangleArea(x, y);
        System.out.println("Area of the triangle is: " + area);
    }
}

