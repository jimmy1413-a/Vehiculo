

public class Car extends Vehicule
{
    private int doors;
    

    
    public Car()
    {
        
       
    }
     public Car(String brand,String model,int doors)
    {
        super ( brand,model);
        this.doors = doors;
       
    }
    
    public int getDoors(){
        return doors;
    }
    
    public void setDoors(int doors){
        this.doors = doors;
    }

    
    public void openDoors()
    {
        String s = "abriendo puertas";
        System.out.println(s);
        
    }
    
    
}
