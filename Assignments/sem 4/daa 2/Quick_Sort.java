public class Quick_Sort {
    static int partition(int a[], int l,int h)
    {
        int pivot = a[h];
        int i = (l - 1);
        for (int j =l; j <h; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[h];
        a[h] = temp;
        return i + 1;
    }
    static void quickSort(int a[], int l,int h)
    {
        if (l<h) {
            int pi = partition(a,l,h);
            quickSort(a,l,pi-1);
            quickSort(a,pi+1,h);
        }
    } 
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
