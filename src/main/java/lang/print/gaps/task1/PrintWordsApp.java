package lang.print.gaps.task1;

public class PrintWordsApp {
    public static void main(String[] args) {
        String newLineCharacter = "\n";

        String[] words = {"java", "is", "smth"};

        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]);

            System.out.print(newLineCharacter);
        }
    }
}
