#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;
 
node* createList();
node* insertFirst(node*);
node* insertAny(node*);
node* insertLast(node*);
node* deleteFirst(node*);
node* deleteLast(node*);
node* deleteAny(node*);
void display(node*);
void count(node*);
void menu(node*);
 
void main()
{
    node* head;
    head=NULL;
    head=createList();
    menu(head);
}
node* createList()
{
    node *start,*n;
    start=NULL;
    n=(node*)malloc(sizeof(node));
    printf("enter data");
    scanf("%d",&n->data);
    n->next=NULL;
    start=n;
    return start;
}
node* insertFirst(node* h)
{
    node *n;
    n=(node*)malloc(sizeof(node));
    printf("Enter data");
    scanf("%d",&n->data);
    n->next=h;
    h=n;
    return h;
}
node* insertLast(node* h)
{
    node *n,*p;
    p=h;
    n=(node*)malloc(sizeof(node));
    printf("Enter data");
    scanf("%d",&n->data);
    n->next=NULL;
    while(p->next!=NULL)
        p=p->next;
    p->next=n;    
    return h;
}
node* insertAny(node* h)
{
    node *n,*p,*q;
    int pos;
    p=h;
    q=p->next;
    n=(node*)malloc(sizeof(node));
    printf("Enter Position:");
    scanf("%d",&pos);
    printf("Enter data");
    scanf("%d",&n->data);
    n->next=NULL;
    for(int i=0;i<pos;i++)
    {
        p=p->next;
        q=q->next;
    }
    p->next=n;
    n->next=q;
    return h;    
}
node* deleteFirst(node* h)
{
    node *p;
    p=h;
    h=p->next;
    free(p);
    return h;
}
node* deleteLast(node* h)
{
    node *p,*q;
    p=h;
    q=p;
    while(p->next!=NULL)
    {
        p=p->next;
        q=p;
    }    
    q->next=NULL;
    free(p);
    return h;
}
node* deleteAny(node* h)
{
    node *p,*q;
    int pos;
    p=h;
    q=p->next;
    printf("Enter Position:");
    scanf("%d",&pos);
    for(int i=0;i<pos;i++)
    {
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return h;
}
void display(node* h)
{
    node* p=h;
    if (p==NULL)
        printf("Empty");
    else
        while (p!=NULL)
        {
            printf("%d",p->data);
            p=p->next;
        }    
}
void count(node* h)
{
    int cnt = 0;
    node* p = h;
    while (p != NULL)
    {
        cnt++;
        p = p->next;
    }
    printf("Count: %d\n", cnt);
}
 
void menu(node* h)
{
    int opt,sopt,y=1;
    while(y)
    {
        printf("Enter 1,2,3,4 to insert,delete,display,exit");
        scanf("%d",&opt);
        switch (opt)
        {
            case 1:
                printf("\nEnter 1,2,3 to insert at First,Last,Position");
                scanf("%d",&sopt);
                switch (sopt)
                {
                    case 1:
                        h = insertFirst(h);
                        break;
                    case 2:
                        h = insertLast(h);
                        break;
                    case 3:
                        h = insertAny(h);
                        break;
                    default:
                        printf("invalid\n");
                }
                break;    
            case 2:
                printf("\nEnter 1,2,3 to delete from First,Last,Position");
                scanf("%d",&sopt);
                switch (sopt)
                {
                    case 1:
                        h = deleteFirst(h);
                        break;
                    case 2:
                        h = deleteLast(h);
                        break;
                    case 3:
                        h = deleteAny(h);
                        break;
                    default:
                        printf("invalid\n");
                }
                break;
            case 3:
                display(h);
                break;
            case 4:
                y=0;
                break;
            default:
                printf("invalid option\n");
        }
        
    }    
}
