public class Airplane extends Aircraft{
    private String airline;
    private int maxPassengers;
    private float maxFuel;

    public Airplane(String name, int maxSpeed, float weight, int engineCnt, int maxHeight, int rateOfClimb, String airline, int maxPassengers, float maxFuel) {
        super(name, maxSpeed, weight, engineCnt, maxHeight, rateOfClimb);
        this.airline = airline;
        this.maxPassengers = maxPassengers;
        this.maxFuel = maxFuel;
    }

    public void boarding(int passengersCnt) {
        if (passengersCnt <= maxPassengers) {
            System.out.println("Boarding " + passengersCnt + " passengers on " + getName() + ", " + airline + " airlines");
        }
        else {
            System.out.println("Too many passengers for " + getName());
        }
    }

    public void filling(float fuel) {
        if (fuel <= maxFuel) {
            System.out.println("Filled with " + fuel + " l");
        }
        else{
            System.out.println("Full tank, extra " + (fuel - maxFuel) + " l");
        }
    }

    public String airplaneInfo() {
        return airline + " airlines, max " + maxPassengers + " passengers, max " + maxFuel + " l of fuel";
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        if (maxPassengers > 0) {
            this.maxPassengers = maxPassengers;
        }
        else {
            System.out.println("Error: maxPassengers must be > 0");
        }
    }
    public float getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(float maxFuel) {
        if (maxFuel > 0) {
            this.maxFuel = maxFuel;
        }
        else{
            System.out.println("Error: maxFuel must be > 0");
        }
    }
}
