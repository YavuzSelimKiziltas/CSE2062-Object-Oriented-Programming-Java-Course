public class TestPayIncrease {
    public static void main(String[] args) {
        
        /* This can be written as -> Person workers[] = new Person[3]; */
        Object workers[] = new Object[3];
        
        workers[0] = new Employee("Oguzhan");
        workers[1] = new Contractor("Mehmet");
        workers[2] = new Employee("Ayse");

        for (Object worker : workers) {
            ((Person) worker).promote(35);
        }
    }
}