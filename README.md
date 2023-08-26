# brincando-no-terminal-com-dio
## Projeto simples de iteração com o terminal utilizando de uma classe para armazenar os dadoos oriundos de input do usuário

### Relação dos Atributos propostos para classe ContaTerminal.java

| Tipo | Nome do Atriburo |
|------|------------------|
|String|Nome do Cliente|
| int|Número da Conta|
|String|Número da Agência|
|double| Saldo|

### Utilização do Loop "do while" (Entenda a diferença e porque foi usado)

Temos:

```java
/**
 * loop for
 * É utilizado quando se sabe a quantidade exata a se repetir determinado processo
 * Exemplo:
 */
for (int i = 0; i<10; i++) {
    //seu código
}
```

```java
/**
 * loop while
 * É utilizado mediante a verificação prévia de determinada condição
 * Exemplo:
 */

int numero = 5; 

while(numero > 2) {
    numero--;
    System.out.println(numero);
}
//Será exibido no terminal os números 4, 3, 2.

```

```java
/**
 * Loop do while
 * É utilizado quando é necessário a execução de um processo pelo menos uma vez
 * Exemplo:
*/
char option;
int numero = 1;
//Caso for testar em sua máquina não esqueça de importar "import java.util.Scanner";
Scanner input = new Scanner(System.in); 

do {
    System.out.println("Você passou por aqui! "  + numero + "vez(es)");
    numero++;
    System.out.println("Deseja continuar? S/N");
    option = input.nextLine().charAt(0);
}while(option == 'S');
```
### 📚 Este material faz parte do bootcamp Santander 2023.