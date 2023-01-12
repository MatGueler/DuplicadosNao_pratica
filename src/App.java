public class App {
    public static void main(String[] args) throws Exception {

        String[] primeiroArray = new String[] { "uva", "maçã", "banana", "mamão" };
        String[] segundoArray = new String[] { "limão", "laranja", "banana", "mamão" };

        for (String primeiro : primeiroArray) {
            for (String segundo : segundoArray) {
                if (primeiro.equals(segundo)) {
                    System.out.println(primeiro);
                }
            }
        }
    }
}
