# Exercícios de Java – Aula 19

Link do curso: [Curso Java Básico - Java SE Gratuito](http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/)

---

1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho com os **mesmos** elementos do vetor A, ou seja:  
   `B[i] = A[i]`.

2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho com os elementos de A **multiplicados por 2**, ou seja:  
   `B[i] = A[i] * 2`.

3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o **quadrado** do respectivo elemento de A, ou seja:  
   `B[i] = A[i] * A[i]`.

4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser a **raiz quadrada** do respectivo elemento de A, ou seja:  
   `B[i] = sqrt(A[i])`.

5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o **respectivo elemento de A multiplicado por sua posição** (ou índice), ou seja:  
   `B[i] = A[i] * i`.

6. Criar dois vetores A e B, cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a **soma** dos respectivos elementos em A e B, ou seja:  
   `C[i] = A[i] + B[i]`.

7. Criar dois vetores A e B, cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a **subtração** dos respectivos elementos em A e B, ou seja:  
   `C[i] = A[i] - B[i]`.

8. Criar dois vetores A e B, cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a **multiplicação** dos respectivos elementos em A e B, ou seja:  
   `C[i] = A[i] * B[i]`.

9. Criar dois vetores A e B, cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a **divisão** dos respectivos elementos em A e B, ou seja:  
   `C[i] = A[i] / float(B[i])`.

10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o **resto da divisão** do respectivo elemento de A por 2, ou seja:  
    `B[i] := A[i] % 2`.

11. Criar um vetor A com 10 elementos inteiros. Implementar um programa que **conte e escreva a quantidade de elementos pares** armazenados neste vetor.

12. Criar um vetor A com 10 elementos inteiros. Implementar um programa que **calcule e escreva a soma** de todos os elementos armazenados neste vetor.

13. Criar um vetor A com 10 elementos inteiros. Implementar um programa que **determine a soma** dos elementos múltiplos de 5 armazenados neste vetor.

14. Criar um vetor A com 10 elementos inteiros. Implementar um programa que **defina e escreva a média aritmética simples** dos elementos ímpares armazenados neste vetor.

15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que **defina o percentual** de elementos pares e ímpares armazenados neste vetor.

16. Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:  
    - a) A **soma** de elementos armazenados neste vetor que são inferiores a 15;  
    - b) A **quantidade** de elementos armazenados no vetor que são iguais a 15;  
    - c) A **média** dos elementos armazenados no vetor que são superiores a 15.

17. Ler um vetor A com 10 elementos inteiros correspondentes às **idades de um grupo de pessoas**. Escreva um programa que determine e exiba a quantidade de pessoas com **idade superior a 35 anos**.

18. Ler um vetor A com 10 elementos inteiros correspondentes às **idades de um grupo de pessoas**. Escreva um programa que determine e exiba:  
    - A menor idade e sua posição.  
    - A maior idade e sua posição.

19. Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores `Nota1` e `Nota2`. Calcular a **média aritmética simples** das notas e armazenar o resultado em um vetor `Result`. Exibir a situação de cada aluno:  
    - Média >= 7: "Aprovado".  
    - Média < 7: "Reprovado".

20. Implementar um programa que obtenha a **cotação do dólar (US$)** em relação ao real (R$). Armazene em um vetor A com 20 elementos as seguintes conversões:  
    `A[i] = cotação do dólar * i`, para todo `i` variando de 1 até 20.

21. Gerar aleatoriamente um vetor A com 10 elementos inteiros contendo apenas valores 0 ou 1 (use: `A[i] = (int)Math.round(Math.random() * 1)`). Calcular o **percentual de números 0 e 1** no vetor.

22. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se **todos os elementos** do vetor são pares. Caso encontre um elemento ímpar, interrompa a verificação.

23. Verificar se um vetor A de 10 elementos inteiros é um **palíndromo** (os elementos em ordem inversa são iguais à ordem direta).

24. Criar um vetor A com 10 elementos inteiros. Desenvolver um vetor B, que seja:
    - `1` se `A[i] > B[i]`;
    - `0` se `A[i] == B[i]`;
    - `-1` se `A[i] < B[i]`.

25. Criar um vetor A com 10 elementos inteiros. Escrever um programa que construa um vetor B onde:
    - `B[i] = 1` se `A[i]` for par;
    - `B[i] = 0` se `A[i]` for ímpar.

26. Ler um vetor A com 20 elementos e separá-los em:
    - Vetor B: Elementos pares.
    - Vetor C: Elementos ímpares.

27. Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B:
    - Pares no início.
    - Ímpares nas últimas posições.

28. Criar um vetor A com 10 elementos inteiros. Escrever um programa que imprima a **tabuada de cada elemento** do vetor.

29. Criar um vetor A com 10 elementos inteiros. Escrever um programa que identifique se cada elemento do vetor é um **número primo**.

30. Criar um vetor A com 10 elementos inteiros. Escrever um programa que imprima cada elemento e **todos os seus divisores**.

31. Criar um vetor A com 11 elementos, onde cada elemento é formado pela **potência de base 2 elevado ao expoente igual à posição** do respectivo elemento, ou seja:  
    `A[i] = 2^i`.

32. Criar um vetor A com 15 elementos inteiros. Construir um vetor B, onde cada elemento de B é o **fatorial** do elemento correspondente em A.

33. Ler um vetor A com 10 elementos. Construir um vetor B onde cada elemento de B é o **somatório de A[j]** para todo `j` variando de `i` até o final.

34. Criar dois vetores A e B de 10 elementos cada. Construir:
    - Vetor C: Interseção dos vetores A e B (elementos que estão em ambos).

35. Criar dois vetores A e B de 10 elementos cada. Construir:
    - Vetor C: Diferença entre A e B (elementos de A que não estão em B).

36. Ler 10 elementos em um vetor A. Desenvolver uma rotina de **busca** para verificar se um número X está no vetor.

37. Ler 10 elementos em um vetor A. Organizar os elementos em **ordem crescente**.

37. Ler 10 elementos em um vetor A. Organizar os elementos em **ordem crescente**.

38. Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento de B deverá ser o seguinte somatório:  
    `B[i] = Somatório de A[j]`, para todo `j` variando de `i` até o final do vetor.

39. Criar dois vetores A e B, cada um com 10 elementos inteiros. Desenvolver um programa que realize a **interseção dos vetores A e B** para produzir um vetor C.  
    - **Interseção de conjuntos**: Todos os elementos que existem em A e também existem em B.

40. Criar dois vetores A e B, cada um com 10 elementos inteiros. Desenvolver um programa que crie um vetor C que é a **diferença dos conjuntos** formados pelos elementos dos vetores A e B.  
    - **Diferença de conjuntos**: Todos os elementos do conjunto A que não existem no conjunto B.

41. Ler 10 elementos inteiros em um vetor A. Montar uma rotina de busca para pesquisar se um dado elemento X está armazenado em A.

42. Ler 10 elementos inteiros em um vetor A e organizá-los em **ordem crescente**, apresentando os elementos ordenados.

---

Fonte dos exercícios:  
[Lista de Vetores](http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/Lista%20Vetores.HTM)
