import java.util.HashMap;
import java.util.Map;

public class FormPseudographics {
    private Map<Integer, String[][]> pseudographicStorage = new HashMap<Integer, String[][]>();

    public FormPseudographics() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("  ___  ").append("*");
        stringBuilder.append(" / _ \\ ").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append(" \\___/ ").append("*");
        pseudographicStorage.put(0, formArray(stringBuilder));

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("   __  ").append("*");
        stringBuilder1.append(" /__ | ").append("*");
        stringBuilder1.append("   | | ").append("*");
        stringBuilder1.append("   | | ").append("*");
        stringBuilder1.append("   | | ").append("*");
        stringBuilder1.append("   |_| ").append("*");
        pseudographicStorage.put(1, formArray(stringBuilder1));

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(" ___   ").append("*");
        stringBuilder2.append("|__ \\  ").append("*");
        stringBuilder2.append(" ) | | ").append("*");
        stringBuilder2.append("  / /  ").append("*");
        stringBuilder2.append(" / /_  ").append("*");
        stringBuilder2.append("|____| ").append("*");
        pseudographicStorage.put(2, formArray(stringBuilder2));

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(" ____  ").append("*");
        stringBuilder3.append("|___ \\ ").append("*");
        stringBuilder3.append("  ) | |").append("*");
        stringBuilder3.append(" |__ < ").append("*");
        stringBuilder3.append(" ___) |").append("*");
        stringBuilder3.append("|____/ ").append("*");
        pseudographicStorage.put(3, formArray(stringBuilder3));

        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(" _   _ ").append("*");
        stringBuilder4.append("| | | |").append("*");
        stringBuilder4.append("| |_| |").append("*");
        stringBuilder4.append("|__  _|").append("*");
        stringBuilder4.append("   | | ").append("*");
        stringBuilder4.append("   |_| ").append("*");
        pseudographicStorage.put(4, formArray(stringBuilder4));

        StringBuilder stringBuilder5 = new StringBuilder();
        stringBuilder5.append(" _____ ").append("*");
        stringBuilder5.append("| ____|").append("*");
        stringBuilder5.append("|  |__ ").append("*");
        stringBuilder5.append("|___  \\").append("*");
        stringBuilder5.append(" ___) |").append("*");
        stringBuilder5.append("|____/ ").append("*");
        pseudographicStorage.put(5, formArray(stringBuilder5));

        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append("   __  ").append("*");
        stringBuilder6.append("  / /  ").append("*");
        stringBuilder6.append(" / /_  ").append("*");
        stringBuilder6.append("| '_ \\ ").append("*");
        stringBuilder6.append("| (_) |").append("*");
        stringBuilder6.append(" \\___/ ").append("*");
        pseudographicStorage.put(6, formArray(stringBuilder6));

        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append(" _____ ").append("*");
        stringBuilder7.append("|____ |").append("*");
        stringBuilder7.append("   / / ").append("*");
        stringBuilder7.append("  / /  ").append("*");
        stringBuilder7.append(" / /   ").append("*");
        stringBuilder7.append("/_/    ").append("*");
        pseudographicStorage.put(7, formArray(stringBuilder7));

        StringBuilder stringBuilder8 = new StringBuilder();
        stringBuilder8.append("  ___  ").append("*");
        stringBuilder8.append(" / _ \\ ").append("*");
        stringBuilder8.append("| (_) |").append("*");
        stringBuilder8.append(" > _ < ").append("*");
        stringBuilder8.append("| (_) |").append("*");
        stringBuilder8.append(" \\___/ ").append("*");
        pseudographicStorage.put(8, formArray(stringBuilder8));

        StringBuilder stringBuilder9 = new StringBuilder();
        stringBuilder9.append("  ___  ").append("*");
        stringBuilder9.append(" / _ \\ ").append("*");
        stringBuilder9.append("| (_) |").append("*");
        stringBuilder9.append(" \\__, |").append("*");
        stringBuilder9.append("   / / ").append("*");
        stringBuilder9.append("  /_/  ").append("*");
        pseudographicStorage.put(9, formArray(stringBuilder9));
    }

    private String[][] formArray(StringBuilder stringBuilder) {
        String[][] array = new String[6][7];

        int row = 0;
        int column = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            char c = stringBuilder.charAt(i);

            if ((c) == '*') {
                row++;
                column = 0;
            } else {
                array[row][column] = Character.toString(c);
                column++;
            }
        }
        return array;
    }

    public String[] formPseudographic(Integer[] sequence) {

        String[] arrayOfLines = new String[6];

        for (int l = 0; l < arrayOfLines.length; l++) {
            StringBuilder result = new StringBuilder();

            for (int k = 0; k < sequence.length; k++) {
                if (isNumber(k)) {
                    String[][] array = pseudographicStorage.get(sequence[k]);

                    for (int j = 0; j <= 6; j++) {
                        try {
                            result.append(array[l][j]);
                        } catch (Exception e) {
                        }
                    }
                    result.append(" ");
                }
            }
            arrayOfLines[l] = result.toString();
        }
        return arrayOfLines;
    }

    public void printPseudographic(Integer[] sequence) {

        String[] arrayOfLines = new String[6];
        arrayOfLines = formPseudographic(sequence);

        for (int i = 0; i < arrayOfLines.length; i++) {
            System.out.println(arrayOfLines[i]);
        }
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isNumber(Object o) {
        return o instanceof Integer;
    }

}




