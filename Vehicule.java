

public class Vehicule
{
    private String brand;
    private String model;

    
    public Vehicule()
    {
        // initialise instance variables
        
    }
    public Vehicule(String brand,String model)
    {
        this.brand = brand;
        this.model = model;
        
    }
    
    public void acelerar ()
    {
        String s = "este auto esta acelerando";
        System.out.println(s);
    }
    
    public void frenar  ()
    {
        String s = "este auto esta frenando";
        System.out.println(s);
    }
    
    public void viewinfo(){
        
        System.out.println("el fabricante es: " + this.brand + 
        "su modelo es: " + this.model);
    }
}
