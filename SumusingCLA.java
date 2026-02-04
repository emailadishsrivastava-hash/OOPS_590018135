public class SumusingCLA {
    public static void main(String[] args) {
        int sum = 0,number;
        for(int i = 0; i <args.length;i++){
            sum+= Integer.parseInt(args[i]);
        }
        System.out.println("Sum of the Array using Command Line arguements is "+sum);
    }
}
