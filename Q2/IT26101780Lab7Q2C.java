public class IT26101780Lab7Q2C {
    public static void main(String[] args) {
        
        // Outer loop: starts from 5 and goes down to 1
        for (int i = 5; i >= 1; i--) {
            
            // Inner loop: runs 'i' times to print the number
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            
            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
