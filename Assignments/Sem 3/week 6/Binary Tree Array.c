#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void createTree(int[],int);
void displayTree(int[],int,int);

void main()
{
    int height,size;
    printf("Enter height of tree: ");
    scanf("%d",&height);
    size=(int)pow(2,height)-1;
    int tree[size];
    createTree(tree,size);
    displayTree(tree,height,size);
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
    int level = 0;                // Current level in tree
    int index = 0;                // Index in array
    int nodesOnLevel;             // Number of nodes at this level

    printf("\nBinary Tree (level order):\n");

    // Loop through each level
    while (index < size && level < height)
    {
        nodesOnLevel = (int)pow(2, level); // Nodes at current level
        int spaces = (int)pow(2, height - level - 1) - 1; // Leading spaces for centering

        // Print leading spaces
        for (int s = 0; s < spaces; s++)
            printf("  ");

        // Print nodes at this level
        for (int n = 0; n < nodesOnLevel && index < size; n++, index++)
        {
            // Print node value or space if node is -1 (no node)
            if (tree[index] != -1)
                printf("%2d", tree[index]);
            else
                printf(" ? ");

            // Print spaces between nodes
            for (int s = 0; s < 2 * spaces + 1; s++)
                printf(" ");
        }
        printf("\n");
        level++;
    }
}

