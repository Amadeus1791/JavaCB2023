package unit01;

public class DataTypes {
    public static void main(String[] args) {
        boolean isARainyDay;
        isARainyDay = false;
        boolean isSunny = false;
        System.out.println(isARainyDay);
        System.out.println(isARainyDay == isSunny);
        System.out.println(3 == 3);
        System.out.println(3 < 3);
        System.out.println(3 <= 3);
        System.out.println(3 != 3);

        int x = 4;
        x = x + 1;
        System.out.println(x == x);
        x = x / 12;
        System.out.println(x);
        int num1 = 5;
        int num2 = 2;
        int result = 5 / 2;
        System.out.println(result);
        double double1 = 5;
        double double2 = 2;
        double resultDouble = double1 / double2;
        System.out.println(resultDouble);

        int num = 3;
        double num4 = 3.0;
        char c = '3';
        char d = '4';
        String e = "3";
        String f = "4";
        System.out.println(e + f);
        System.out.println(c + d);
        String c2 = "3agfsfgd3";
        System.out.println(c);

    }
}
