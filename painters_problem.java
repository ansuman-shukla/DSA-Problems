
public class painters_problem{
    public static int max(int[] A){
        int max = A[0];
        for(int i =0 ; i < A.length ;i++){
            if (A[i] > max){
                max =A[i];
            }
        }
        return max;
    }

    public static int sum(int[] A){
        int sum =0;
        for(int i =0; i < A.length ;i++){
            sum += A[i];
        }
        return sum;
    }

    public static boolean check(int[] A , int t, int k){
        int worker = 1;
        int time =0;
        for(int i =0 ;i < A.length; i++){
            time = time + A[i];
            if (time > t){
                worker++;
                time =A[i];
            }
        }

        if (worker <= k){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = {884,228,442,889};
        int start  = max(A);
        int end = sum(A);
        int k = 4;
        int ans =0;

        while(start <= end){
            int mid = (end+start)/2;
            if (check(A, mid, k)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        System.out.println(ans);
    }
}