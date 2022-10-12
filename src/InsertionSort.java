public class InsertionSort {
    void sort(int arry[]){
        int n = arry.length;
        for (int i = 0; i <n ; i++) {
            int key = arry[i];
            int j = i-1;
            while (j>=0&& arry[j]>key){
                arry[j+1]=arry[j];
                j = j-1;
            }
            arry[j+1]=key;
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[]={11,12,13,5,7,8};
        System.out.println("Mảng ban đầu là : ");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp là :");
        printArray(arr);
    }
}
