public class Employee extends Person{
    
    public Employee(String name) {
        super(name);
    }

    @Override
    public boolean increasePay(int percent) {
        
        if(percent < INCREASE_CAP) {
            System.out.println("Increasing the salary of Employee " + getName() + " by " + percent + "%.");
            return true;
        }

        else{
            System.out.println("Sorry, cant increase hourly rate by more than " + INCREASE_CAP + "%.");
            return false;
        }
    
    }
}
