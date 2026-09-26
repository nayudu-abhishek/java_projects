public class LinearSearch {
    public int linear(int[] arr ,int target){
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch li = new LinearSearch();
        int arr[] = {2,3,4,5,6,1};
        System.out.println(li.linear(arr,1));
    }
}
