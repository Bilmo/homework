package lesson12;

/**
 * Created by student on 1/28/2018.
 */
public class StringBuild {
    public static void main(String[] args) {
        int a = 3, b = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("+").append(b).append("=").append(a + b);
        sb.append("\n").append(a).append("-").append(b).append("=").append(a - b);
        sb.append("\n").append(a).append("*").append(b).append("=").append(a * b);
        System.out.println(sb);
        replaceString(sb);
        System.out.println(sb);
    }

    private static void replaceString(StringBuilder sb) {
        int pos1 = 0;
        while ((pos1 = sb.indexOf("=")) != -1) {
            sb.replace(pos1, pos1 + 1, " равно ");
        }
    }
}