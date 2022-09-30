#include<stdio.h>
typedef struct Node
{
    /* data */
    int zhishu;
    int xishu;
}Node;
 Node arr1[10000];
 Node arr2[10000];


int main(){
    int n;
    int add[1001]={0};
    int mult[2001]={0};
    scanf("%d",&n);
    int cnt1 = 0,cnt2 = 0;
    for (int i = 0; i < n; i++)
    {
        int xishu,zhishu;
        scanf("%d %d",&xishu,&zhishu);
        arr1[i].xishu = xishu;
        arr1[i].zhishu = zhishu;
        add[zhishu] += xishu;
        cnt1++;
    }
    scanf("%d",&n);

    for (int i = 0; i < n; i++)
    {
        int xishu,zhishu;
        scanf("%d %d",&xishu,&zhishu);
        arr2[i].xishu = xishu;
        arr2[i].zhishu = zhishu;
        add[zhishu] += xishu;
        cnt2++;
    }
    
    for (int i = 0; i < cnt1; i++)
    {
        for (int j = 0; j < cnt2; j++)
        {
            mult[arr1[i].zhishu + arr2[j].zhishu] += arr1[i].xishu * arr2[j].xishu;
        }
        
    }

    int flag = 0;
    for (int i = 2000; i >= 0; i--)
    {
        if(mult[i] != 0)
            if (!flag)
            {
                printf("%d %d",mult[i],i);
                flag = 1;
            }else{
                printf(" %d %d",mult[i],i);
            }
                
            
            
    }
    if (!flag)
    {
        printf("0 0\n");
    }else{
        printf("\n");
    }
    flag = 0;

    for (int i = 1000; i >= 0; i--)
    {
        if(add[i] != 0)
            if (!flag)
            {
                printf("%d %d",add[i],i);
                flag = 1;
            }else{
                printf(" %d %d",add[i],i);
            } 
    }
    if (!flag)
    {
        printf("0 0");
    }
    
    return 0;
}