public class VeredaGT implements Vehicle{

    private String name;
    private String matricula;
    private final int maxEnergy = 100;
    private float energy = 50;
    private int movementCount = 0;
    private int energyDelta;

    public VeredaGT(String name, String matricula, int energyDelta) {
        this.name = name;
        this.matricula = matricula;
        this.energyDelta = energyDelta;
    }

    @Override
    public float energyLevel() {
        System.out.println("\nEl nivel actual de la batería es: " + energy);
        return energy;
    }

    @Override
    public void recharge() {

        if (energy == 100){
            System.out.println("ERROR! -> Su vehículo ya está cargado al máximo");
        }else{
            energy = maxEnergy;
            System.out.println("\nLa batería ha sido cargada al máximo");
        }
    }

    @Override
    public void move() {

        if (energy <= 0){
            System.out.println("ERROR! -> No puede moverse, su vehículo no tiene batería.");
        }else{
            energy = energy - energyDelta;
            movementCount ++;
            System.out.println("\nEl vehículo " + name + " se ha movido.");
            System.out.println("Nº de movimientos: " + movementCount);
            System.out.println("Desgaste de la batería: -" + energyDelta);
        }
    }

    @Override
    public String status() {
        System.out.println("\nEl vehículo " + matricula + " tiene un nivel de carga de: " + energy +
                " y se ha movido " + movementCount + " veces");
        return null;
    }
}
