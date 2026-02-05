package src.ss03;

public class B6 {
    public static int[] sort(int[] a) {
        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public static int[] merge(int[] m, int n) {
        for(int i = n; i < m.length-1; i++){
            m[i] = m[i+1];
        }

        m[m.length - 1] = 0;

        return m;
    }

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] m = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            m[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            m[a.length + i] = b[i];
        }


        m = sort(m);

        for(int i = 0; i<m.length-1; i++){
            if (m[i] == 0) break;

            if (m[i] == m[i+1]) {
                m = merge(m, i);
                i--;
            }
        }

        return m;
    }

    public static void display(int[] arr){
        System.out.print("[ ");
        for (int x:arr) {
            if (x == 0) continue;
            System.out.printf("%d ",x);
        }
        System.out.printf("]\n");
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1,3,5,7,9};
        int[] arraySecond = {2,3,5,6,8,9,10};

        System.out.print("kho cũ: ");
        display(arrayFirst);
        System.out.print("Lô mới: ");
        display(arraySecond);
        System.out.print("kho tổng (đã gộp & lọc trùng): ");
        display(mergeBooks(arrayFirst, arraySecond));
    }
}
