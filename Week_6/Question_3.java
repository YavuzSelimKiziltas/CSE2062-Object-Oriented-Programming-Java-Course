public class Question_3 {
    public static void main(String[] args) {
        
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        System.out.println("The Price-Change Percent = %" + stock.getChangePercent());
    }
}
