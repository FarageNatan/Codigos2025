#include <stdlib.h>
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool isPalindromo(char frase[100]){
    int inicio = 0, fim = strlen(frase) - 1;
    while(inicio < fim){
        if(frase[inicio] != frase[fim]){
            return false;
        }
        inicio++;
        fim--;
    }
    return true;
}

int main(){
    char frase1[100];
    scanf("%[^\n]", frase1);
    while(strcmp(frase1, "FIM") != 0){
        if(isPalindromo(frase1)){
            printf("SIM\n");
        }
        else{
            printf("NAO\n");
        }
        scanf(" %[^\n]", frase1);
    }
    return 0;
}