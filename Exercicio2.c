#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdbool.h>

// Função para verificar se a string é um palíndromo
int ehPalindromo(const char *str) {
    bool ehIgual = true;
    int inicio = 0;
    int fim = strlen(str) - 1;

    // Compara os caracteres do início e do fim, movendo-se para o centro
    while (fim > inicio) {
        
        // Converte os caracteres para minúsculas antes de comparar
        if (tolower(str[inicio]) != tolower(str[fim])) {
            ehIgual = false;
            return ehIgual; // Não é palíndromo
        }

        inicio++;
        fim--;
    }

    return ehIgual; // É palíndromo
}

int main() {
    char str[100];

    fgets(str, sizeof(str), stdin);

    // Remove o caractere de nova linha (\n) adicionado pelo fgets
    str[strcspn(str, "\n")] = '\0';

    while(strcmp(str, "FIM") != 0){
        if(ehPalindromo(str)){
            printf("SIM\n");
        }
        else{
            printf("NAO\n");
        }
        scanf(" %[^\n]", str);
    }

    return 0;
}