/* Author: Isaac Gyamfi
ID: 10661943
A Java program to perform some functions in Mathematics and Statistics
Functions:
1. Addition, add
2. Mean, findMean
3. Median, findMedian
4. Mode, findMode
5. Standard Deviation, findStdDev
6. Variance, findVariance
7. Coefficient of variation, findCoV
8. Range, findRange
9. Maximum value, findMax
10. Minimum value, findMin
11.

*/

//TODO:

package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Method to create the addition of the arrays
    private static double addition(double[] add) {
        double sum = 0;
        int x;
        for(x = 0; x < add.length; x++) {
            sum += add[x];
        }
        return sum;
    }
    // Method to create the mean of the arrays
    private static double findMean(double[] meanArr) {
        double mean;
        double sum = addition(meanArr);
        mean = sum / meanArr.length;
        return mean;
    }
    // Method to create the median of the arrays
    private static double findMedian(double[] medianArr) {
        double median;
        Arrays.sort(medianArr); // sort the arrays using the Array class

        int middle = medianArr.length / 2;
        if (medianArr.length % 2 == 1) {
            median = medianArr[middle];
        } else {
            median = (medianArr[middle - 1] + medianArr[middle]) / 2;
        }
        return median;
    }
    // create a function to calculate the mode
    private static double findMode(double[] modeArr) {
        double mode = 0.0;
        int countMode = 0, currentCount = 0;

        for (double checkMode : modeArr) {
            currentCount = 0;
            for (double element : modeArr) {
                if (checkMode == element) {
                    currentCount++;
                }
            }
            if (currentCount > countMode) {
                countMode = currentCount;
                mode = checkMode;
            }
        }
        return  mode;
    }
    // create a function to calculate the standard deviation
    private static double findStdDev(double[] stdDevArr) {
        int i;
        double stdDev, mean = findMean(stdDevArr), sqSum = 0.0;
        for (i = 0; i < stdDevArr.length; i++) {
            sqSum += Math.pow((stdDevArr[i] - mean), 2);
        }
        stdDev = Math.sqrt(sqSum/stdDevArr.length);
        return stdDev;
    }
    // create a function to calculate the variance
    private static double findVariance(double[] varArr) {
        double variance, stdDev = findStdDev(varArr);
        variance = Math.pow(stdDev, 2);
        return variance;
    }
    // create a function to calculate the co-efficient of variation
    private static double findCov(double[] covArr) {
        double cov, mean = findMean(covArr), stdDev = findStdDev(covArr);
        cov = stdDev / mean;
        return cov;
    }
    // create a function to calculate the range
    private static double findRange(double[] rangeArr) {
        double range = 0.0;
        Arrays.sort(rangeArr);
        range = rangeArr[rangeArr.length-1] - rangeArr[0];
        return range;
    }
    // create a function to calculate the maximum value
    private static double findMax(double[] maxArr) {
        Arrays.sort(maxArr);
        double max = maxArr[maxArr.length - 1];
        return max;
    }
    // create a function to calculate the minimum value
    private static double findMin(double[] minArr) {
        Arrays.sort(minArr);
        double min = minArr[0];
        return min;
    }
    // main method
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Welcome to the summation calculator.");

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the total number of values to calculate: ");
        int number = num.nextInt();
        double[] values = new double[number];
        System.out.println("Enter the numbers you wish to calculate: ");
        while (i < number) {
            values[i] = num.nextDouble();
            i++;
        }
        System.out.print("Your values are: ");
        for(int j = 0; j < number; j++) {
            System.out.print(values[j] + ", ");
        }

        System.out.println("\n\n\tWhat function do you want to perform on the numbers? ");
        System.out.println("\t1. Addition of numbers\n\t2. Find the mean\n\t" +
                "3. Find the mode\n\t4. " + "Find the median\n\t" +
                "5. Find the standard deviation" + "\n\t6. Find the variance" + "\n\t7. Find the coefficient of variation" +
                "\n\t8. Find the range\n\t9. Find the maximum value");
        System.out.println("\n\tEnter your choice: ");
        int option = num.nextInt();

        if (option == 1) System.out.println("\tThe sum of the array is " + addition(values));
        else if (option == 2) System.out.println("\tThe mean of the array is " + findMean(values));
        else if (option == 3) System.out.println("\tThe mode of the array is " + findMode(values));
        else if (option == 4) System.out.println("\tThe median of the array is " + findMedian(values));
        else if (option == 5) System.out.println("\tThe standard deviation of the array is " + findStdDev(values));
        else if (option == 6) System.out.println("\tThe variance of the array is " + findVariance(values));
        else if (option == 7) System.out.println("\tThe coefficient of variation is " + findCov(values));
        else if (option == 8) System.out.println("\tThe range of the array is " + findRange(values));
        else if (option == 9) System.out.println("\tThe maximum value of the array is " + findMax(values));
        else if (option == 10) System.out.println("\tThe minimum value of the array is " + findMin(values));
    }
}
