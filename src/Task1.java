public class Task1 {
    public static void main(String[] args) {
        String c1 = "a";
        String c2 = "b";
        int n = 5;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i%2 == 0) {
                sb.append(c1);
            }else {
                sb.append(c2);
            }
        }
        System.out.println(sb.toString());
        System.out.println();
    }
}