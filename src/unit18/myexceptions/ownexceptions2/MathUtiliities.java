package unit18.myexceptions.ownexceptions2;

public class MathUtiliities {
    private MagicNumbers magicNumbers;


    public MathUtiliities() {
        magicNumbers = new MagicNumbers();

            magicNumbers.addMagicNumber(-1);
            magicNumbers.addMagicNumber(6);
            magicNumbers.addMagicNumber(100);

    }

    public int sumOfAllMagicNumber() {
        int sum = 0;
        for (int i = 0; i < magicNumbers.getNumbers().size(); i++) {
            sum += magicNumbers.getNumbers().get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        MathUtiliities mathUtiliities = new MathUtiliities();
        System.out.println(mathUtiliities.sumOfAllMagicNumber());
    }
}
