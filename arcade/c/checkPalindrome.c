/*  Funções que resolvem o problema do checkPalindrome em C (https://app.codesignal.com/arcade/intro/level-1/s5PbmwxfECC52PWyQ)
 *      Autor: Maycon Bruno de Jesus - Ciência da Computação - PUC-MG
 *      Versão: 1.0
 */
int tam(char* inputString){
    int tam = 0;
    
    for(int i=0; inputString[i] != '\0'; i++, tam++);
    
    return tam;
}

bool checkPalindrome(char* inputString) {
    bool resp = true;
    int i,j;
    int length = tam(inputString); //pegar o tamanho da string
    
    for(i=0, j=length-1; i < length/2; i++, j--){
        if(inputString[i] != inputString[j]){
            resp = false; //se achar algum caracter diferente mudar resp para false
        }
    }
    
    return resp;
}

