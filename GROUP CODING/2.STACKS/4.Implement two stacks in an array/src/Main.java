import java.util.Scanner;


class STACK {

    Scanner in = new Scanner(System.in);
    int n=10;
    int []st = new int[50];
    int item, top1 = -1;

    // for second stack
    int top2 = 11, n2 = 21;// 11 show the index like top -1

    void push2(){
        if(top2 == n2-1){
            System.out.println("Stack2 is overflow");
            return;
        }
        int item;
        System.out.println("Enter the item to push into stack2");
        item = in.nextInt();
        st[++top2] = item;
    }

    void pop2(){
        if(top2 == 11){
            System.out.println("Stack2 is underflow");
            return;
        }
        top2--;
    }

    void display2()
    {
        if (top2 == 11)
        {
            System.out.println("UnderFlow");
            return;
        }

        System.out.println("Elements in the stack2 :");
        for(int i=12;i<=top2;i++)
            System.out.print(+st[i]+"  ");
        System.out.println();
    }






    boolean isFull(){
        if(top1 == n-1)
            return true;
        else
            return false;
    }
    boolean isEmpty(){
        if(top1 == -1)
            return true;
        else
            return false;
    }

    public void push1() {
        if(isFull()){
            System.out.println("Stack1 is full");
            return;
        }
        else {
            System.out.println("Enter item to push onto stack1");
            item = in.nextInt();
            st[++top1] = item;
        }
    }


    public void pop1(){
        if(isEmpty()){
            System.out.println("Stack1 is Empty");
            return;
        }
        else {
            System.out.println(st[top1]+" is deleted");
            top1--;
        }
    }

    public void display1()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            return;
        }

        System.out.println("Elements in the stack1 :");
        for(int i=0;i<=top1;i++)
            System.out.print(+st[i]+"  ");
        System.out.println();
    }
}



public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        STACK obj = new STACK();
        int ch;


        for(;;)
        {

            System.out.println("1.Push1\n2.Pop1\n3.Display1\n4.Push2\n5.Pop2\n6.Display2\n7.Exit\nEnter your choice");
            ch = in.nextInt();


            switch(ch)
            {
                case 1:
                    obj.push1();
                    break;

                case 2:
                    obj.pop1();
                    break;

                case 3:
                    obj.display1();
                    break;

                case 4:
                    obj.push2();
                    break;

                case 5:
                    obj.pop2();
                    break;

                case 6:
                    obj.display2();
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter the correct input");
            }
        }



    }

}
