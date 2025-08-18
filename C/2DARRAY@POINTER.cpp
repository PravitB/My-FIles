#include<stdio.h>
#include<stdlib.h>
int main()
{
    int **arr;
    int x,y;
    printf("Enter no of rows in 2D array\n");
    scanf("%d",&x);
    printf("Enter no of Colum in 2D array\n");
    scanf("%d",&y);
    arr=(int **)malloc(x*sizeof(int));
    for (int i=0;i<x;i++)
    {
        arr[i]=(int*)malloc(y*sizeof(int));

    }
    printf("Enter element of 2D array ");
    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Array elements are:\n");
    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            printf("%d ",arr[i][j]);
        }
        printf("\n");
    }

}
