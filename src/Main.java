public class Main {

    public static void main(String[] args) {
	    VeredaGT miVehiculo = new VeredaGT("VeredaGT3000", "DCS1234", 10);

        miVehiculo.energyLevel();
        miVehiculo.recharge();
        miVehiculo.move();
        miVehiculo.status();
    }
}
