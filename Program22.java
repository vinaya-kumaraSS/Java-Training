package Training;
class Boxes{
	double width;
	double height;
	double depth;
	double volume()
	{
		return (width*height*depth);
	}
	void setvalue(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
}
public class Program22 {

	public static void main(String[] args) {
		Boxes Box1 = new Boxes();
		Boxes Box2 = new Boxes();
		Box1.setvalue(10, 20, 30);
		Box2.setvalue(5, 10, 15);
		System.out.println("volume of Box 1 :"+Box1.volume());
		
		System.out.println("volume of Box 2 :"+Box2.volume());
	}

}
