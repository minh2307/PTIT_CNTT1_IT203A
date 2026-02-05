package src.ss03;

public class B4 {
    public static int[] sortBooks(int[] arr) {
        int temp;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int x : arr) {
            System.out.printf("%d, ", x);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int[] arr = {105, 102, 109, 101, 103};

        System.out.print("Trước khi sắp xếp: ");
        displayBooks(arr);

        System.out.print("Sau khi sắp xếp: ");
        displayBooks(sortBooks(arr));
    }
}
