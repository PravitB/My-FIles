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
node* cloneList(node*);
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
    display(head);
    node* list1=cloneList(head);
    list1=loopEnd(list1);
    display(head);
    detectLoop(head);
    detectLoop(list1);
    
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
node* cloneList(node* head) {
    if (!head) return NULL;
    node *newHead = createNode(NULL, head->data);
    node *curr = newHead, *orig = head->next;
    while (orig) {
        curr->next = createNode(NULL, orig->data);
        curr = curr->next;
        orig = orig->next;
    }
    return newHead;
}
node* loopEnd(node* h)
{
    node *p = h, *q = h;
    int pos, len = 0;
    while (p != NULL) 
    {
        len++;
        p = p->next;
    }
    printf("Enter node position to loop to (1 to %d): ", len);
    scanf("%d", &pos);
    if (pos < 1 || pos > len) 
    {
        printf("Invalid position! No loop created.\n");
        return h;
    }
    p = h;
    while (p->next != NULL)
        p = p->next;
    for (int i = 1; i < pos; i++)
        q = q->next;
    p->next = q;
    return h;   
}
void detectLoop(node* h)
{
    node *p = h, *q = h;
    while (q && q->next) 
    {
        p = p->next;
        q = q->next->next;
        if (p == q) 
            {
                printf("There is Loop\n");
                return;
            }
    }
    printf("No Loop\n");  
    // node *p=h,*q=h;
    //     while (p->next!=NULL)
    //     {
    //         while (q->next!=p||q->next!=NULL)
    //             q=q->next;
    //         q=h;
    //         p=p->next;
    //     }
    // if (p->next==q)
    // {
    //     printf("There is a loop");
    //     return;
    // }            
    // printf("No Loop");  
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
