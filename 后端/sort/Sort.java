
public class Sort {
    public int[] insert_sort(int[] arrs) {
        for (int j = 1; j < arrs.length; j++) {
            int key = arrs[j];
            int i = j - 1;
            while (i >= 0 && arrs[i] > key) {
                arrs[i + 1] = arrs[i];
                i--;
            }
            arrs[i + 1] = key;
        }
        return arrs;
    }

    public void quick_sort(int left, int right, int[] args) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int init = args[i];
        while (i != j) {
            while (args[j] >= init && i < j) {
                j--;
            }
            while (args[i] <= init && i < j) {
                i++;
            }
            if (i < j) {
                int temp = args[j];
                args[j] = args[i];
                args[i] = temp;
            }
        }

        args[left] = args[i];
        args[i] = init;
        quick_sort(left, i - 1, args);
        quick_sort(i + 1, right, args);

    }

    public void select_sort(int[] a) {
        if (a == null || a.length <= 0) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int flag = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < temp) {
                    temp = a[j];
                    flag = j;
                }
            }
            if (flag != i) {
                a[flag] = a[i];
                a[i] = temp;
            }
        }
    }

    public void bubble_sort(int []a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j+1]<a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int res[] = new int[] { 76,18,99,35,12 };
        new Sort().bubble_sort(res);
        for (int e : res) {
            System.out.println(e);
        }
    }
}
