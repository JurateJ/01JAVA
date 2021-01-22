package objJJ.cw01;

public class Cw01 {

//    Sum of positive  cia VEIKIA, CW neveikia,

    public static void main(String[] args) {
        int[] arr = {1,-4,7,12};
        int total = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] > 0) {
                total += arr[i];
            }
        }
        System.out.println(total);
    }
}
