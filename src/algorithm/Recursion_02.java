package algorithm;

public class Recursion_02 {


    public int solution(int[] arr, int begin, int end, int target){

        int mid = begin + (end-begin)/2;

        //중앙 노드
        if(arr[mid] == target){ return mid; }

        //왼쪽
        if(target < arr[mid]){
            return solution(arr, begin, mid-1, target);
        }

        //오른쪽
        return solution(arr, mid+1, end, target);
    }

    public static void main(String[] args) {

        Recursion_02 r = new Recursion_02();
//        Scanner sc = new Scanner(System.in);

        int[] item = {1,2,3,4,5,6,7,8,9,10};
        int begin = 1;
        int end = 5;
        int target = 8;

        int answer = r.solution(item, begin, end, target);
        System.out.println("answer = " + answer);
    }

}
