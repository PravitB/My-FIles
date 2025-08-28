#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* insertLast(node*,int);
node* loopEnd(node*);
void detectLoop(node*);
void display(node*);

void main()
{
    node* head;
    head=NULL;
    head=createNode(head,5);
    head=insertLast(head, 10);
    head=insertLast(head, 20);
    head=insertLast(head, 30); 
    head=insertLast(head, 40);
    head=insertLast(head, 50);
    node* list=loopEnd(head);
    detectLoop(head);
    detectLoop(list);
    
}
node* createNode(node* n,int data)
{
	n=(node*)malloc(sizeof(node));
	n->data=data;
	n->next=NULL;
    return n;
}
node* insertLast(node* h,int data)
{
    node *n,*p;
    p=h;
    n=createNode(n,data);
    while(p->next!=NULL)
        p=p->next;
    p->next=n;
    return h;
}

node* loopEnd(node* h)
{
    node *p=h,*q=h;
    int pos;
    while(p->next!=NULL)
        p=p->next;
    printf("Enter node pos to loop to:"); 
    scanf("%d",&pos);   
    for (int i=0;i<pos-1;i++)
        q=q->next;
    p->next=q;
    return h;    
}
void detectLoop(node* h)
{
    node *p=h,*q=h;
    int cond=0;
        while (p->next!=q||p->next!=NULL)
        {
            while (q->next!=p)
                q=q->next;
            p=p->next;
        }
    if (p->next==q)
        cond=1;            
    if (cond) printf("There is a loop");
    else printf("No Loop");   
}

void display(node* h)
{
    node* p=h;
    if (p==NULL)
        printf("Empty");
    else
        while (p!=NULL)
        {
            printf("%d ",p->data);
            p=p->next;
        }
	printf("\n");    
}
