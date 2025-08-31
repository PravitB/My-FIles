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
    node *list1=NULL, *list2=NULL;
    list1=createNode(list1,5);
    list1=insertLast(list1, 10);
    list1=insertLast(list1, 20);
    list1=insertLast(list1, 30); 
    list1=insertLast(list1, 40);
    list1=insertLast(list1, 50);
    list2=createNode(list2,0);
    list2=insertLast(list2, 15);
    list2=insertLast(list2, 25);
    list2=insertLast(list2, 35); 
    list2=insertLast(list2, 45);
    list2=insertLast(list2, 55);
    list2=loopEnd(list2);
    detectLoop(list1);
    detectLoop(list2);
    
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
    //     while (p->next!=q||p->next!=NULL)
    //     {
    //         while (q->next!=p||q->next!=NULL)
    //         {
    //             if (p->next==q)
    //             {
    //             printf("Loop Detected\n");
    //             return;
    //             }
    //             q=q->next;
    //         }    
            
    //         p=p->next;
    //         q=h;
    //     }          
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
