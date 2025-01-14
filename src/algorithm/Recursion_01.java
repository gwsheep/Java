package algorithm;

import java.util.Scanner;

public class Recursion_01 {


    public int solution(int[] data, int begin, int end, int target){

        if (begin > end) {
            return -1;
        } else if (target == data[begin]) {
            return begin;
        } else {
            return solution(data, begin + 1, end, target);
        }

    }

    public static void main(String[] args) {

        Recursion_01 r = new Recursion_01();
//        Scanner sc = new Scanner(System.in);

        int[] sample = {5,4,3,2,1};
        int begin = 1;
        int end = 5;
        int target = 3;

        int answer = r.solution(sample, begin, end, target);
        System.out.println("answer = " + answer);
    }

}
