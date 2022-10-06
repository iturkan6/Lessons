package month3.lesson1.warm_up;

public class Solution1 {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                builder.append("[");
                builder.append(".");
                builder.append("]");
            }else {
                builder.append(address.charAt(i));
            }
        }
        return builder.toString();
    }
}
