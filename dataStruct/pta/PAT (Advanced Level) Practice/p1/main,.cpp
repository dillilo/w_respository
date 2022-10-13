#include<bits/stdc++.h>
using namespace std;
void hanoi(int num,char qishi,char mu,char fuzhu){
    static int i =1;
    if(num == 1){
        printf("第%d从%c移到%c\n",i,qishi,mu);
        i++;
    }else{
        hanoi(num-1,qishi,fuzhu,mu);
        printf("第%d从%c移到%c\n",i,qishi,fuzhu);
        
        i++;
        hanoi(num-1,fuzhu,mu,qishi);
    }

}
int main(){
    char a = 'a',b = 'b',c = 'c';
    hanoi(3,a,b,c);
    return 0;
}