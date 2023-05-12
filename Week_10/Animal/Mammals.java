public class Mammals implements Animal{

    @Override
    public void eat() {
        System.out.println("All mammals eat something.");
    }

    @Override
    public void travel(int legs) {
        if(legs > 0)
            System.out.println("A Mammal with " + numberOfLegs(legs) + " legs can travel." );
        else
            System.out.println("Given Animal has no leg.");
    }

    public int numberOfLegs(int legs) {
        return legs;
    }

    public static void main(String[] args) {
        
        Mammals mammal_1 = new Mammals();   
        mammal_1.eat();
        mammal_1.travel(4);
    }
    
}
