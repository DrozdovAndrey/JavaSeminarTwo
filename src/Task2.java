public class Task2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        StringBuilder sb1 = new StringBuilder();
        int count = 1;
        str = str.concat(" ");
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                count ++;

            }else {
                if (count == 1) {
                    sb1.append(str.charAt(i));
                    count = 1;
                }else {
                    sb1.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        System.out.println(sb1.toString());
        System.out.println();
    }
}
