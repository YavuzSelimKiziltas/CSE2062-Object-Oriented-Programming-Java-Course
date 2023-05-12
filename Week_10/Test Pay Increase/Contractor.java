public class Contractor extends Person{
    
    public Contractor(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing the salary of Contractor " + getName() + " by " + percent + "%.");
        return true;
    }
}
