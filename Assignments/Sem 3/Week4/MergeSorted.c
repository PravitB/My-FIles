#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;

node* createNode(node*,int);
node* insertLast(node*,int);
node* mergeSorted(node*, node*);
void display(node*);

void main()
{
    node *list1,*list2,*merged;

    list1=NULL;
    list2=NULL;

    list1=createNode(list1, 0);
    list1=insertLast(list1, 10);
    list1=insertLast(list1, 20);
    list1=insertLast(list1, 30);
    list1=insertLast(list1, 40);

    list2=createNode(list2, 5);
    list2=insertLast(list2, 15);
    list2=insertLast(list2, 25);
    list2=insertLast(list2, 35);
    list2=insertLast(list2, 45);
    
    printf("List 1:\n");
    display(list1);
    printf("List 2:\n");
    display(list2);

    printf("Merged List:\n");
    merged=mergeSorted(list1, list2);
    display(merged);
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
    if (h == NULL)
        return n;
    while(p->next!=NULL)
        p=p->next;
    p->next=n;    
    return h;
}
node* mergeSorted(node* l1, node* l2)
{
    node *merged = NULL;

    while ((l1 != NULL) || (l2 != NULL))
    {
        if (l1 == NULL)
        {
            merged = insertLast(merged, l2->data);
            l2 = l2->next;
        }
        else if (l2 == NULL)
        {
            merged = insertLast(merged, l1->data);
            l1 = l1->next;
        }
        else
        {
            if (l1->data < l2->data)
            {
                merged = insertLast(merged, l1->data);
                l1 = l1->next;
            }
            else
            {
                merged = insertLast(merged, l2->data);
                l2 = l2->next;
            }
        }
    }
    // while ((l1 != NULL) || (l2 != NULL))
    // {
    //     if (l1->data < l2->data)
    //     {
    //         merged = insertLast(merged, l1->data);
    //         l1 = l1->next;
    //     }
    //     else
    //     {
    //         merged = insertLast(merged, l2->data);
    //         l2 = l2->next;
    //     }
    // }
    // while (l1 != NULL) {
    //     merged = insertLast(merged, l1->data);
    //     l1 = l1->next;
    // }
    // while (l2 != NULL) {
    //     merged = insertLast(merged, l2->data);
    //     l2 = l2->next;
    // }
    return merged;
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