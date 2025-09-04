#include <stdio.h>
#include <stdlib.h>
#include <math.h>

typedef struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
}node;

node* createNode(int);
node* createTree(node*);
int height(node*);
void displayLevel(node*, int);
void displayTree(node*);
void inOrder(node*);
void preOrder(node*);
void postOrder(node*);
int countNodes(node*);
int countLeaf(node*);
int countInternal(node*);
int searchHelper(node*, int);
void search(node*, int);

void main()
{
    node *root;
    printf("Enter data for root node: ");
    int data;
    scanf("%d", &data);
    root = createNode(data);
    root = createTree(root);
    displayTree(root);
    printf("\nInorder Traversal: ");
    inOrder(root);
    printf("\nPreorder Traversal: ");
    preOrder(root);
    printf("\nPostorder Traversal: ");
    postOrder(root);
    printf("\n");
    printf("Number of nodes: %d\n",countNodes(root));
    printf("Height of tree: %d\n", height(root));
    printf("Number of leaf nodes: %d\n", countLeaf(root));
    printf("Number of internal nodes: %d\n", countInternal(root));
    int s;
    printf("Enter element to search: ");
    scanf("%d",&s);
    search(root,s);
}
node* createNode(int data)
{
    node* n = (node*)malloc(sizeof(node));
    n->data = data;
    n->left = NULL;
    n->right = NULL;
    return n;
}
node* createTree(node* n)
{
    int leftData, rightData;
    printf("Enter left child of %d (-1 for no child): ", n->data);
    scanf("%d", &leftData);
    if (leftData != -1)
    {
        n->left = createNode(leftData);
        createTree(n->left);
    }
    printf("Enter right child of %d (-1 for no child): ", n->data);
    scanf("%d", &rightData);
    if (rightData != -1)
    {
        n->right = createNode(rightData);
        createTree(n->right);
    }
    return n;
}
int height(node* n)
{
    if (n == NULL)
        return 0;
    else
    {
        int lHeight = height(n->left);
        int rHeight = height(n->right);
        if (lHeight > rHeight)
            return lHeight + 1;
        else
            return rHeight + 1;
    }
}
void displayLevel(node* n, int level)
{
    int nodes= (int)pow(2, level - 1);
    if (n == NULL)
        {
            while (nodes--)
                printf("E ");
            return;
        }
    if (level == 1)
        printf("%d ", n->data);
    else if (level > 1)
    {
        displayLevel(n->left, level - 1);
        displayLevel(n->right, level - 1);
    }
}


void displayTree(node* n)
{  
    int h = height(n);
    for (int level = 0; level < h; level++) 
    {
        int leading=0;
        if (level == 0) leading = (int)pow(2, h - 1) - 1;
        else if (level != h-1) leading = 2 *( h - level);
        for (int s = 0; s < leading; s++) printf(" ");
        displayLevel(n, level + 1);
        printf("\n");
    }
}


void inOrder(node* n)
{
    if (n == NULL)
        return;
    else
    {
        inOrder(n->left);
        printf("%d ", n->data);
        inOrder(n->right);
    }
}
void preOrder(node* n)
{
    if (n == NULL)
        return;
    else
    {
        printf("%d ", n->data);
        preOrder(n->left);
        preOrder(n->right);
    }
}
void postOrder(node* n)
{
    if (n == NULL)
        return;
    else
    {
        postOrder(n->left);
        postOrder(n->right);
        printf("%d ", n->data);
    }
}

int countNodes(node* n)
{
    if (n == NULL)
        return 0;
    else
        return 1 + countNodes(n->left) + countNodes(n->right);
}

int countLeaf(node* n)
{
    if (n == NULL)
        return 0;
    if (n->left == NULL && n->right == NULL)
        return 1;
    else
        return countLeaf(n->left) + countLeaf(n->right);
}
int countInternal(node* n)
{
    if (n == NULL || (n->left == NULL && n->right == NULL))
        return 0;
    else
        return 1 + countInternal(n->left) + countInternal(n->right);
}
int searchHelper(node* n, int key)
{
    if (n == NULL)
        return 0;
    
    if (n->data == key)
        return 1;
    
    return searchHelper(n->left, key) || searchHelper(n->right, key);
}

void search(node* n, int key)
{
    if (searchHelper(n, key))
        printf("Element %d found in the tree.\n", key);
    else
        printf("Element %d not found in the tree.\n", key);
}