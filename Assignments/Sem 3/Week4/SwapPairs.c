#include <stdio.h>
#include <stdlib.h>
 
typedef struct Node
{
    int data;
    struct Node* next;
}node;


node* createNode(node*,int);
node* insertLast(node*,int);
node* swap(node*);
void display(node*);

void main()
{
    node *list, *swapped;
    list = insertLast(list, 10);
    list = insertLast(list, 20);
    list = insertLast(list, 30);
    list = insertLast(list, 40);
    printf("Original List:\n");
    display(list);
    swapped = swap(list);
    printf("Swapped List:\n");
    display(swapped); 
}
node* createNode(node* n, int data)
{
    n = (node*)malloc(sizeof(node));
    n->data = data;
    n->next = NULL;
    return n;
}
node* insertLast(node* h, int data)
{
    node *n, *p;
    p = h;
    n = createNode(n, data);
    if (h == NULL)
        return n;
    while (p->next != NULL)
        p = p->next;
    p->next = n;    
    return h;
}
node* swap(node* head)
{
    if (head == NULL || head->next == NULL) return head;

    node *prev = head, *current = head->next;
    head = current; // New head is the second node

    while (1) {
        node *nextPair = current->next;
        current->next = prev; // Swap current and previous
        if (nextPair == NULL || nextPair->next == NULL) {
            prev->next = nextPair; // Link last swapped node to the end
            break;
        }
        prev->next = nextPair->next; // Link previous to the next pair
        prev = nextPair; // Move prev to the next pair
        current = prev->next; // Move current to the next pair's second node
    }
    return head;
}
void display(node* h)
{
    node* p = h;
    if (p == NULL)
        printf("Empty");
    else
        while (p != NULL)
        {
            printf("%d ", p->data);
            p = p->next;
        }
    printf("\n");    
}