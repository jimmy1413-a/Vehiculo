

public class Motorcycle extends Vehicule
{
    public boolean hasSideCar;

    
    public Motorcycle(String brand,String model,boolean hasSidecar)
    {
        super(brand,model);
        this.hasSideCar = hasSidecar;
    }

    
    public void knight()
    {
        String s = "???";
        System.out.println(s);
    }
}
