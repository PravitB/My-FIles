#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void createTree(int[],int);
void displayTree(int[],int,int);
void inOrder(int[],int,int);
void preOrder(int[],int,int);
void postOrder(int[],int,int);

void main()
{
    int height,size;
    printf("Enter height of tree: ");
    scanf("%d",&height);
    size=(int)pow(2,height)-1;
    int tree[size];
    createTree(tree,size);
    displayTree(tree,height,size);
    printf("\nInorder Traversal: ");
    inOrder(tree,0,size);
    printf("\nPreorder Traversal: ");
    preOrder(tree,0,size);
    printf("\nPostorder Traversal: ");
    postOrder(tree,0,size);
}
void createTree(int tree[], int s)
{
    for (int i = 0; i < s; i++)
    {
        if (i == 0)
        {
            printf("Enter root node: ");
            scanf("%d", &tree[i]);
        }
        if (tree[i] != -1)
        {
            int left = 2 * i + 1, right = 2 * i + 2;
            if (left < s)
            {
                printf("Enter left child of %d (-1 for empty): ", tree[i]);
                scanf("%d", &tree[left]);
            }
            if (right < s)
            {
                printf("Enter right child of %d (-1 for no empty): ", tree[i]);
                scanf("%d", &tree[right]);
            }
        }
        else continue;
    }
}
void displayTree(int tree[], int height, int size)
{
    // Prints tree in the format:
    // 1
    // 2 3
    // 4 5 6 7
    for (int level = 0; level < height; level++) {
        int nodes = (int)pow(2, level);
        int index_start = (int)pow(2, level) - 1;
        // Print leading spaces for centering
        int leading = (int)pow(2, height - level - 1) - 1;
        for (int s = 0; s < leading; s++) printf(" ");
        for (int n = 0; n < nodes; n++) {
            int index = index_start + n;
            if (index < size && tree[index] != -1)
                printf("%d", tree[index]);
            else
                printf("E");
            // Print space between nodes (except after last node)
            if (n != nodes - 1) {
                int between = (int)pow(2, height - level) - 1;
                for (int s = 0; s < between; s++) printf(" ");
            }
        }
        printf("\n");
    }
    
}

void inOrder(int tree[], int index, int size)
{
    if (index >= size || tree[index] == -1)
        return;
    inOrder(tree, 2 * index + 1, size);
    printf("%d ", tree[index]);
    inOrder(tree, 2 * index + 2, size);
}
void preOrder(int tree[], int index, int size)
{
    if (index >= size || tree[index] == -1)
        return;
    printf("%d ", tree[index]);
    preOrder(tree, 2 * index + 1, size);
    preOrder(tree, 2 * index + 2, size);
}
void postOrder(int tree[], int index, int size)
{
    if (index >= size || tree[index] == -1)
        return;
    postOrder(tree, 2 * index + 1, size);
    postOrder(tree, 2 * index + 2, size);
    printf("%d ", tree[index]);
}