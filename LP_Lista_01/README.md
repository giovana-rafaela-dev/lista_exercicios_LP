![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
   2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisa ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
      ```mermaid
      flowchart TD
        inicio(( Início )) --> entrada1[\Digite sua nota\]
        entrada1 --> entrada2[\Digite sua frequência em %\]
        entrada2 --> teste{Nota >= 50 \nE\n frequência >= 75% ?}
        teste --> |Não| resposta1[/ Reprovado /]
        teste --> |Sim| resposta2[/ Aprovado /]
        resposta1 --> final([Fim]) 
        resposta2 --> final
       ```
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
       inicio(( Início)) --> entrada1[\ Digite o N1 \]
       entrada1 --> entrada2[\ Digite o N2\]
       entrada2 --> sum{ Resultado = N1 + N2 }
       sum --> out[/ Resultado /] 
       out --> finish([fim])   
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   ```mermaid
   flowchart TD
      inicio(( Início)) --> entrada1[\ Digite um número\]
      entrada1 --> teste{ Número >=0?}
      teste --> |Não| resposta1[/ É negativo/]
      teste --> |Sim| resposta2[/ É positivo/]
      resposta1 --> out([ fim])
      resposta2 --> out
     
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      inicio(( Início )) --> entrada[\ Digite sua idade\]
      entrada --> verificação{ Idade >16? \n e \n Possui Título de Eleitor?}
      verificação --> |Não| resposta1[/ Você não pode votar /]
      verificação --> |Sim| resposta2[/Você pode votar/]
      resposta1 --> out([ fim ])
      resposta2 --> out
   ```
   
   6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
      ```mermaid
      flowchart TD
       inicio(( Início)) --> num1[\ Digite o N1\]
       num1 --> num2[\ Digite o N2 \]
       num2 --> teste{ N1>N2?}
       teste --> |Sim| resposta1[/ O N1 é maior/]
       teste --> |Não| verificação{N2>N1?}
       verificação --> |Sim| resp[/ N2 é maior/]
       verificação --> |Não| resp[/ Os dois números são iguais/]
       resp -->out([ fim ])
       resposta1 -->out 
   
      ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      inicio(( Início)) --> num1[\Digite o N1\]
      num1 --> num2[\Digite o N2 \]
      num2 --> num3[\Digite o N3\]
      num3 --> teste{N1>N2?}
      teste --> |Sim| cond2{N1>N3?}
      teste --> |Não| cond3{N2>N3?}
      cond2 --> |Sim| resposta[/O N1 é maior/]
      cond2 --> |Não| resposta3[/O N3 é maior/]
      cond3 --> |Sim| resposta2[/O N2 é maior/]
      cond3 --> |Não| resposta3
      resposta --> out([fim])
      resposta2 --> out
      resposta3 --> out

   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      A(( Início)) --> B[\Digite um Número\]
      B --> C{n>1?}
      C --> |Sim| D[r=r*n]
      D --> E[n=n-1]
      E --> F[n=n-1]
      F --> D
      D --> |Não| G[/Resposta = r/]
      G --> H([Fim])
   ```
   
   9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   >    Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >   **Exemplos**:  
   >    - 9 % 2 = 1  
   >    - 11 % 3 = 2
   
      ```mermaid
      flowchart TD
         inicio(( Início)) -->num[\Digite um número\]
         num --> teste{N % 2 = 0?}
         teste --> |Sim| resposta1[/Seu número é par/]
         teste --> |Não| resposta2[/Seu número é ímpar/] 
         resposta1 --> out([fim])
         resposta2 --> out
      ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
      A(( Início)) --> B[\Digite um número\]
      B --> C[i=n/2]
      C --> D{i>1?}
      D --> |sim| E{O resto da divisão \n de n por i \n igual a zero?}
      D --> |não| F[/É primo/]   
      E --> |sim| H[/Não é primo/]
      E --> |não| G[i=i-1]
      G --> D
      F --> I([Final])
      H --> I  
   ```