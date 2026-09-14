public class IT26101780Lab7Q2B {
    public static void main(String[] args) {
        
        // Loop from 1 to 5 for rows
        for (int i = 1; i <= 5; i++) {
            
            // Print the row number and the prefix
            System.out.print(i + " - ");
            
            // Inner loop to print stars based on row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
