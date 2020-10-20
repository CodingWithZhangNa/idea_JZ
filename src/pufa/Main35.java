package pufa;

import java.util.Scanner;

/*
浦发机试第一题
输入：14.6 -2.3 22.4 17.2 -5.7 4.5 7.8
输出：5,2
 */

public class Main35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[7];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        int up = 0;
        int down = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {
                up++;
            }
            else{
                down++;
            }
        }
        System.out.println(up + ","+ down);
    }

    /*
    int main（int argc, char** argv){
        double val;
        int up = 0;
        int down = 0;
        vector<double> vec(7);    // vector是一个能够存放任意类型的动态数组
        for(int i = 0; i < 7; i++){
            cin>>vec[i];
            if(vec[i]>0) up++;
            else if(vec[i] < 0) down++;
        }
        cout<<up<<","<<down<<endl;
        return 0;
    }
     */
}
