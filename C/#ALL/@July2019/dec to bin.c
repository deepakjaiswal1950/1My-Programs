#include<stdio.h>
void main()
{
    long num,rem, base = 1, binary = 0;

    scanf("%d", &num);


    while(num>0)
    {
        rem = num%2;
        binary = binary + rem*base;
        num /= 2;
        base *=10;

    }

    printf("%ld", binary);
}

































































































































































































































































































































































































































































