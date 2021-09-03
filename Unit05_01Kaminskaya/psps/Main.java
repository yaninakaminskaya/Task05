package psps;

public class Main {

	public static void main(String[] args) {
		
		Triangle b1 = new Triangle(6,5,7);
		
		int perim = b1.perimeter(b1);
		double ar = b1.area(b1, perim);
		
		System.out.println("Периметр - " + perim + ". Площадь - " + ar + ".");
	}
}
