#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node* left;
    struct Node* right;
}node;

node* createNode(int);
node* createTree(node*);
void displayTree(node*);
// void inOrder(node*);
// void preOrder(node*);
// void postOrder(node*);

void main()
{
    node *root;
    printf("Enter data for root node: ");
    int data;
    scanf("%d", &data);
    root = createNode(data);
    root = createTree(root);
    displayTree(root);
    // printf("\nInorder Traversal: ");
    // inOrder(root);
    // printf("\nPreorder Traversal: ");
    // preOrder(root);
    // printf("\nPostorder Traversal: ");
    // postOrder(root);
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
void displayTree(node* n)
{
    if (n == NULL)
        return;
    else
    {
        printf("%d ", n->data);
        displayTree(n->left);
        displayTree(n->right);
    }
}
