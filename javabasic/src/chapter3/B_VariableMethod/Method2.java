package chapter3.B_VariableMethod;

class Triangle{
	double underside;
	double height;
	double hypotenuse;
	
	double area;
	double circum;
}

class TriangleFormula{
	
	// 파라미터로 참조변수를 받는다면 메모리 주소가 복사되어 넘어오기 때문에
	// 실제 작업도 해당 메모리 주소에서 작업을 진행함
	//실제 데이터가 변경됨
	static void setArea(Triangle triangle) {
		double area = 0.5 * triangle.underside * triangle.height;
		triangle.area = area;
	}
	
	static void setHypotenuse(Triangle triangle) {
		double squareHypotenuse = Math.pow(triangle.underside, 2) + Math.pow(triangle.height, 2);
		double hypotenuse = Math.sqrt(squareHypotenuse);
		triangle.hypotenuse = hypotenuse;
	}
	
	static void setCircum(Triangle triangle) {
		triangle.circum = triangle.height + triangle.underside + triangle.hypotenuse;
	}
	
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle();
		
		triangle.underside = underside;
		triangle.height = height;
		setHypotenuse(triangle);
		setArea(triangle);
		setCircum(triangle);
		
		return triangle;
	}
	
}

public class Method2 {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		triangle1.underside = 3;
		triangle1.height = 4;
		triangle1.hypotenuse = 5;
		
		TriangleFormula.setArea(triangle1);
		System.out.println(triangle1.area);
		
		Triangle triangle2 = TriangleFormula.createTriangle(6, 8);
		System.out.println(triangle2.area);
		System.out.println(triangle2.hypotenuse);
		
	}

}
