public class Main {
    public static void main(String[] args) {

        Bicycle b1 = new Bicycle("bicycle1", 2);
        Bicycle b2 = new Bicycle("bicycle2", 2);
        Car c1 = new Car("car1", 4);
        Car c2 = new Car("car2", 4);
        Truck t1 = new Truck("truck1", 6);
        Truck t2 = new Truck("truck2", 8);

        ServiceStation station = new ServiceStation();

        WheeledTransport[] wheeledTransport = {b1, b2, c1, c2, t1, t2};

        for (WheeledTransport transport : wheeledTransport) {
            station.check(transport);
        }
    }
}