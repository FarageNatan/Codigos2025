#include <stdio.h>

int somaRecursiva(int num) {
    if (num == 0) {
        return 0;
    }
    return (num % 10) + somaRecursiva(num / 10); //funcao recursiva para somar os digitos
}

int main() {
    char linha[100];

    scanf("%s", linha);
    while (!(linha[0] == 'F' && linha[1] == 'I' && linha[2] == 'M' && linha[3] == '\0')) {
        int numero = 0;

        for (int i = 0; linha[i] != '\0'; i++) {
            numero = numero * 10 + (linha[i] - '0'); //conversao string/inteiro
        }

        printf("%d\n", somaRecursiva(numero));
        scanf("%s", linha);
    }

    return 0;
}
