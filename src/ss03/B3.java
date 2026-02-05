package src.ss03;

public class B3 {
    public static int[] maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        int[] arr = new int[5];
        for (int i = 0; i < names.length; i++){
            if(quantities[i] > max){
                max = quantities[i];
                arr = new int[quantities.length];
                arr[i] = 1;
            }else if (quantities[i] == max){
                arr[i] = 1;
            }
        }

        System.out.printf("Sách có số lượng nhiều nhất (%d)\n", max);
        return arr;
    }

    public static int[] minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];
        int[] arr = new int[5];
        for (int i = 0; i < names.length; i++){
            if(quantities[i] < min){
                min = quantities[i];
                arr = new int[quantities.length];
                arr[i] = 1;
            }else if (quantities[i] == min){
                arr[i] = 1;
            }
        }
        System.out.printf("Sách có số lượng ít nhất (%d)\n", min);
        return arr;
    }

    public static void display(int[] arr, String[] names) {
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 1) System.out.printf("- %s\n", names[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Python pro", "web Design", "Data Structuce", "Java"};
        int[] quantities = {50,50,5,34};

        ;
        display(maxQuantityOfBooks(names,quantities), names);
        display(minQuantityOfBooks(names,quantities), names);

    }
}
