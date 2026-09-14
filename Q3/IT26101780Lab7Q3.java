import java.util.Scanner;

public class IT26101780Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int customerCount = 1;
        
        // Loop to enter details for 5 customers
        while (customerCount <= 5) {
            System.out.println("Customer " + customerCount);
            
            System.out.print("Enter Total Bill Amount: ");
            double totalBill = input.nextDouble();
            
            char paymentMode;
            // Loop to validate payment mode input
            while (true) {
                System.out.print("Enter Payment Mode (C/O): ");
                paymentMode = input.next().charAt(0);
                
                // Check if the input is valid ('C', 'c', 'O', or 'o')
                if (paymentMode == 'C' || paymentMode == 'c' || paymentMode == 'O' || paymentMode == 'o') {
                    break; // Exit the validation loop if valid
                } else {
                    System.out.println("Payment Mode is Not Valid");
                }
            }
            
            double discount = 0;
            // Calculate 5% discount only if paid by cash
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * 0.05;
            }
            
            double amountPaid = totalBill - discount;
            
            // Display outputs
            System.out.println("Discount : " + discount);
            System.out.println("Amount to be Paid : " + amountPaid);
            System.out.println(); // Blank line for formatting
            
            customerCount++;
        }
        
        input.close();
    }
}
