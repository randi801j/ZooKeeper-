//This class will be inheriting by both Bat and Gorilla
public class Animals {
    // What does both animal need that have in common? Energy 
    protected int energyLvl;

    public Animals(int energylvl){
        this.energyLvl = energylvl;
    }
    public int getenergylvl(){
        return energyLvl;
    }
    public int setenergyLvl(){
        return energyLvl;
    }
}
