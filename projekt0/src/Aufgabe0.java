import java.util.Random;

public class Aufgabe0 {
    public static void main(String[] args) {
        String[] personsOriginal = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] personsCloned = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] shuffledList = new String[personsCloned.length];
        int exercisesNumber = 5;
        Random rand = new Random();
        
        //Personen mischen
        for (int i = 0; i < personsCloned.length; i++) {
            int randIndex;
            do {
                randIndex = rand.nextInt(personsCloned.length);
            } while (personsCloned[randIndex] == "null");

            shuffledList[i] = personsCloned[randIndex];
            personsCloned[randIndex] = "null";

        }

        // Aufgaben nacheinander verteilen
        for (int i = 0; i < personsCloned.length; i++) {
            int taskNumber = (i % exercisesNumber) + 1;  // Aufgaben von 1 bis 5 wiederholen
            System.out.println(shuffledList[i] + " bekommt Aufgabe " + taskNumber);
        }
    }

}