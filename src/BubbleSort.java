import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) throws Exception {
        if (input == null) {
            throw new Exception("Input list cannot be null");
        }
        input.removeAll(Collections.singleton(null));
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size() - i - 1; j++) {
                if (input.get(j).compareTo(input.get(j + 1)) > 0) {
                    Comparable temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
        return input;
    }
}