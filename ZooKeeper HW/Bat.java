public class Bat extends Animals{
    public Bat (int energyLvl){
        super(energyLvl);
    }
    public void fly(){
        System.out.println ("Woosh!The Bats are coming the Bats are coming! ");
        this.energyLvl-=50;

    }
    public void eatHumans(){
        System.out.println("AHHHHH! My Leg! My Leg!");
        this.energyLvl+=25;
    }
    public void attackTown(){
        System.out.println("Ahhh! Bats!");
        this.energyLvl -=100;

    }
}
