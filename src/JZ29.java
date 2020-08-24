import java.util.ArrayList;

public class JZ29 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k){
        ArrayList<Integer> res = new ArrayList<>();
        if(input == null || input.length == 0 || k <= 0 || k > input.length)
            return res;
        int L = 0, R = input.length - 1;
        while (L < R){
            int index = partition(input, L, R);
            if(index == k - 1) break;
            else if(index < k - 1) L = index + 1;
            else                   R = index - 1;
        }

        for(int i = 0; i < k; i++)
            res.add(input[i]);
        return res;
    }

    private int partition(int[] arr, int L, int R){
        int pivot = arr[L];
        int index = L;
        for(int i = L; i <= R; i++){
            if(arr[i] < pivot) swap(arr, i, ++index);
        }
        swap(arr, L, index);
        return index;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
