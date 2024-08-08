interface Vehicles {
    public abstract int getNoOfWheels(int x);
   public abstract String name(String n);

}
abstract class Auto implements Vehicles {
    @Override
    public int getNoOfWheels(int x) {
        return x;
    }
}

class Car extends Auto {
    @Override
    public String name(String x) {
        return x;
    }
}

public class In {
    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.name("Alto"));
    }
}
