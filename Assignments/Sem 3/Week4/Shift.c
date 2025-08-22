#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* insertLast(node*,int);
int count(node*);
node* lshiftList(node*, int);
void display(node*);

void main()
{
    node *list, *shifted;
    list=createNode(list, 10);
    list=insertLast(list, 20);
    list=insertLast(list, 30);
    list=insertLast(list, 40);
    printf("Enter the number of positions to shift: ");
    int pos;
    scanf("%d", &pos);
    printf("Original List:\n");
    display(list);
    shifted=lshiftList(list, pos);
    printf("Shifted List:\n");
    display(shifted); 
}

node* createNode(node* n, int data)
{
    n=(node*)malloc(sizeof(node));
    n->data=data;
    n->next=NULL;
    return n;
}
node* insertLast(node* h, int data)
{
    node *n, *p;
    p=h;
    n=createNode(n, data);
    if (h == NULL)
        return n;
    while(p->next != NULL)
        p=p->next;
    p->next=n;    
    return h;
}
int count(node* h)
{
    int c = 0;
    node* p = h;
    while (p != NULL)
    {
        c++;
        p = p->next;
    }
    return c;
}
node* lshiftList(node* h, int pos)
{
    node *p = h, *nh = h, *last=h;
    if (pos == 0) 
        return h;
    else if (pos>count(h) || pos < 0) {
        printf("Invalid position to shift.\n");
        return h;
    }
    else if (h == NULL || h->next == NULL)
        return h;
    else
    {   
        while (last->next != NULL)
        {
            last = last->next;
        }
        last->next = h; // Connect last node to head
        for (int i=0; i<pos-1;i++)
        {
            p=p->next;
        }
        nh = p->next; // New head after shifting
        p->next = NULL; // Break the link
        
    }
    return nh; // Return the new head of the shifted list
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