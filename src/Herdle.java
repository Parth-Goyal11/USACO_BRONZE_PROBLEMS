import java.util.*;
public class Herdle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> answers = new ArrayList<>();
        ArrayList<String> guesses = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        HashMap<String, Integer> countAnswers = new HashMap<>();
        HashMap<String, Integer> countGuesses = new HashMap<>();

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"
        , "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String firstWord = sc.nextLine();
        String secondWord = sc.nextLine();
        String thirdWord = sc.nextLine();

        String firstGuess = sc.nextLine();
        String secondGuess = sc.nextLine();
        String thirdGuess = sc.nextLine();

        answers.add(String.valueOf(firstWord.charAt(0)));
        answers.add(String.valueOf(firstWord.charAt(1)));
        answers.add(String.valueOf(firstWord.charAt(2)));
        answers.add(String.valueOf(secondWord.charAt(0)));
        answers.add(String.valueOf(secondWord.charAt(1)));
        answers.add(String.valueOf(secondWord.charAt(2)));
        answers.add(String.valueOf(thirdWord.charAt(0)));
        answers.add(String.valueOf(thirdWord.charAt(1)));
        answers.add(String.valueOf((thirdWord.charAt((2)))));

        guesses.add(String.valueOf(firstGuess.charAt(0)));
        guesses.add(String.valueOf(firstGuess.charAt(1)));
        guesses.add(String.valueOf(firstGuess.charAt(2)));
        guesses.add(String.valueOf(secondGuess.charAt(0)));
        guesses.add(String.valueOf(secondGuess.charAt(1)));
        guesses.add(String.valueOf(secondGuess.charAt(2)));
        guesses.add(String.valueOf(thirdGuess.charAt(0)));
        guesses.add(String.valueOf(thirdGuess.charAt(1)));
        guesses.add(String.valueOf((thirdGuess.charAt((2)))));





        int yellows = 0;
        int greens = 0;
        for(int i = 0; i<9; i++) {
            if (answers.get(i).equals(guesses.get(i))) {
                greens++;

            }
        }


        for(String c : answers){
            if(countAnswers.containsKey(c)){
                countAnswers.replace(c, countAnswers.get(c) + 1);
            }else{
                countAnswers.put(c, 1);
            }
        }

        for(String x: guesses){
            if(countGuesses.containsKey(x)){
                countGuesses.replace(x, countGuesses.get(x) + 1);
            }else{
                countGuesses.put(x, 1);
            }

        }

        for(int a = 0; a<letters.length; a++){
            if (countAnswers.containsKey(letters[a]) && countGuesses.containsKey(letters[a])) {
                yellows += Math.min(countAnswers.get(letters[a]), countGuesses.get(letters[a]));
            }
        }








        System.out.println(greens);
        System.out.println(yellows - greens);





    }
}
