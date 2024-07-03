package DS;

public class AreaPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		int area = findArea(n);
		
		System.out.println(area);

	}

	private static int findArea(int n) {
		int k=(n-1)*(n-1);
		
		int j=n*n;
		
		int area= k+j;
		
		return area;
	}

}
