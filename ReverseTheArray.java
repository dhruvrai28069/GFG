import java.util.*;

public class ReverseTheArray {

    public static void reverseStack(Stack<Integer> st) {

        List<Integer> list = new ArrayList<>();
        while (!st.isEmpty()) {
            list.add(st.pop());
        }

        for (int i = 0; i < list.size(); i++){
            st.push(list.get(i));
        }
    }
}