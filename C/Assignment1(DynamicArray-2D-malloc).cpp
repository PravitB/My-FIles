#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

void initialize(int**,int,int);
void display(int**,int,int);

int main()
{
    
    int i,arr[5],n;
     //Line no 13 or 14 any one we can use for 2D    
/*Line 13*/    //int *darr[5],row,col;
/*Line 14*/     int **darr,row,col;
    printf("\n Enter row & Column size :");
    scanf("%d %d",&row,&col);
    
    darr=(int**)malloc(sizeof(int*)*row);

     for(i=0;i<row;i++)
      darr[i]=(int*)malloc(sizeof(int)*col);
          
    initialize(darr,row,col);
    display(darr,row,col);       
}

void initialize(int **a,int row,int col)
  { 
    int i,j;
  
    for (i=0;i<row;i++)
        for(j=0;j<col;j++)
      { printf("\n Enter a[%d][%d] data: ",i,j);
        scanf("%d",&a[i][j]);
      }
   }
 void display(int **a,int row,int col)
  { int i,j;
    printf("\n Displaying the 2D Array content:\n");   
    for (i=0;i<row;i++)
    {
		    for(j=0;j<col;j++)
         {
		   printf("%d ",a[i][j]);
	     } printf("\n");
    }
  }
