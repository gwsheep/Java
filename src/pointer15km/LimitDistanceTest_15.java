package pointer15km;

import java.util.ArrayList;
import java.util.List;

public class LimitDistanceTest_15 {

    public static void main(String[] args) {
        int sum = 0;                //총합
        int tmp = 0;
        int defaultLink = 2;        //기본
        int limit = 20;
        //최대값을 넘지 않는 수 (최대 : 20)
        int[] fArray = {2,3,4,8,10};   //direction = 1 (front)
        int[] tArray = {8,1,2,6,10};   //direction = 2 (terminal)
        int fp = 0, tp = 0;         //포인터 : fp, tp

        List<Integer> fArrayList = new ArrayList<>();
        for(int i = 0, fSum = defaultLink; i < fArray.length; i++) {
            fSum += fArray[i];
            if(fSum <= limit) {
                fArrayList.add(fSum);
            }
        }
        List<Integer> tArrayList = new ArrayList<>();
        for(int i = 0, tSum = defaultLink; i < tArray.length; i++) {
            tSum += tArray[i];
            if(tSum <= limit) {
                tArrayList.add(tSum);
            }
        }
        System.out.println("front = " + fArrayList);
        System.out.println("terminal = " + tArrayList);

        for(int i = 0; i < fArrayList.size(); i++) {
            for (int j = 0; j < tArrayList.size(); j++) {
                tmp = fArrayList.get(i) + tArrayList.get(j) - defaultLink;
                if (tmp <= limit){
                    if (tmp > sum){
                        sum = tmp;
                        fp = i;
                        tp = j;
                    }
                }
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("fp = " + fp);
        System.out.println("tp = " + tp);

    }
}

