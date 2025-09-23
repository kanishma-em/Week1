import java.util.*;
public class prb4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int year =n/365;
        System.out.println("years:"+year);
        int mon = (n%365 )/30;
        System.out.println("month:"+mon);
        int d = (n%365)%30;
        System.out.println("Days:"+ d);
    }
    
}
