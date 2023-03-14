package unit03.QuizB;

public class Quiz1 {
    public static void main(String[] args) {
        boolean isOld = false;
        int x = 5;
        int y = 14;
        int z = 18;
        if (y > x && z > y && (x + 12) >= z)
        {
            System.out.print("P");
        }
        if (x >= 6 || z <= y || z <= 18)
        {
            System.out.print("Q");
        }
        if (!isOld || y > z)
        {
            System.out.print("R");
        }
    }
}
