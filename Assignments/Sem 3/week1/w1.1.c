#include <stdio.h>
 
void initialize(int*,int);
void search(int*,int,int);
 
void main()
{
	int* arr;
	int size,k;
	
	printf("Enter size of array: ");
	scanf("%d",&size);
	
	arr=(int*)malloc(sizeof(int)*size);
	
	initialize(arr,size);
	
	printf("Enter element to search");
	scanf("%d",&k);
	
	search(arr,size,k);
}

void initialize(int *a,int size)
{
	for (int i=0;i<size;i++)
	{
		printf("enter element");
		scanf("%d",&a[i]);
	}
}

void search(int *a,int size,int k)
{
	int found=0;
	for (int i=0;i<size;i++)
		if (k==a[i])
			found=1;
	if (found==1) printf("found");
	else printf ("not found");
}
