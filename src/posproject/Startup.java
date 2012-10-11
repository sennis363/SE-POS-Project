package posproject;

public class Startup {

    public static void main(String[] args) {
        

        
        CashRegister cr = new CashRegister();
        cr.startNewSale("12345");
        cr.addItemToSale("E169", 5);
        cr.addItemToSale("I363", 4);
        cr.outputReceiptData();
    }
}
