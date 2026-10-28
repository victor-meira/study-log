# 📊 Sistema de Desempenho Acadêmico em Java

## 📌 Sobre o projeto

O **Sistema de Desempenho Acadêmico** é um projeto desenvolvido em Java com o objetivo de colocar em prática os fundamentos da linguagem estudados durante minha jornada de aprendizado em programação.

A aplicação recebe o nome de um estudante e suas notas, calcula a média aritmética, determina sua situação acadêmica e apresenta um relatório com os resultados obtidos.

Mais do que construir uma aplicação funcional, este projeto representa uma oportunidade de consolidar conceitos essenciais da linguagem Java e compreender como eles se complementam na resolução de problemas.

## 🎯 Objetivos

- Praticar os fundamentos da sintaxe Java.
- Desenvolver o raciocínio lógico por meio de operações matemáticas e estruturas condicionais.
- Compreender a declaração e a utilização de variáveis e constantes.
- Trabalhar com entrada de dados, processamento e saída de informações.
- Aplicar boas práticas de organização e legibilidade do código.

## ⚙️ Funcionalidades

- Leitura do nome do estudante e de suas notas.
- Cálculo da média aritmética.
- Verificação da situação acadêmica por meio de estruturas condicionais.
- Identificação de excelente desempenho.
- Cálculo da diferença entre a média obtida e a nota mínima estabelecida.
- Geração de um relatório formatado no console.
- Representação de códigos de status em formato binário, utilizando conceitos de operações bitwise.

## 🧠 Fundamentos Java aplicados

### 1. Variáveis e tipos de dados

O projeto utiliza diferentes tipos de dados para representar as informações processadas pela aplicação:

- `String`: armazenamento do nome e da situação do estudante.
- `double`: representação das notas e da média, permitindo trabalhar com valores decimais.
- `int`: armazenamento de códigos numéricos e resultados de operações com inteiros.
- `boolean`: representação de condições lógicas, como a verificação de aprovação.

Compreender os tipos de dados é essencial para escolher representações adequadas às informações e evitar operações incompatíveis.

### 2. Constantes com `final`

A palavra-chave `final` é utilizada para definir valores que não devem ser reatribuídos durante a execução, como a nota mínima para aprovação.

```java
final double NOTA_MINIMA = 7.0;
```

O uso de constantes torna o código mais consistente, facilita a manutenção e evita a repetição de valores fixos em diferentes partes do programa.

### 3. Operadores aritméticos e de atribuição

Os operadores aritméticos permitem realizar os cálculos necessários para determinar a média e a diferença em relação à nota mínima.

Operadores de atribuição, como `=`, permitem armazenar resultados em variáveis, enquanto operadores compostos, como `+=`, podem simplificar operações de acumulação.

Esses conceitos são fundamentais para transformar dados de entrada em informações úteis.

### 4. Operadores relacionais e lógicos

Operadores como `>=`, `>`, `&&` e `||` permitem comparar valores e combinar condições.

No projeto, eles são utilizados para avaliar as notas, verificar a aprovação e identificar situações específicas de desempenho.

A compreensão desses operadores prepara o caminho para a construção de algoritmos capazes de tomar decisões com base em diferentes cenários.

### 5. Estruturas condicionais

As estruturas `if`, `else if` e `else` permitem executar diferentes blocos de código de acordo com as condições estabelecidas.

Nesse projeto, elas são utilizadas para distinguir notas inválidas, estudantes aprovados, reprovados e casos de excelente desempenho.

Esse conceito é um dos pilares da lógica de programação, pois permite que uma aplicação responda de maneira diferente conforme os dados recebidos.

### 6. Operadores bitwise

Os operadores bitwise trabalham diretamente com os bits que representam valores inteiros.

O projeto explora operadores como `&`, `|`, `^`, `<<` e `>>`, permitindo compreender como operações podem ser realizadas em nível binário.

Embora não sejam necessários para calcular médias, esses operadores ampliam a compreensão sobre a representação de números e o funcionamento de operações de baixo nível.

### 7. Entrada, processamento e saída de dados

A classe `Scanner` é utilizada para receber informações digitadas pelo usuário, enquanto `System.out.println()` e `System.out.printf()` permitem apresentar os resultados no console.

A formatação com `printf` possibilita exibir médias com duas casas decimais e organizar o relatório de maneira legível.

Essa separação entre entrada, processamento e saída ajuda a compreender o fluxo básico de execução de um programa.

## 🏗️ A importância desses fundamentos

Construir uma base sólida em Java vai além de memorizar palavras-chave ou aprender a sintaxe de comandos isolados. É necessário compreender como os diferentes elementos da linguagem trabalham juntos para resolver um problema.

Variáveis permitem representar informações, operadores transformam esses dados, estruturas condicionais controlam o fluxo de execução e mecanismos de entrada e saída tornam a aplicação interativa.

Ao reunir esses conceitos em um único projeto, busquei compreender não apenas como cada recurso funciona individualmente, mas também como aplicá-los de maneira integrada.

Essa base será importante para avançar em estudos futuros, como métodos, arrays, orientação a objetos e desenvolvimento de aplicações mais complexas.

## ▶️ Como executar o projeto

**Pré-requisitos:**
- JDK instalado.
- Editor de código ou IDE com suporte a Java, como IntelliJ IDEA, Eclipse ou VS Code.

**Passos para execução:**

1. Clone este repositório ou baixe os arquivos do projeto.
2. Abra o projeto no editor de sua preferência.
3. Compile o arquivo Java:

   ```bash
   javac SistemaDesempenho.java
   ```

4. Execute a aplicação:

   ```bash
   java SistemaDesempenho
   ```

5. Informe os dados solicitados e acompanhe o relatório gerado no console.

## 🧪 Testes e validações

Para verificar o comportamento da aplicação, podem ser utilizados diferentes cenários, incluindo:

- Notas que resultam em aprovação.
- Notas que resultam em reprovação.
- Média exatamente igual à nota mínima.
- Média correspondente a excelente desempenho.
- Notas fora do intervalo permitido.

Esses testes ajudam a identificar erros de lógica e verificar se as regras implementadas funcionam conforme o esperado.

## 📚 Contexto de aprendizagem

Este projeto foi desenvolvido como parte da minha jornada de aprendizado em programação, após os estudos dos fundamentos da sintaxe da linguagem Java.

A proposta é documentar minha evolução técnica por meio de exercícios práticos, reforçando os conceitos estudados e construindo uma base para projetos cada vez mais completos.

## 🚀 Próximos passos

Como possíveis evoluções do projeto, pretendo explorar:

- Organização do código em métodos.
- Repetição de operações com estruturas de laço.
- Armazenamento de múltiplos estudantes com arrays.
- Introdução à programação orientada a objetos.
- Aprimoramento das validações e da experiência de uso.

---

**Tecnologias:** Java

**Nível:** Iniciante

**Foco:** Fundamentos da linguagem, lógica de programação e prática de conceitos essenciais.

Este projeto faz parte do meu compromisso com o aprendizado contínuo e com a construção de uma trajetória profissional na área de Tecnologia da Informação. Data: 28/10/2026
