package unit04;

public class ArrayNames {

    public static void main(String[] args) {
        String[] names = new String[11];
        names[0] = "Wolfgang";
        names[1] = "Felix";
        names[2] = "Patrik";
        names[3] = "Konstantin";
        names[4] = "Thomas";
        names[5] = "Jan";
        names[6] = "Ramazan";
        names[7] = "Dzhambul";
        names[8] = "Magomed";
        names[9] = "Natalia";
        names[10] = "Stefan";

        // Wolfgang Felix Konstantin
        String allNames = "";
        for (int i = 0; i < names.length; i++) {
            allNames += names[i];
            allNames += " ";
            if (names[i].length() <= 5) {
                System.out.println(names[i]);
            }
/*            String value = names[i];
            if (value.length() <= 5) {
                System.out.println(names[i]);
            }*/
        }
        System.out.println(allNames);

    }
}
