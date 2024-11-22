import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class day4 {
    public static void main(String[] args) {
        System.out.println(realRoom("room.txt"));
    }

    public static int realRoom(String filename) {
        int total = 0;

        ArrayList<String> rooms = new ArrayList<String>();

        try {
            Scanner input = new Scanner(new File(filename));
            while (input.hasNextLine()) {
                rooms.add(input.nextLine());
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        for (int i = 0; i < rooms.size(); i++) {
            String match = "";
            ArrayList<Character> repeats = new ArrayList<Character>();
            ArrayList<Integer> nums = new ArrayList<Integer>();

            String[] letters = rooms.get(i).split("-");
            String roomName = "";
            for (int j = 0; j < letters.length - 1; j++) {
                roomName += letters[j];
            }
            String lastPart = letters[letters.length - 1];

            int idIndex = lastPart.indexOf('[');
            int sectorID = Integer.parseInt(lastPart.substring(0, idIndex));
            String checksum = lastPart.substring(idIndex + 1, lastPart.length() - 1);

            for (int j = 0; j < roomName.length(); j++) {
                char ch = roomName.charAt(j);
                if (repeats.indexOf(ch) < 0) {
                    repeats.add(ch);
                    nums.add(1);
                } else {
                    int index = repeats.indexOf(ch);
                    nums.set(index, nums.get(index) + 1);
                }
            }

            for (int x = 0; x < repeats.size(); x++) {
                for (int y = x + 1; y < repeats.size(); y++) {
                    if (nums.get(x) < nums.get(y) || (nums.get(x).equals(nums.get(y)) && repeats.get(x) > repeats.get(y))) {
                        int num = nums.get(x);
                        nums.set(x, nums.get(y));
                        nums.set(y, num);

                        char ch = repeats.get(x);
                        repeats.set(x, repeats.get(y));
                        repeats.set(y, ch);
                    }
                }
            }

            for (int j = 0; j < Math.min(5, repeats.size()); j++) {
                match += repeats.get(j);
            }

            if (checksum.equals(match)) {
                total += sectorID;
            }
        }

        return total;
    }
}
