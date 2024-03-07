import java.util.*;
import java.lang.Math;
public class Maxno
{
    public static void main(String args[])
	{
System.out.println("we are iterating on the elements of the given array. Using the Math.max() method, we are finding the maximum value and \nupdating the max value in the 'maxValue' variable.In the starting, we initialized the maxValue variable to Integer.\nMIN_VALUE because Integer.MIN_VALUE is the smallest value that can be present in an integer array."); 
System.out.println("----------------------");
       int arr[] = {15, 13, 47, 12, 89};
       int maxValue = Integer.MIN_VALUE;
       
       // iterating over array and updating maxValue
       for(int i = 0;i < arr.length; ++i)
	   {
            maxValue = Math.max(maxValue, arr[i]);
       }
       System.out.println(maxValue); 
    }
}