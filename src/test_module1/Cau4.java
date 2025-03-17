package test_module1;

public class Cau4 {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void findPrimes(int[] numbers) {
            System.out.println("Cac so nguyen to trong mang la:");
            for (int num : numbers) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }

        public static void main(String[] args) {
            int[] numbers = {10, 13, 17, 4, 5, 18, 19, 23, 25, 29};

            findPrimes(numbers);
        }
    }
