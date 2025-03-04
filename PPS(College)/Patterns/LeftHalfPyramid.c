#include <stdio.h>

int main() {
     int n =4 ;
     for(int i=0 ;i<n ; i++){
         for(int j=0;j<2*(n-i)-1 ;j++){
             printf(" ");
         }
         for(int k=0 ;k<=i; k++){
             printf("* ");
         }
         printf("\n");
     }
     
     numberLeftHalf(n);
     alphabetRightHalf(n);
}

 void numberLeftHalf(int n ){
     for(int i=1 ;i<=n ; i++){
         for(int k=0;k<2*(n-i)-1 ;k++){
             printf(" ");
         }
         for(int j=i ;j>=1; j--){
             printf(" %d", j);
         }
         printf("\n");
         
     }
 }

void alphabetRightHalf(int n){
    for(int i=0 ;i<n ; i++){
         for(int j=0;j<2*(n-i)-1 ;j++){
             printf(" ");
         }
         for(int k=0 ;k<=i; k++){
             printf("%c ",'A'+k);
         }
         printf("\n");
     }
}


