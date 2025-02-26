#include<stdio.h>  // I/O
#include<stdlib.h> // exit(0);
#include<conio.h> // getch();
#include<string.h>



int insert_at_pos(int a[] ,int n,int item, int pos)
{
    int i;

    if(pos>n || pos<0) // Checking valid position or not
    {
        printf("Invalid Position\n");
        return n; // return same length due to no change occurs.
    }

    for(i=n-1;i>=pos;i--) // Shifting elements from left to right
    {
        a[i+1]=a[i];
    }

    a[pos] = item; // Assigned item.

    return (n+1); // Length incremented by 1 due to insertion.

}

int delete_at_pos(int a[] ,int n,int item, int pos)
{
    int i;

    if(pos>n || pos<0) // Checking valid position or not
    {
        printf("Invalid Position\n");
        return n;  // return same length due to no change occurs.
    }

    printf("The Item at %d is deleted : %d element\n",pos,a[pos]); // Deleted element by assigning another element.

    for(i=pos;i<=n-2;i++) // Shifting elements from right to left.
    {
        a[i]=a[i+1];
    }

    return (n-1); // Length decremented by 1 due to deletion.

}

void read_array(int a[] , int n) // scanning and storing elements into an array.
{
    int i;

    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
}

void print_array(int a[] , int n) // displaying an elements from an array.
{
    int i;

    for(i=0;i<n;i++)
    {
        printf("%d\t",a[i]);
    }
    printf("\n");
}

void main()
{
    int choice,a[100],item,pos;
    int n=0; // Taken to check whether an array is empty or not.


    printf("*************** WELCOME ***************\n");

    for(;;)
    {

        printf("1.Read array\n");
        printf("2.Print array\n");
        printf("3.Insert array at pos\n");
        printf("4.Delete array at pos\n");
        printf("5.Exit\n");

        printf("ENTER YOUR CHOICE\n");
        scanf("%d",&choice);

        switch(choice)
        {

            case 1: printf("Enter the number of elements\n");
                    scanf("%d",&n);

                    printf("Enter %d elements\n",n);

                    read_array(a,n);
                    break;

            case 2: if (n == 0) // Check array is empty or not.
                        printf("Array is empty\n");
                    else
                    {
                        printf("The elements of arrays are :\n");
                        print_array(a,n);
                    }
                    break;

            case 3: printf("Enter the item to be inserted\n");
                    scanf("%d",&item);

                    printf("Enter the position of array where the item insert\n");
                    scanf("%d",&pos);
                    n=insert_at_pos(a,n,item,pos);
                    break;

            case 4: printf("Enter the position to delete an element\n");
                    scanf("%d",&pos);

                    if (n == 0) // Check array is empty or not.
                        printf("Array is empty,First insert or read array\n");
                    else
                    n=delete_at_pos(a,n,item,pos);

                    break;

            default : exit(0);


        }

    }
}

