# Gerenciador de Investimentos

Este projeto é um aplicativo Android que simula o gerenciamento de investimentos, permitindo adicionar investimentos, calcular o retorno total, listar os investimentos e identificar quais precisam de revisão com base no retorno gerado.

## Funcionalidades

- **Adicionar Investimentos:** É possível adicionar diferentes tipos de investimentos como Renda Fixa e Renda Variável, com valor investido e taxa de retorno.
- **Calcular Retorno Total:** O sistema calcula o retorno total de todos os investimentos e exibe o valor.
- **Listar Investimentos:** Exibe os detalhes de todos os investimentos cadastrados, incluindo valores e retornos.
- **Investimentos para Revisão:** Identifica os investimentos que precisam de revisão, com base em um critério de retorno inferior a R$ 100.

## Tecnologias Utilizadas

- **Android Studio**: Para o desenvolvimento do aplicativo Android.
- **Java**: Linguagem de programação utilizada para implementar a lógica do sistema.
- **Logcat**: Para exibição de informações no log do Android.

## Estrutura do Código

### Interface `Investimento`
A interface define os métodos necessários para qualquer tipo de investimento, incluindo a possibilidade de calcular o retorno, obter uma descrição, verificar se precisa de revisão e exibir os detalhes.

### Classe `InvestimentoBase`
Classe abstrata que implementa a interface `Investimento` e contém a lógica comum para todos os investimentos, como cálculo de retorno e verificação de revisão.

### Classes de Investimentos Específicos
- `InvestimentoRendaFixa`: Representa investimentos de renda fixa como CDBs e Tesouro Direto.
- `InvestimentoRendaVariavel`: Representa investimentos de renda variável como ações e criptomoedas.

### Classe `GerenciadorInvestimentos`
Responsável por gerenciar os investimentos, incluindo adição, cálculo de retorno total e listagem de investimentos que precisam de revisão.

## Como Rodar o Projeto

1. **Clone o repositório** para o seu ambiente local:
    ```bash
    git clone https://github.com/seu-usuario/gerenciador-investimentos.git
    ```

2. **Abra o projeto no Android Studio**.

3. **Compile e execute o aplicativo** no emulador ou dispositivo Android.

4. **Interaja com o aplicativo** para adicionar investimentos e ver o retorno total, a lista de investimentos e os investimentos que precisam de revisão.

## Exemplo de Saída no Logcat

--LISTA DE INVESTIMENTOS:

Renda Fixa: CDB Banco X | Investido: R$5000,00 | Retorno: R$250,00

Renda Fixa: Tesouro Direto | Investido: R$3000,00 | Retorno: R$90,00 (Precisa de Revisão)

Renda Variável: Ações TechCorp | Investido: R$7000,00 | Retorno: R$480,20

Renda Variável: Criptomoeda XYZ | Investido: R$2000,00 | Retorno: R$184,00

--Retorno Total: R$1004,20

--Investimentos que precisam de revisão:

Tesouro Direto | Investido: R$3000,00 | Retorno: R$90,00 (Precisa de Revisão)




