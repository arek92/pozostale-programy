public class Demo {
    public static void main(String[] args) {

        String[] a = {"Arek", "Kasia", "Karol"};
        String[] b = {"Karol", "Kasia", "Michal"};

        String[] common = findCommon(a, b);
        for (String s : common) {
            System.out.println(s);

        }


    }

    //Write a program to find the common elements between array  a and b
    //example: {"a", "b", "c"}, {"c", "b", "d"} -> {"b", "c"}  //a b c c b d


    public static String[] findCommon(String[] a, String[] b) {
        String[] result = new String[3];
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equals(b[j])) {
                    counter++;
                    String common =a[i];
                    result[i-1] = common;

                }
            }
        }
        String []updatedResult = new String[counter];
        for (int i = 0; i < counter; i++) {
            updatedResult[i]= result[i];

        }

        return updatedResult;

    }

}

