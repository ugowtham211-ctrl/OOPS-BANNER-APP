import java.util.HashMap;

  public class OOPSBannerr {


    public static HashMap<Character, String[]> createPatternMap() {

        HashMap<Character, String[]> map = new HashMap<>();

    String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

          String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        return map;
    }

    // Retrieve pattern for character
    public static String[] getCharacterPattern(char ch, HashMap<Character, String[]> map) {
        return map.get(ch);
    }

    // Print banner message
    public static void printMessage(String message, HashMap<Character, String[]> map) {

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, map);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
            }
 }
public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = createPatternMap();

        String message = "OOPS";

        printMessage(message, patternMap);
    }
} 