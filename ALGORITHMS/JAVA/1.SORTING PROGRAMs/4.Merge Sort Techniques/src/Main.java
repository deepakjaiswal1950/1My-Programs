import java.util.Scanner;


class Main
{
    static  Scanner in = new Scanner(System.in);

    static void merge(int arr[], int low, int mid, int high)
    {

        int l = mid - low + 1;
        int r = high - mid;

        int LeftArray[] = new int [l];
        int  RightArray[] = new int [r];

        for (int i=0; i<l; ++i)
            LeftArray[i] = arr[low + i];

        for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];


        int i = 0, j = 0;
        int k = low;

        while (i<l && j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    static void SortMerge(int arr[], int low, int high)
    {
        if (low<high)
        {
            int mid = (low+high)/2;
            SortMerge(arr, low, mid);
            SortMerge(arr , mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args)
    {
        int a[], n;

        System.out.println("Enter The Size Of The Array");
        n=in.nextInt();
        a=new int[n];
        for(int i =0;i<n;i++)
            a[i]=in.nextInt();

        SortMerge(a,0,n-1);

        System.out.println("The sorted array is displayed below");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}