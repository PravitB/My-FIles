#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;
 
node* createNode(node*,int);
node* createList();
node* insertFirst(node*,int);
node* insertAny(node*,int);
node* insertLast(node*,int);
node* deleteFirst(node*);
node* deleteLast(node*);
node* deleteAny(node*);
void display(node*);
int count(node*);
void dispOE(node*);
void menu(node*);
 
void main()
{
    node* head;
    head=NULL;
    head=createList();
    menu(head);
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
node* insertFirst(node* h,int data)
{
    node *n;
    n=createNode(n,data);
    n->next=h;
    h=n;
    return h;
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
node* insertAny(node* h,int data)
{
    node *n,*p,*q;
    int pos;
    p=h;
    q=p->next;
    n=createNode(n,data);
    printf("Enter Position: ");
    scanf("%d",&pos);
    for(int i=0;i<pos-2;i++)
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
    q=p->next;
    while(q->next!=NULL)
    {
        p=p->next;
        q=q->next;
    }    
    p->next=NULL;
    free(q);
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
    for(int i=0;i<pos-2;i++)
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
            printf("%d ",p->data);
            p=p->next;
        }
	printf("\n");    
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
void dispOE(node* h)
{
	int size,o=0,e=0;
	node *p=h;
	size=count(h);
	int odd[size],even[size];
    for (int i=0;i<size;i++)
    {
        if (i % 2 == 0) 
            odd[o++] = p->data; 
        else 
            even[e++] = p->data;
        p = p->next;
    }
    printf("Odd: ");
    for (int i =0;i<o;i++)
    {
        printf("%d ", odd[i]);
    }
    
    printf("\nEven: ");
    for (int i =0;i<e;i++)
    {
        printf("%d ", even[i]);
	}
    
    printf("\n");
}
void menu(node* h)
{
    int opt,sopt,c,x,y=1;
    while(y)
    {
        printf("Enter 1,2,3,4 to insert,delete,display,exit: ");
        scanf("%d",&opt);
        switch (opt)
        {
            case 1:
                printf("Enter data:");
                scanf("%d",&x);
                printf("\nEnter 1,2,3 to insert at First,Last,Position: ");
                scanf("%d",&sopt);
                switch (sopt)
                {
                    case 1:
                        h = insertFirst(h,x);
                        break;
                    case 2:
                        h = insertLast(h,x);
                        break;
                    case 3:
                        h = insertAny(h,x);
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
            	printf("\nEnter 1,2,3 to display List,Count,Odd/Even: ");
                scanf("%d",&sopt);
                switch (sopt)
                {
                	case 1:
						display(h);
						break;
					case 2:
						c=count(h);
						printf("Count: %d\n", c);
						break;
					case 3:
						dispOE(h);
						break;
					default:
						printf("invalid\n");	
				}
                
                break;
            case 4:
                y=0;
                break;
            default:
                printf("invalid option\n");
        }
        
    }    
}
