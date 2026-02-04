import java.util.*;
public class StringEquals {
    boolean Check(String str1,String str2) {
        return str1.equals(str2);
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        StringEquals ob = new StringEquals();
        String str1,str2;
        System.out.println("Enter the first String");
        str1 = scr.nextLine();
        System.out.println("Enter the Second String");
        str2 = scr.nextLine();
        
        if(ob.Check(str1,str2))
            System.out.println("The two Strings are Equal");
        else
            System.out.println("The two Strings are not Equal");
    }
}
