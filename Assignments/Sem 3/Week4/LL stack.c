#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* push(node*,int);
node* pop(node*);
void display(node*);

void main()
{
    node *stack;
    stack=NULL;
    int opt, val, y=1;
    while(y)
    {
        printf("Enter 1,2,3,4 to push,pop,peek,exit: ");
        scanf("%d",&opt);
        switch (opt)
        {
            case 1:
                printf("Enter value to push: ");
                scanf("%d",&val);
                stack=push(stack,val);
                display(stack);
                break;
            case 2:
                stack=pop(stack);
                display(stack);
                break;
            case 3:
                if (stack!=NULL)
                    printf("Top element: %d\n", stack->data);
                else
                    printf("Stack Underflow\n");
                break;
            case 4:
                y=0;
                break;
            default:
                printf("invalid option\n");
        }
    }
}
node* createNode(node* n,int data)
{
    n=(node*)malloc(sizeof(node));
    n->data=data;
    n->next=NULL;
    return n;
}
node* push(node* h,int data)
{
    node *n;
    n=createNode(n,data);
    n->next=h;
    h=n;
    return h;
}
node* pop(node* h)
{
    if (h==NULL)
    {
        printf("Stack Underflow\n");
        return h;
    }
    node *p=h;
    h=h->next;
    free(p);
    return h;
}
void display(node* h)
{
    node* p=h;
    if (p==NULL)
        printf("Stack is empty\n");
    else
    {   
        printf("Stack elements: ");
        while(p!=NULL)
        {
            printf("%d ",p->data);
            p=p->next;
        }
    }
    printf("\n");    
}