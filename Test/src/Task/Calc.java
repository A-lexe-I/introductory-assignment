package Task;
import java.util.Scanner;
public class Calc {
    public static Scanner sc = new Scanner(System.in);
    public static String s = sc.nextLine();
    public static void main(String[] args) {
        try {
            String a = null;
            String b;
            String[] num;
            if (s.contains(" ")) {
                num = s.split(" [+-/*] ");
                if(num.length==2)
                    a = num[0];
                b = num[1];
            } else {
                num = s.split("[+-/*]");
                if(num.length==2)
                    a = num[0];
                b = num[1];
            }
            try {
                Parse result1 = new Parse();
                int arabculc = result1.numes(a, b);
                if(arabculc != 101) {
                    try {
                        System.out.println(arabculc);
                    }catch (Exception e){
                        System.err.println("throws Exception");
                    }
                }else try {
                    System.err.println("throws Exception");
                }catch (Exception e){
                    System.out.println(arabculc);
                }

            } catch (Exception e) {
                Parse result2 = new Parse();
                String romanculc = result2.result(a, b);
                if (romanculc == null) {
                    System.err.println("throws Exception");
                } else {
                    System.out.println(romanculc);
                }
            }
        } catch (Exception e) {
            System.err.println("throws Exception");
        }
    }
}
