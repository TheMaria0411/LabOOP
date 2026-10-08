public class Main {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing 737", 850, 41000f, 3, 12500, 15, "Emirates", 200, 30000f);
    
        System.out.println("1. Transport");
        boeing.move();
        System.out.println(boeing.transportInfo());
        boeing.stop();

        System.out.println("\n2. Aircraft");
        boeing.takeOff();
        System.out.println(boeing.aircraftInfo());
        boeing.land();

        System.out.println("\n3. Airplane");
        boeing.boarding(150);
        boeing.filling(35000f);
        System.out.println(boeing.airplaneInfo());
    }
}
