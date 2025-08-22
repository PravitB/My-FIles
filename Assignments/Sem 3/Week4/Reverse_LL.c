#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* createList();
node* insertLast(node*,int);
node* reverseList(node*);
void display(node*);

void main()
{
    node* head;
    head=NULL;
    head=createList();
    head=insertLast(head, 10);
    head=insertLast(head, 20);
    head=insertLast(head, 30); 
    head=insertLast(head, 40);
    head=insertLast(head, 50);
    head=reverseList(head);
    display(head);
}
node* createNode(node* n,int data)
{
	n=(node*)malloc(sizeof(node));
	n->data=data;
	n->next=NULL;
}
node* createList()
{
    node *start,*n;
    int data;
    start=NULL;
    printf("Enter data for first node: ");
    scanf("%d",&data);
    n=createNode(n,data);
    start=n;
    return start;
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
node* reverseList(node* head)
{
    node *prev = NULL, *current = head, *next = NULL;
    while (current != NULL)
    {
        next = current->next; // Store next node
        current->next = prev; // Reverse the link
        prev = current;       // Move prev to current
        current = next;       // Move to next node
    }
    return prev; // New head of the reversed list
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