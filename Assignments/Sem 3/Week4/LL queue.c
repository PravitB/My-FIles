#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* enque(node*,int);
node* deque(node*);
void display(node*);

void main()
{
    node *queue;
    queue=NULL;
    int opt, val, y=1;
    while(y)
    {
        printf("Enter 1,2,3,4 to enque,deque,peek,exit: ");
        scanf("%d",&opt);
        switch (opt)
        {
            case 1:
                printf("Enter value to enque: ");
                scanf("%d",&val);
                queue=enque(queue,val);
                display(queue);
                break;
            case 2:
                queue=deque(queue);
                display(queue);
                break;
            case 3:
                if (queue!=NULL)
                    printf("Front element: %d\n", queue->data);
                else
                    printf("Queue Underflow\n");
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
node* enque(node* h,int data)
{
    node *n,*p;
    p=h;
    n=createNode(n,data);
    if (h == NULL)
        return n;
    while(p->next!=NULL)
        p=p->next;
    p->next=n;    
    return h;
}
node* deque(node* h)
{
    if (h==NULL)
    {
        printf("Queue Underflow\n");
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
        printf("Empty");
    else
    {
        printf("Queue elements: ");
        while(p!=NULL)
        {
            printf("%d ",p->data);
            p=p->next;
        }
    }
        
    printf("\n");    
}