package Training;

class Box {
    double weight;
    double height;
    double breadth;

    Box(double w, double h, double b) {
        weight = w;
        height = h;
        breadth = b;
    }

    public double volume() {
        return weight * height * breadth;
    }
}

public class Program23 {
    public static void main(String[] args) {
        Box box1 = new Box(10.0, 20.0, 30.0);
        double volume = box1.volume();
        System.out.println("Volume of Box1: " + volume);
    }
}
