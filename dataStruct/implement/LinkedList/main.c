#include<stdio.h>
#include<stdlib.h>

struct List{
    struct List * next;
    int data;
};
typedef struct List * LinkList;

LinkList create(){
    LinkList L = (LinkList)malloc(sizeof(struct List));
    L->next = NULL;
    L->data = -1;
    return L;
}

LinkList insert(LinkList L,int data){
    LinkList p = (LinkList)malloc(sizeof(struct List));
    p->data = data;
    LinkList tail = L;
    tail->next = p;
    tail = p;
    tail->next = NULL;
    return tail;
}

void print(LinkList L){
    LinkList p = L->next;
    while (p)
    {
        printf("%d",p->data);
        p = p->next;
    }
    
}

int main(){
    int N;
    scanf("%d",&N);
    LinkList L = create();
    insert(L,N);
    insert(L,29);
    print(L);
    return 0;
}