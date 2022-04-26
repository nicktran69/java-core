package sorting;

import java.util.Arrays;

class Sorting {

    /**
     * ------------------------------------------
     * Find a pair with the given sum in an array
     *
     * http://www.techiedelight.com/find-pair-with-given-sum-array/
     * ------------------------------------------
     */

    public static void findGivenSum(Integer[] intArrs, int givenSum) {
        // validate array
        if (intArrs.length < 1) {
            System.console().printf("Invalid array");
            System.console().printf("END program...");
        } else {
            for (Integer i : intArrs) {
                for (Integer j : intArrs) {
                    int tempSum = i + j;
                    if (tempSum == givenSum) {
                        System.out.print("Found a pair\n");
                        System.out.printf("Target = (%d, %d)", i, j);
                    }
                }
            }
        }
    }

    public static void findPair(Integer[] intArrs, int givenSum) {
        Arrays.sort(intArrs);
        for (Integer i : intArrs) {
            System.out.printf("%d \n", i);
        }

        // validate array
//        if (intArrs.length < 1) {
//            System.console().printf("Invalid array");
//            System.console().printf("END program...");
//        } else {
//            for (Integer i : intArrs) {
//                for (Integer j : intArrs) {
//                    int tempSum = i + j;
//                    if (tempSum == givenSum) {
//                        System.out.print("Found a pair\n");
//                        System.out.printf("Target = (%d, %d)", i, j);
//                    }
//                }
//            }
//        }
    }

    public static void main(String[] args) {
        //printConsoleObject();

        //readPasswordFromConsole();

        Integer[] intArrs = {7, 8, 9, 4, 8, 5};
        Integer expectedSum = 12;
        findPair(intArrs, expectedSum);

//        findGivenSum(intArrs, expectedSum);


//        double dNumb =12e3d;
//        float fNumb = 35E3f;
//
//
//        System.out.printf("%f", fNumb);
//
//        if (1 == 2) {
//            // block of code to be executed if condition1 is true
//        } else if ('a' == 'b') {
//            // block of code to be executed if the condition1 is false and condition2 is true
//        } else {
//            // block of code to be executed if the condition1 is false and condition2 is false
//        }
//
//        int x = ('a' =='b') ? 1 : 2;
//
//        int a = 1;
//        switch (a) {
//            case 1:
//                a= changeIntVal();
//            case 2:
//                a = 2;
//        }
//    }
//
//    private static Integer changeIntVal() {
//        Integer intNumbA = 0;
//
//        return intNumbA;
//
//    }
    }
}

