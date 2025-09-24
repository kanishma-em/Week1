import java.util.*;
public class prb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the initial milage");
        float initial =sc.nextFloat();
        System.out.print("enter the final milage");
        float end=sc.nextFloat();
        float a=(end - initial);
        int milage=(int)(a*25);
        System.out.print("finial milage:"+ milage);
        
    }
    
}
