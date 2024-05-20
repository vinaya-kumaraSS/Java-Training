package Training;
class Box{
	double width;
	double height;
	double depth;
	double volum()
	{
		return (width*height*depth);
	}
}
public class Program21 {

	public static void main(String[] args) {
		Box Box1 = new Box();
		Box Box2 = new Box();
		
		Box1.width = 50;
		Box1.height = 100;
		Box1.depth = 150;
		System.out.println("volume of Box 1 :"+Box1.volum());
		
		Box2.width = 10;
		Box2.height = 20;
		Box2.depth = 30;
		System.out.println("volume of Box 2 :"+Box2.volum());
	}

}
