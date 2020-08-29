package com.interview.JZ;

public class JZ10 {

    public int RectCover(int target) {
        /*思路：覆盖2*n的大矩形，可以先摆放一个2*1（竖着）的矩形，后面还有（target - 1）个位置可以未知的
               摆放小矩形；或者先摆放一个1*2（横着放）的小矩形，下面这个小矩形的空位已经定死了，所以只能横
               着放一个小矩形，这个时候后面就只能由（target - 2）个位置可以未知的摆放小矩形。
        */
        if (target <= 2)
            return target;
        else
            return RectCover(target - 1) + RectCover(target - 2);
    }

}
