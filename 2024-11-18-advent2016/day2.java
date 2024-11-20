import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        System.out.println(getCode("bathroom.txt"));
    }

    public static String getCode(String filename) {
        String code = "";
        int[][] keycode = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int hori = 1;
        int vert = 1;

        /*
        Keypad layout:
        123
        456
        789
        */

        // Read input file
        try {
            Scanner input = new Scanner(new File(filename));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char move = line.charAt(i);
                    if (move == 'D' && vert < 2) {
                        vert += 1;
                    } else if (move == 'U' && vert > 0) {
                        vert -= 1;
                    } else if (move == 'L' && hori > 0) {
                        hori -= 1;
                    } else if (move == 'R' && hori < 2) {
                        hori += 1;
                    }
                }
                code += keycode[vert][hori];
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return code;
    }
}
