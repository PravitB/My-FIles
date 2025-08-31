
#include <stdio.h>
#include <stdlib.h>
 
typedef struct Term
{
    int coeff;
    int exp;
    struct Term* next;
}term;

term* createTerm(term*, int, int);
term* insertTerm(term*, int, int);
term* createPoly(term*);
term* addPoly(term*, term*);
term* multiplyPoly(term*, term*);
void display(term*);  

void main()
{
    term *poly1 = NULL, *poly2 = NULL, *sum = NULL, *mult=NULL;

    poly1 = createPoly(poly1);
    poly2 = createPoly(poly2);

    printf("First Polynomial:\n");
    display(poly1);
    printf("Second Polynomial:\n");
    display(poly2);

    sum = addPoly(poly1, poly2);
    mult = multiplyPoly(poly1,poly2);
    
    printf("Sum Polynomial:\n");
    display(sum);
    printf("Product Polynomial:\n");
    display(mult);
}

term* createTerm(term* t, int coeff, int exp)
{
    t = (term*)malloc(sizeof(term));
    t->coeff = coeff;
    t->exp = exp;
    t->next = NULL;
    return t;
}

term* insertTerm(term* h, int coeff, int exp)
{
    term *n, *p;
    n = createTerm(n, coeff, exp);
    if (h == NULL || h->exp < exp) {
        n->next = h;
        return n;
    }
    p = h;
    while (p->next != NULL && p->next->exp >= exp) {
        if (p->next->exp == exp) {
            p->next->coeff += coeff; // Combine like terms
            free(n);
            return h;
        }
        p = p->next;
    }
    n->next = p->next;
    p->next = n;
    return h;
}
term* createPoly(term* poly)
{
    int coeff, exp;
    printf("Enter terms for polynomial (coeff,exp) end with -1,-1:\n");
    while (1) {
        scanf("%d,%d", &coeff, &exp);
        if (coeff == -1 && exp == -1) break;
        poly = insertTerm(poly, coeff, exp);
    }
    return poly;
}
term* addPoly(term* p1, term* p2)
{
    term *sum = NULL;

    while (p1 != NULL || p2 != NULL) 
    {
        if (p1 == NULL) {
            sum = insertTerm(sum, p2->coeff, p2->exp);
            p2 = p2->next;
        }
        else if (p2 == NULL) {
            sum = insertTerm(sum, p1->coeff, p1->exp);
            p1 = p1->next;
        }
        else
        {
            if (p1->exp > p2->exp)
            {
                sum = insertTerm(sum, p1->coeff, p1->exp);
                p1 = p1->next;
            } 
            else if (p1->exp < p2->exp) 
            {
                sum = insertTerm(sum, p2->coeff, p2->exp);
                p2 = p2->next;
            } 
            else 
            {
                sum = insertTerm(sum, p1->coeff + p2->coeff, p1->exp);
                p1 = p1->next;
                p2 = p2->next;
            }
        }
    }

    return sum;
}
term* multiplyPoly(term* p1,term* p2)
{
    term* mult=NULL;

    while (p2!=NULL)
    {
        term* temp=p1;
        while (temp!=NULL)
        {
            mult=insertTerm(mult,temp->coeff*p2->coeff,temp->exp+p2->exp);
            temp=temp->next;
        }
        p2=p2->next;
    }
    return mult;
}
void display(term* h)
{
    term* p = h;
    if (p == NULL) {
        printf("0\n");
        return;
    }
    while (p != NULL) {
        printf("%dx^%d", p->coeff, p->exp);
        if (p->next != NULL) {
            printf(" + ");
        }
        p = p->next;
    }
    printf("\n");
}
