import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={2,3};
        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion_sort(int[] arr)
    {
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=i+1;j>0;j--)
            {
                if (arr[j] < arr[j - 1])
                    swap(j, j - 1,arr);
                else
                    break;
            }
        }
    }
    static void swap(int a,int b,int[] arr)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
