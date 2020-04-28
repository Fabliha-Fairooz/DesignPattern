package BuilderPattern;

public class CarUsingBuilderPatten {
    private int numOfWheels;
    private int numOfPassengers;
    private boolean willRunInGas;

    private CarUsingBuilderPatten() {

    }

    public static class Builder {
        private int numOfWheels;
        private int numOfPassengers;
        private boolean willRunInGas;

        public Builder() {

        }

        public Builder withTotalWheels(int wheels) {
            this.numOfWheels = wheels;
            return this;
        }

        public Builder withPassengerMaxCapacity(int numOfPassengers) {
            this.numOfPassengers = numOfPassengers;
            return this;
        }

        public Builder withGasEngine(boolean willRunInGas) {
            this.willRunInGas = willRunInGas;
            return this;
        }

        public CarUsingBuilderPatten build() {
            CarUsingBuilderPatten car = new CarUsingBuilderPatten();
            car.numOfWheels = this.numOfWheels;
            car.numOfPassengers = this.numOfPassengers;
            car.willRunInGas = this.willRunInGas;
            return car;
        }
    }

    public void run() {
        System.out.println(String.format("Car using %d wheels, %d passengers and will run in gas %b", numOfWheels,
                numOfPassengers, willRunInGas));
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public boolean hasGas() {
        return willRunInGas;
    }
}