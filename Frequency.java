import java.util.*;
class Frequency{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int size, i, frequency=0;
        System.out.println("Enter the size of the array");
        size = scr.nextInt();
        char [] arr = new char [size];
        System.out.println("Enter the characters of the array");
        for(i=0;i<size;i++){
            arr[i]=scr.next().charAt(0);
        }
        System.out.println("Enter the characters whose Frequency is to be checked");
        char ch = scr.next().charAt(0);
        for(i=0;i<size;i++){
            if(ch == arr[i]);
            frequency++;
        }
        System.out.println("The frequency of "+ch+" is "+frequency);
    }
}