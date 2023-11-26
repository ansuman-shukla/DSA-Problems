public class peakelement {
    public static void main(String[] args) {
        int[] A = {6,5, 17, 100, 11};
        int start = 0;
        int end = A.length -1 ;

        if (A[start] > A[start+1]){
            System.out.println(A[start]);
        }
        if (A[end] >A[end-1]){
            System.out.println(end);
        }
        while (start <= end) {
            int mid = (start + end)/2;

            if (A[mid] > A[mid -1] && A[mid] > A[mid +1]){
                System.out.println(A[mid]);
            }
             if (A[mid] < A[mid+1]){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        System.out.println();
    }
}
