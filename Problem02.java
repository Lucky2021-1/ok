import java.util.Scanner;
class Problem02 {
    public static void main(String[] arges) {

        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Please, insert a number: ");
            //receive input
            int number = input.nextInt();

           
            if (isPrime(number)) {
                System.out.println("Your number is prime");
            } else {
                System.out.println("Your number is not prime");
            }
        } catch (Exception e) {
            //catch an exception 
            System.out.println("What you entered was not a number");
        }

    }
    
    public static boolean isPrime(int number) {
        //number less than one is not prime number
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            //if number can be modulus by any number from 2 to its square number
            //then it is not prime
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}