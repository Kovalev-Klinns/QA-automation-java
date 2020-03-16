package qaautomation.collections.optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

public class FourthTask {
    private static final String poem =
            "When forty winters shall beseige thy brow,\n"+
                    "And dig deep trenches in thy beauty's field,\n"+
                    "Thy youth's proud livery, so gazed on now,\n"+
                    "Will be a tatter'd weed, of small worth held:\n"+
                    "Then being ask'd where all thy beauty lies,\n"+
                    "Where all the treasure of thy lusty days,\n"+
                    "To say, within thine own deep-sunken eyes,\n"+
                    "Were an all-eating shame and thriftless praise.\n";

    private static final Comparator<String> LineLengthComparator = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(poem.split("\n"));

        // Сортировка по возрастанию длин
        Collections.sort(lines, LineLengthComparator);
        System.out.println(lines);
    }
}