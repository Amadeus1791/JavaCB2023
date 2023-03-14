package unit03.QuizB;

public class Quiz3 {
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            i += 3;
            if (i != 4)
            {
                System.out.print("x");
            }
            else
            {
                System.out.print("y");
            }
        }
        while (i != 10);
    }
}
