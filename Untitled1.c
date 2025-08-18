#include <stdio.h>
int main()
{
    int arr[20] = { 1, 2, 3, 4, 7, 98, 0, 12, 35, 99, 14 };
    printf("Number of elements:%lu ",
           sizeof(arr) / sizeof(arr[0]));
    return 0;
}
