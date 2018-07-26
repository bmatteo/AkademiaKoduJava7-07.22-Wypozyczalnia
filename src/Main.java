import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Car[] carsList = new Car[100];

        Car c1 = new Car();
        c1.vMax = 200;
        c1.price = 200;
        c1.capacity = 4;
        c1.type = "Sedan";
        c1.engine.power = 200;
        c1.status = "FREE";

        c1.drive();

        addCar(c1, carsList);

        System.out.println(carsList[0]);

        Kwadrat kwadrat = new Kwadrat(5);





        kwadrat.setBok(7);
        System.out.println(kwadrat.getBok());
        System.out.println(kwadrat.getPole());




        /*lastAddedCarPosition = addCar("200", "300", "4",
                "Cabrio", "300", "FREE",
                carsList, lastAddedCarPosition);

        lastAddedCarPosition = addCar("210", "200", "5",
                "Sedan", "140", "FREE",
                carsList, lastAddedCarPosition);

        lastAddedCarPosition = addCar("190", "130", "5",
                "Sedan", "99", "FREE",
                carsList, lastAddedCarPosition);

        System.out.println(Arrays.toString(carsList[0]));
        System.out.println(Arrays.toString(carsList[1]));
        System.out.println(Arrays.toString(carsList[2]));
        System.out.println(lastAddedCarPosition);*/

    }

    public static void addCar(Car car, Car[] carsList) {


        if(RentCarsUtil.lastAddedCarPosition == null) {
            RentCarsUtil.lastAddedCarPosition = 0;
        } else {
            RentCarsUtil.lastAddedCarPosition = RentCarsUtil.lastAddedCarPosition + 1;
        }

        carsList[RentCarsUtil.lastAddedCarPosition] = car;
    }
}
