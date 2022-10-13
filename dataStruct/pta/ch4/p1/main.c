#include<stdio.h>
#include<string.h>
struct List
{
    char str;
};

int main(){
    char s1[100];
    gets(s1);
    char s2[100];
    gets(s2);
    char t[100];
    char *p;
    while((p = strstr(s1,s2)) != NULL){
        strcpy(t,p+strlen(s2));
        *p = '\0';
        strcat(s1,t);
    }
    puts(s1);
    return 0;
}