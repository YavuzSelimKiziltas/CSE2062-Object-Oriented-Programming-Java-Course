abstract public class Person {

    final int INCREASE_CAP = 20;
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void changeAddress(String address) {
        System.out.println("New Adress is " + address);
    }

    public String getName() {
        return name;
    }

    public void giveDayOff() {
        System.out.println(name + " has been given a day off");
    }

    public void promote(int percent) {
        increasePay(percent);
    }
    
    public abstract boolean increasePay(int percentage);
}

