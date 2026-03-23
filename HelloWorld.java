public class OOPSbanner {

    // Inner Class
    static class CharacterPatternMap {
        char character;
            String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
         this.pattern = pattern;
        }
    }

    // Create pattern maps
    public static CharacterPatternMap[] createCharacterPatternMaps() {
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

        CharacterPatternMap[] maps = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        return maps;
    }

    // Get pattern
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap m : maps)
            if (m.character == ch)
                return m.pattern;
        return new String[7];
      }

    // Print message
    public static void printMessage(String msg, CharacterPatternMap[] maps) {
        for (int i = 0; i < 7; i++) {
        for (char c : msg.toCharArray())
              System.out.print(getCharacterPattern(c, maps)[i] + " ");
            System.out.println();
        }
      }

    // Main
    public static void main(String[] args) {
           CharacterPatternMap[] maps = createCharacterPatternMaps();
          printMessage("OOPS", maps);
      }
}