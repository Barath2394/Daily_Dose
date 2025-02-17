public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,15,5};
        System.out.println(countSubSets(arr,25,0));
    }
    static int countSubSets(int[] arr,int target,int i) {
        if (target == 0) {
            return 1;
        }
        if (target < 0 || i == arr.length) {
            return 0;
        }
        return countSubSets(arr,target - arr[i],i + 1) + countSubSets(arr,target,i + 1);
    }
}
