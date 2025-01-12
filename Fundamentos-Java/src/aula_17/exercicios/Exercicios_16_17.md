# Exercícios de Java – Aula 16 e 17

Link do curso: [Curso Java Básico - Java SE Gratuito](http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/)

## Lista de Exercícios

1. [✅] Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

2. [✅] Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

3. [✅] Faça um programa que leia e valide as seguintes informações:
   - Nome: maior que 3 caracteres;
   - Idade: entre 0 e 150;
   - Salário: maior que zero;
   - Sexo: 'f' ou 'm';
   - Estado Civil: 's', 'c', 'v', 'd'.

4. [✅] Supondo que a população de um país A seja da ordem de 80.000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200.000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.
   - **Exemplo**: Se A tem 80.000 habitantes e cresce 3% ao ano, e B tem 200.000 habitantes crescendo 1.5%, o programa deve calcular quando A >= B.

5. [✅] Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

6. [✅] Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.

7. [✅] Faça um programa que leia 5 números e informe o maior número.

8. [✅] Faça um programa que leia 5 números e informe a soma e a média dos números.

9. [✅] Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

10. [✅] Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

11. [✅] Altere o programa anterior para mostrar no final a soma dos números.

12. [✅] Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada.
    - **Exemplo de saída**:
      ```
      Tabuada de 5:
      5 X 1 = 5
      5 X 2 = 10
      ...
      5 X 10 = 50
      ```

13. [✅] Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.

14. [✅] Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.

15. [✅] A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n-ésimo termo.
    - **Exemplo de entrada**: 10
    - **Saída**: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

16. [✅] A série de Fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o valor seja maior que 500.
    - **Saída esperada**: 0, 1, 1, 2, 3, 5, ..., 377, 610

17. [✅] Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    - **Exemplo**: 5! = 5.4.3.2.1 = 120
    - **Exemplo de saída**:
      ```
      Fatorial de: 5
      5! = 5 . 4 . 3 . 2 . 1 = 120
      ```

18. [✅] Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

19. [✅] Altere o programa anterior para que ele aceite apenas números entre 0 e 1000.

20. [✅] Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.

21. [✅] Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. Um número primo é aquele que é divisível somente por ele mesmo e por 1.

22. [✅] Altere o programa de cálculo dos números primos, informando, caso o número não seja primo, por quais números ele é divisível.

23. [✅] Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário. O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.

24. [✅] Faça um programa que calcule e mostre a média aritmética de N notas.

25. [✅] Faça um programa que peça para N pessoas a sua idade, ao final o programa deverá verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

26. [✅] Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

27. [✅] Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

28. [✅] Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles.

29. [✅] O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99. Para agilizar o cálculo, desenvolva um programa que monta uma tabela de preços para até 50 produtos.
    - **Exemplo de saída**:
      ```
      Lojas Quase Dois - Tabela de preços
      1 - R$ 1.99
      2 - R$ 3.98
      3 - R$ 5.97
      ...
      50 - R$ 99.50
      ```

30. [✅] O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha. Desenvolva um programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário.
    - **Exemplo de entrada**: Preço do pão: R$ 0.18
    - **Exemplo de saída**:
      ```
      Panificadora Pão de Ontem - Tabela de preços
      1 - R$ 0.18
      2 - R$ 0.36
      ...
      50 - R$ 9.00
      ```

31. [✅] O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências. Faça um programa que implemente uma caixa registradora rudimentar, calculando o total da compra e o troco do cliente.
    - **Exemplo de saída**:
      ```
      Lojas Tabajara
      Produto 1: R$ 2.20
      Produto 2: R$ 5.80
      Produto 3: R$ 0
      Total: R$ 9.00
      Dinheiro: R$ 20.00
      Troco: R$ 11.00
      ```

32. [✅] Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    - **Exemplo de saída**:
      ```
      Fatorial de: 5
      5! = 5 . 4 . 3 . 2 . 1 = 120
      ```

33. [✅] O Departamento Estadual de Meteorologia desenvolveu um programa que lê temperaturas e informa a menor, a maior e a média das temperaturas informadas.

34. [✅] Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

35. [✅] Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.

36. [✅] Desenvolva um programa que faça a tabuada de um número qualquer inteiro digitado pelo usuário, mas permitindo que a tabuada inicie e termine em valores definidos pelo usuário.

37. [✅] Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, o mais gordo e o mais magro. Desenvolva um programa que colete essas informações e calcule as médias de altura e peso.



38. [✅] Um funcionário de uma empresa recebe aumento salarial anualmente. Desenvolva um programa que determine o salário atual do funcionário, considerando:
    - Salário inicial em 1995: R$ 1.000,00;
    - Aumento de 1,5% sobre o salário inicial em 1996;
    - A partir de 1997, os aumentos salariais correspondem ao dobro do percentual do ano anterior.

39. [✅] Leia dez conjuntos de dois valores: o primeiro representa o número do aluno e o segundo a sua altura. Encontre o aluno mais alto e o mais baixo, exibindo seus números e alturas.

40. [✅] Faça uma estatística em cinco cidades brasileiras sobre acidentes de trânsito, coletando:
    - Código da cidade;
    - Número de veículos de passeio em 1999;
    - Número de acidentes de trânsito com vítimas em 1999.
    - Informe:
      - O maior e o menor índice de acidentes e suas cidades;
      - A média de veículos nas cinco cidades;
      - A média de acidentes nas cidades com menos de 2.000 veículos.

41. [✅] Faça um programa que receba o valor de uma dívida e mostre uma tabela com:
    - Valor da dívida;
    - Valor dos juros;
    - Quantidade de parcelas;
    - Valor da parcela.
    - **Tabela de juros:**
      - 1 parcela: 0% de juros;
      - 3 parcelas: 10% de juros;
      - 6 parcelas: 15% de juros;
      - 9 parcelas: 20% de juros;
      - 12 parcelas: 25% de juros.

42. [✅] Leia uma quantidade indeterminada de números positivos e conte quantos estão nos intervalos:
    - [0-25], [26-50], [51-75], [76-100].
    - O programa deve encerrar ao receber um número negativo.

43. [✅] O cardápio de uma lanchonete é:
    - Cachorro Quente: R$ 1,20;
    - Bauru Simples: R$ 1,30;
    - Bauru com Ovo: R$ 1,50;
    - Hambúrguer: R$ 1,20;
    - Cheeseburguer: R$ 1,30;
    - Refrigerante: R$ 1,00.
    - Faça um programa que leia o código dos itens e suas quantidades, exibindo o total a ser pago.

44. [✅] Simule uma eleição presidencial com quatro candidatos, permitindo votos nulos e brancos. Calcule:
    - Total de votos para cada candidato;
    - Total de votos nulos e brancos;
    - Percentuais de votos nulos e brancos sobre o total.

45. [✅] Desenvolva um programa que pergunte as respostas de 10 questões de múltipla escolha a um aluno e compare com o gabarito. Exiba:
    - Número de acertos;
    - Nota do aluno.
    - Após todos os alunos responderem, mostre:
      - Maior e menor acerto;
      - Total de alunos;
      - Média de acertos da turma.

46. [✅] Em uma competição de salto em distância, cada atleta realiza cinco saltos. Calcule:
    - Média dos saltos, desconsiderando o melhor e o pior.
    - **Exemplo de saída:**
      ```
      Atleta: João
      Saltos: 6.5, 6.1, 6.2, 5.4, 5.3
      Melhor salto: 6.5
      Pior salto: 5.3
      Média dos demais saltos: 6.0
      ```

47. [✅] Em uma competição de ginástica, cada atleta recebe votos de sete jurados. A melhor e a pior nota são eliminadas. Calcule:
    - Média das notas restantes.
    - **Exemplo de saída:**
      ```
      Atleta: Maria
      Notas: 9.9, 7.5, 9.5, 8.5, 9.0, 8.5, 9.7
      Melhor nota: 9.9
      Pior nota: 7.5
      Média: 9.04
      ```

48. [✅] Peça um número inteiro positivo e exiba-o invertido.
    - **Exemplo:** Entrada: 12376489 → Saída: 98467321

49. [✅] Mostre os N termos da série: `S = 1/1 + 2/3 + 3/5 + ...` e calcule a soma.

50. [✅] Sendo `H = 1 + 1/2 + 1/3 + ... + 1/N`, calcule o valor de H com N termos.

51. [✅] Refaça o exercício 49, exibindo os cálculos intermediários e a soma ao final.

52. [✅] Sendo H = 1 + 1/2 + 1/3 + ... + 1/N, faça um programa que calcule o valor de H com N termos.

Fonte dos exercícios: [Estrutura de Repetição - Python Brasil](http://wiki.python.org.br/EstruturaDeRepeticao)



