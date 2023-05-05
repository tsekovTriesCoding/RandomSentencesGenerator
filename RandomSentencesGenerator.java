import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Wade", "Dave", "Seth", "Ivan", "Riley", "Gilbert",
                "Jorge", "Dan", "Brian", "Roberto", "Ramon", "Miles",
                "Liam", "Nathaniel", "Ethan", "Lewis", "Milton", "Claude"
                , "Joshua", "Glen"};

        String[] places = {"Greenbelt", "Los angeles", "New York", "Sofia", "Boston",
                "Liverpool", "Darlington", "Prague", "Stockholm", "Malmö",
                "Lamerick", "Westport", "Cairo", "Lagos", "Casablanca",
                "Mogadishu", "Niamey", "Tripoli", "Istanbul", "Minsk"};

        String[] verbs = {"eats", "sees", "throws", "burns", "sells", "cleans", "argues with", "tries",
                "breaks", "gets", "finds", "cuts", "buys", "plays with", "kisses", "carries",
                "gives", "focuses on", "crushes", "steals"};

        String[] nouns = {"a teacher", " a dog", "an umbrella", "an apple", "a plane"
                , "a plane", "a piano", "a car", "a door", "a salami",
                "a rock", "a phone", "the house", "money", "a ghost",
                "a knife"};

        String[] details = {"on the street", "in home", "near the tree", "around the corner", "beside the bed"
                , "in the car", "while dancing", "in the gym", "in school", "in the closet",
                "on a trip"};

        System.out.println("Random generated sentence:");

        String output = "";
        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomDetail = getRandomWord(details);

            output = String.format("%s from %s %s %s %s.%n", randomName, randomPlace,
                    randomVerb, randomNoun, randomDetail);

            System.out.println(output);
            System.out.print("Click [Enter] for a new sentence.");
            String command = scanner.nextLine();
            if (command.isBlank()) {
                continue;
            } else {
                System.out.print("Invalid key... Please click [Enter]");
                command = scanner.nextLine();
            }
        }
    }

    private static String getRandomWord(String[] strings) {

        Random number = new Random();

        int randomIndex = number.nextInt(strings.length);

        return strings[randomIndex];
    }
}
