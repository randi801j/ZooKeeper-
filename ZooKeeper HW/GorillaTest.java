public class GorillaTest {
    public static void main(String[]args){
        Gorilla gorilla = new Gorilla(100);
        //Create a GorillaTest class to instantiate a gorilla and have it throw three things, 
        //eat bananas twice, and climb once.
        gorilla.throwBan();
        gorilla.throwBan();
        gorilla.throwBan();
        gorilla.eat();
        gorilla.eat();
        gorilla.climb();
        System.out.println(gorilla.energyLvl);
    }
}
