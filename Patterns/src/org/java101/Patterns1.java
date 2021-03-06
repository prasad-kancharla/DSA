package org.java101;

public class Patterns1 {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern2(5);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
        pattern12(5);
    }

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        int count = 0;
        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                count++;
            } else {
                count--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = n - noOfSpaces;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern7 (int n) {
        for (int i = 1 ; i <= n ; i++) {
            int noOfSpaces = i - 1;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = n - noOfSpaces;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern8 (int n) {
        for (int i = 1; i <= n ; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = 2 * i - 1;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern9 (int n) {
        for (int i = 1; i <= 5; i++) {
            int noOfSpaces = i - 1;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = 2 * (n - i) + 1;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern10 (int n) {
        for (int i = 1 ; i <= 5 ; i++) {
            int noOfSpaces = n - i;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = i;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11 (int n) {
        int noOfStars = n;
        for (int i = 1; i <= 5 ; i++) {
            int noOfSpaces = i - 1;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            noOfStars--;
            System.out.println();
        }
    }
    
    public static void pattern12 (int n) {
        for (int i = 1 ; i <= 2 * n ; i++) {
            int noOfSpaces = i <= 5 ? i : 2 * n - i + 1;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = i <= 5 ? n - i + 1 : i - 5;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}
