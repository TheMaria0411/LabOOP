public class Transport{
    private String name;
    private int maxSpeed;
    private float weight;

    public Transport(String name, int maxSpeed, float weight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public void move() {
        System.out.println(name + " starts motion");
    }

    public void stop() {
        System.out.println(name + " stops");
    }

    public String transportInfo() {
        return "Transport: " + name + ", Max speed: " + maxSpeed + " km/h, Weight: " + weight + " kg";
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
        else {
            System.out.println("Error: maxSpeed must be > 0");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        else {
            System.out.println("Error: weight must be > 0");
        }
    }
}
