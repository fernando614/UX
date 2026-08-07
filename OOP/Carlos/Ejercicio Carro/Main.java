public class Main {

    public static void main(String args[]) {

        // INSTANCIAS

        Car tesla = new Car("Model S", "Tesla", "Red", true);
        Car bocho = new Car("Model 1980", "Volkswagen", "Yellow", false);
        Car audi = new Car("R8", "Audi", "Black", true);
        Car mazda = new Car("3", "Mazda", "Blue", true);
        Car civic = new Car("Sport", "Honda", "White", false);

        // ARREGLO DE CARROS

        Car[] cars = new Car[5];
        cars[0] = tesla;
        cars[1] = bocho;
        cars[2] = audi;
        cars[3] = mazda;
        cars[4] = civic;

        // MÉTODOS

        tesla.accelerate();

        System.out.println("\nCarros listos para venderse:");
        tesla.filteredSafeCar(cars);
    }
}

class Car {

    // ATRIBUTOS

    String name;
    String brand;
    String color;
    boolean isSafe;

    // CONSTRUCTOR

    public Car(String name, String brand, String color, boolean isSafe) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.isSafe = isSafe;
    }

    // MÉTODO PARA FILTRAR LOS CARROS SEGUROS

    public void filteredSafeCar(Car[] cars) {

        for (int i = 0; i < cars.length; i++) {

            if (cars[i].isSafe) {
                System.out.println(cars[i].name + " listo para venderse");
            }

        }

    }

    // MÉTODO ACELERAR

    void accelerate() {
        System.out.println(brand + " is accelerating.");
    }

}