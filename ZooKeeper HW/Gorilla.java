// Have to inherit from Animal class so we add... extends
public class Gorilla extends Animals{
    public Gorilla (int energyLvl){
        super(energyLvl);
    }
    public void throwBan(){
        System.out.println ("Gorilla has thrown Bananna!");
        this.energyLvl-=5;

    }
    public void eat(){
        System.out.println("Gorilla has eaten a bananna!");
        this.energyLvl+=10;
    }
    public void climb(){
        System.out.println("Gorilla is climbing a tree!");
        this.energyLvl -=10;
    }
}
