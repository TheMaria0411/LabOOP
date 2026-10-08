public class Aircraft extends Transport{
    private int engineCnt;
    private int maxHeight;
    private int rateOfClimb;

    public Aircraft(String name, int maxSpeed, float weight, int engineCnt, int maxHeight, int rateOfClimb){
        super(name, maxSpeed, weight);
        this.engineCnt = engineCnt;
        this.maxHeight = maxHeight;
        this.rateOfClimb = rateOfClimb;
    }

    public void takeOff(){
        System.out.println(getName() + " takes off");
    }

    public void land() {
        System.out.println(getName() + " lands");
    }

    public String aircraftInfo() {
        return "Count of engines: " + engineCnt + ", Max height: " + maxHeight + " m, Rate of climb: " + rateOfClimb + " m/s";
    }

    public int getEngineCnt(){
        return engineCnt;
    }

    public void setEngineCnt(int engineCnt){
        if (engineCnt > 0) {
            this.engineCnt = engineCnt;
        }
        else {
            System.out.println("Error: engineCnt must be > 0");
        }
    }

    public int getMaxHeight(){
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight){
        if (maxHeight > 0) {
            this.maxHeight = maxHeight;
        }
        else {
            System.out.println("Error: maxHeight must be > 0");
        }
    }

    public int getRateOfClimb(){
        return rateOfClimb;
    }

    public void setRateOfClimb(int rateOfClimb){
        if (rateOfClimb > 0) {
            this.rateOfClimb = rateOfClimb;
        }
        else {
            System.out.println("Error: rateOfClimb must be > 0");
        }
    }
}
