# 🔲 Manipulação e Processamento de Matrizes em Java

![java-9](https://github.com/user-attachments/assets/7d272eaa-4d0d-4a30-a69a-d95fa313e49b)

Este repositório contém diversos programas em Java que exploram o uso de **matrizes (arrays bidimensionais)**, abordando operações fundamentais para o desenvolvimento de algoritmos envolvendo estruturas tabulares de dados.

Entre os principais conceitos abordados, destacam-se:

- **Matrizes (arrays bidimensionais):** Estruturas que permitem armazenar dados em formato de tabela (linhas e colunas), possibilitando acesso por dois índices.
- **Estruturas condicionais:** Uso de `if-else` para validações como matriz diagonal e compatibilidade entre matrizes.
- **Estruturas de repetição:** Uso de `for` aninhados para percorrer linhas e colunas de matrizes.
- **Operações matemáticas com matrizes:** Como soma, multiplicação, cálculo de determinante e transposição.
- **Manipulação por posição:** Acesso direto a elementos via índices `[i][j]`, permitindo operações específicas como diagonais e posições pares.

Além disso, os programas aplicam boas práticas como **modularização**, organização por responsabilidades e reutilização de código.

## 🔹 Estruturas Utilizadas

- **Arrays bidimensionais (`int[][]`)**
  - Representam matrizes de tamanho fixo.
  - Permitem acesso direto a qualquer posição.

- **Loops aninhados (`for`)**
  - Essenciais para percorrer matrizes linha por linha e coluna por coluna.

- **Scanner**
  - Utilizado para entrada de dados pelo usuário.

---

## 🚀 Tecnologias Utilizadas

- **Java (JDK 8+)**
- **Arrays bidimensionais (`int[][]`)**
- **Estruturas condicionais (`if`, `else`)**
- **Estruturas de repetição (`for`)**
- **Entrada de dados com `Scanner`**
- **Validação de operações matemáticas**
- **Modularização do código**

## 📌 Confira meu artigo no DEV.to

Para explorar mais sobre manipulação de **matrizes**, estruturas bidimensionais e operações matemáticas em Java, confira meu artigo no [DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-8-35bm) 🚀

Neste artigo, compartilho exemplos práticos e soluções eficientes para manipulação de **arrays bidimensionais (`int[][]`)**, abordando operações como:

- cálculo de **determinante**
- **soma e multiplicação de matrizes**
- **matriz transposta**
- **validação de matriz diagonal**
- **operações com diagonais e posições específicas**
- **percorrer linhas e colunas com loops aninhados**

Além disso, demonstro o uso de **estruturas de repetição** (`for` aninhado),  
**controle de fluxo** (`if-else`) e validações importantes para garantir a correta execução de operações entre matrizes.

O objetivo é apresentar boas práticas na manipulação de estruturas bidimensionais, desde a entrada de dados com `Scanner` até a organização do código de forma **modular, eficiente e fácil de manter.**

## 📂 Estrutura do Projeto

```estrutura
▦ matrizes
├── 📁 determinanteMatriz
│   └── DeterminanteMatriz.java
├── 📁 maiorValorMatriz
│   └── MaiorValorMatriz.java
├── 📁 maiorValorMatrizV2
│   └── MaiorValorMatrizV2.java
├── 📁 matrizDiagonal
│   └── MatrizDiagonal.java
├── 📁 matrizDiagonalV2
│   └── MatrizDiagonalV2.java
├── 📁 matrizTransposta
│   └── MatrizTransposta.java
├── 📁 matrizTranspostaV2
│   └── MatrizTranspostaV2.java
├── 📁 mediaPosicoesPares
│   └── MediaPosicoesPares.java
├── 📁 mediaPosicoesParesV2
│   └── MediaPosicoesParesV2.java
├── 📁 multiplicacaoMatrizes
│   └── MultiplicacaoMatrizes.java
├── 📁 somaDiagonalPrincipal
│   └── SomaDiagonalPrincipal.java
├── 📁 somaDiagonalPrincipalV2
│   └── SomaDiagonalPrincipalV2.java
├── 📁 somaLinhasColunas
│   └── SomaLinhasColunas.java
├── 📁 somaLinhasColunasV2
│   └── SomaLinhasColunasV2.java
├── 📁 somaMatrizes
│   └── SomaMatrizes.java
├── 📁 somaMatrizesV2
│   └── SomaMatrizesV2.java
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**
Abra o terminal e navegue até a pasta raiz do projeto. Em seguida, execute o seguinte comando para compilar o código:

```sh
javac -d . vetores/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**
Após a compilação, você pode executar o programa com o comando abaixo:

```sh
java vetores.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java matrizes.determinanteMatriz.determinanteMatriz
```

## 📌 Descrição dos Programas

### 🔢 **Cálculo do Determinante de uma Matriz 3x3**

**Objetivo:** Faça um programa que leia uma matriz 3x3 e calcule o determinante da matriz.

---

### 🔝 **Maior Valor em uma Matriz 5x5**

**Objetivo:** Faça um programa que preencha uma matriz 5x5 com números inteiros e exiba o maior valor da matriz e a posição em que ele se encontra.

### 🔝 **Maior Valor em uma Matriz NxN**

**Objetivo:** Faça um programa que preencha uma matriz NxN com números inteiros e exiba o maior valor da matriz e a posição em que ele se encontra.

---

### 🔲 **Verificação de Matriz Diagonal (4x4)**

**Objetivo:** Faça um programa que leia uma matriz 4x4 e verifique se ela é uma matriz diagonal, ou seja, se todos os elementos fora da diagonal principal são iguais a zero.

### 🔲 **Verificação de Matriz Diagonal NxN**

**Objetivo:** Faça um programa que leia uma matriz NxN e verifique se ela é uma matriz diagonal.

---

### 🔄 **Matriz Transposta (4x4)**

**Objetivo:** Faça um programa que preencha uma matriz 4x4 com valores aleatórios e exiba a matriz transposta.

### 🔄 **Matriz Transposta NxN**

**Objetivo:** Faça um programa que preencha uma matriz NxN com valores aleatórios e exiba a matriz transposta.

---

### 📉 **Média das Posições Pares (3x3)**

**Objetivo:** Faça um programa que leia uma matriz 3x3 e calcule a média dos valores presentes nas posições pares (onde a soma dos índices é par).

### 📉 **Média das Posições Pares NxN**

**Objetivo:** Faça um programa que leia uma matriz NxN e calcule a média dos valores presentes nas posições pares.

---

### ✖️ **Multiplicação de Matrizes**

**Objetivo:** Faça um programa que leia duas matrizes e exiba o resultado da multiplicação entre elas, verificando previamente se a operação é possível.

---

### ➕ **Soma da Diagonal Principal (3x3)**

**Objetivo:** Faça um programa que preencha uma matriz 3x3 com valores informados pelo usuário e exiba a soma dos valores da diagonal principal.

### ➕ **Soma da Diagonal Principal NxN**

**Objetivo:** Faça um programa que preencha uma matriz NxN e exiba a soma dos valores da diagonal principal.

---

### 📊 **Soma de Linhas e Colunas (4x4)**

**Objetivo:** Faça um programa que preencha uma matriz 4x4 com números aleatórios e exiba a soma dos valores de cada linha e de cada coluna.

### 📊 **Soma de Linhas e Colunas NxN**

**Objetivo:** Faça um programa que preencha uma matriz NxN e exiba a soma dos valores de cada linha e coluna.

---

### 💡 **Soma de Matrizes 2x2**

**Objetivo:** Faça um programa que leia duas matrizes 2x2 e exiba a soma entre elas.

### 💡 **Soma de Matrizes NxN**

**Objetivo:** Faça um programa que leia duas matrizes NxN e exiba a soma entre elas.

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, 
novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos 
programas ou funcionalidades, sinta-se à vontade para abrir um Pull Request. 
Estou ansioso para ver suas melhorias! 😃
