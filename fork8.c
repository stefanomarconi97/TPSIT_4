#include<stdio.h>
#include<unistd.h>
#include<sys/types.h>
int main(){
    int i,p,cont=0;
    for(i=0;i<2;i++){
        cont++;
        p=fork();
        if(p>0)
            p=fork();
        if(p==0){
            cont=0;
        }
    }
    printf("Sono il processo %d, ho eseguito %d cicli\n",getpid(),cont);
}
