package lessons._8;


public class Main {
    public static void main(String[] args) {
        Car[] cars={new Car(1, "BMW", "X5 ", 2005, "Black", 50000, 12345),
                new Car  (2, "Mazda", "6 ", 2003, "White", 20000, 34567),
                new Car  (3, "Audi", "Q8", 2019,  "Black", 70000, 76567),
                new Car  (4, "Audi", "A7 ", 2019, "Brown ", 60000, 43567),
                new Car  (5, "Mazda", "3 ", 2000, "White ", 15000, 82567),
                new Car  (6, "Subaru", "Impreza ", 2007, "Black", 10000, 78567),
                new Car  (7, "Audi", "Q7", 2017, "Black", 55000, 65567),
                new Car  (8, "Audi", "Q5", 2016, "White", 35000, 23567),

        };
        Processor processor = new Processor();
        processor.listOfMarka(cars, "BMW");
        processor.listOfModel(cars, "X5",2005);
        processor.listCarsOfYaerAndPrice(cars,2005,50000);
    }

}
