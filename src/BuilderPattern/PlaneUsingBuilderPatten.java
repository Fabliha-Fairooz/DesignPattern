package BuilderPattern;

public class PlaneUsingBuilderPatten {
    private int numOfWheels;
    private int numOfPassengers;
    private boolean willRunInGas;

    private PlaneUsingBuilderPatten() {

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

        public PlaneUsingBuilderPatten build() {
            PlaneUsingBuilderPatten plane = new PlaneUsingBuilderPatten();
            plane.numOfWheels = this.numOfWheels;
            plane.numOfPassengers = this.numOfPassengers;
            plane.willRunInGas = this.willRunInGas;
            return plane;
        }
    }

    public void run() {
        System.out.println(String.format("Plane using %d wheels, %d passengers and will run in gas %b", numOfWheels,
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