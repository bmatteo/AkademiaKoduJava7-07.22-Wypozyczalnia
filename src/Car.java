public class Car {
    int vMax;
    double price;
    int capacity;
    String type;
    Engine engine;
    String status;

    public Car(){}

    public Car(int vMax, double price, int capacity, String type, Engine engine, String status) {
        this(vMax, price, capacity);
        this.type = type;
        this.engine = engine;
        this.status = status;
    }

    public Car(int vMax, double price, int capacity) {
        this.vMax = vMax;
        this.price = price;
        this.capacity = capacity;
    }

    void a(){
        System.out.println();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car(vMax = ");
        sb.append(vMax);
        sb.append(", price = ");
        sb.append(price);
        sb.append(", capacity = ");
        sb.append(capacity);
        sb.append(", type = ");
        sb.append(type);
        sb.append(", power = ");
        sb.append(engine.power);
        sb.append(", status = ");
        sb.append(status);
        sb.append(")");

        return sb.toString();
    }

    public void drive(){
        System.out.println("Jadę!");
    }

    class Engine {
        int power;
        int capacity;
    }
}
