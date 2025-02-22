import java.util.Scanner;

public class WordCounter {

     public static int countWords(String sentence) {
               String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

     public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

      public static void displayResult(int wordCount) {
        System.out.println("The sentence has " + wordCount + " words.");
    }

        public static void main(String[] args) {
        String sentence = getInput();     
   int wordCount = countWords(sentence);sentence
        displayResult(wordCount); 
    }
}
