# Guia de Contribuição

Antes de qualquer coisa, para contribuir com esse repositório você precisa criar uma conta no [CodeFights](https://codefights.com/signup/ep9uk7hzCGLCuxHak/main).

## Contribuindo

### Fazendo o Fork

Após criar a conta no site você precisa fazer um fork neste repositório, e clonar o fork para o seu computador.

### Tipos de Contribuições

Existirão 3 maneiras diferentes de contribuir para este repositório. Por issues, consertando erros (bug fixes) e demonstrando uma abordagem diferente para o mesmo problema.

Para cada linguagem já existente há um exemplo de código. Todas as contribuições deverão ser feitas seguindo o padrão comentário com nome do autor e versão do programa precedendo o código-fonte. Esses comentários deverão seguir o padrão de documentação da respectiva linguagem.

Um exemplo em Java:

```java
/**
 * @author <Nome do autor>
 * @version <versão do código>
 */
 
 class HelloWorld {
     public static void main(String[] args){
         System.out.println("Hello World!");
     }
 }
```

#### Issues

Na aba de issues teremos alguns exercícios que precisam ser feitos. Caso você queira fazer aquele exercício específico, você deve comentar na thread em qual linguagem pretente fazer aquele exercício.

Caso não exista uma issue para o exercício que você deseja fazer, você pode criar a issue e logo depois comentá-la informando em qual linguagem pretende fazer aquele problema.

#### Bug fixes

Você pode também encontrar erros nos códigos aqui presentes, ou erros nos documentos deste repositório. Neste caso, você só precisa submeter a sua correção.

Em casos de correção de código-fonte, você deve também alterar `@author` para `@authors`, e adicionar o seu nome juntamente com o primeiro autor do código.

#### Abordagem diferente

Caso você tenha uma resposta diferente para um mesmo problema, você deve criar um segundo método dentro do arquivo, com um nome padrão `<metodo>_newSolution()` onde metodo deve ser correspondente ao nome do método da primeira solução.

Você deve também alterar `@author` para `@authors`, e adicionar o seu nome juntamente com o primeiro autor do código.

### Adicionando seu nome em `AUTHORS.md`

Depois de fazer a sua contribuição com o nosso em forma de implementação ou correção, você deve alterar o arquivo `AUTHORS.md` para que seu nome esteja na seção **Contribuidores**. Lembrando que a lista de contribuidores deve permanecer em ordem alfabética.

### Dando o Pull Request

Agora que você passou por todos os passos é só fazer um PR! Você deve criar uma branch chamada `code/<nome-do-problema>-<linguagem>` e fazer o commit desta branch para o seu github. Agora, no seu github você deve comparar a sua branch com o `master` deste repositório e fazer um pull request. 

O padrão para o nome de um pull request deve ser `<Nome do Problema> em <linguagem> #<número da issue>`, e você deve explicar a sua alteração no campo de mensagem da tela de pull request.

E é isso! Pull Request **DONE**!

LEMBRANDO QUE: não se deve fazer um merge, nem se deve fechar o pull request. Ambas estas ações serão feitas pelos administradores deste repositório.
