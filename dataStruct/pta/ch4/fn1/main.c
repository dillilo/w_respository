#include <stdio.h>

int PutStr(const char *str);

int main()
{
    char a[1024];
    int n;
    gets(a);
    n = PutStr(a);
    printf("(%d)\n", n);
    return 0;
}

/* 你提交的代码将被嵌在这里 */
int PutStr(const char *str){
    printf("%s",str);
    int cnt = 0;
    while (*str)
    {
        cnt++;
        *str++;
    }
    
    return cnt;
}