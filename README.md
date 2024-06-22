# Desafio Controle de Fluxo - Projeto Java

Este projeto foi desenvolvido como parte da trilha de Java Básico da Digital Innovation One (DIO). Ele demonstra o uso de controle de fluxo em Java através da contagem e impressão de números sequenciais, com validação de parâmetros via terminal e lançamento de exceções customizadas.

## Funcionalidades

- Leitura de Parâmetros: O programa solicita ao usuário dois números inteiros via terminal.
- Validação de Parâmetros: Verifica se o primeiro número é menor que o segundo. Caso contrário, lança uma exceção ParametrosInvalidosException.
- Contagem e Impressão: Realiza uma contagem e imprime os números sequencialmente no intervalo definido pelos parâmetros.

  ## Estrutura do Projeto

  - `Contador.java`: Classe principal que contém o método main para execução do programa.
  - `ParametrosInvalidosException.java`: Classe de exceção customizada para lidar com a situação em que o segundo parâmetro é menor ou igual ao primeiro.
 
  ## Como Executar o Projeto
 
  ### Pré-requisitos

  - JDK (Java Development Kit) instalado
  - Git (opcional, se você deseja clonar o repositório)
 
    ## Executando Localmente
  1. Clone o Repositório:
     git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/wastenio/Desafio-Controle-De-Fluxo)

     Ou faça o download do projeto diretamente do GitHub.

  2. Navegue até o Diretório do Projeto:
     cd DesafioControleFluxo

  3. Compile o Código:
     javac Contador.java

  4. Execute o Programa:
     java Contador

  5. Siga as Instruções no Terminal:

     - Digite o primeiro número quando solicitado.
     - Digite o segundo número quando solicitado.
     - O programa realizará a contagem e imprimirá os números conforme o intervalo definido.
