package pufa;

import java.util.Scanner;

public class LianXi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            StringBuilder s = new StringBuilder();
            for (int i = 1; i < str.length() - 1; i++) {
                s.append(str.charAt(i));
            }
            str = s.toString();
            String[] array = str.split(",");
            int[] arr = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arr[i] = Integer.parseInt(array[i]);
            }
            int len = arr.length;
            System.out.print("[");
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] == arr[i + 1]) continue;
                for (int j = i + 1; j < len; j++) {
                    if (arr[j] == arr[j - 1]) continue;
                    for (int k = j + 1; k < len; k++) {
                        if (arr[k] == arr[k - 1]) continue;
                        if (arr[i] + arr[j] + arr[k] == 1) {
                            System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                        }
                    }
                }
            }
            System.out.print("]");
        }
    }

}
