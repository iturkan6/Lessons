package month3.lesson1.warm_up;

import java.util.stream.IntStream;

public class Solution2 {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        IntStream.range(0, address.length()).forEach(i -> {
            if (address.charAt(i) == '.') {
                builder.append("[");
                builder.append(".");
                builder.append("]");
            } else {
                builder.append(address.charAt(i));
            }
        });
        return builder.toString();
    }
}
