# Banco Digital com Java e Orientação a Objetos

## 📋 Descrição
Implementação de um sistema bancário simples em Java, utilizando conceitos fundamentais de Programação Orientada a Objetos (POO). O sistema simula um banco digital que oferece aos seus clientes dois tipos de contas (corrente e poupança), com as funcionalidades de depósito, saque e transferência entre contas da própria instituição.

## 🎯 Objetivo
Este projeto foi desenvolvido como parte do estudo e prática dos pilares da POO:
- **Abstração:** Criando modelos que representam objetos do mundo real
- **Encapsulamento:** Protegendo os dados e expondo apenas o necessário
- **Herança:** Reutilizando código através de hierarquia de classes
- **Polimorfismo:** Tratando objetos derivados como sendo do tipo da classe base

## 🛠️ Tecnologias Utilizadas
- Java 11+
- Paradigma de Orientação a Objetos

## 🔍 Estrutura do Projeto
O projeto consiste nas seguintes classes:
- `Cliente`: Representa o cliente do banco
- `IConta`: Interface que define as operações básicas de uma conta
- `Conta`: Classe abstrata que implementa a interface e serve como base para os tipos específicos
- `ContaCorrente`: Implementação de conta do tipo corrente
- `ContaPoupanca`: Implementação de conta do tipo poupança
- `Banco`: Representa a instituição bancária
- `Main`: Classe com método principal para demonstração do sistema

## 📈 Funcionalidades Implementadas
- [x] Criação de clientes
- [x] Criação de contas (corrente e poupança)
- [x] Operação de depósito
- [x] Operação de saque
- [x] Operação de transferência entre contas
- [x] Impressão de extrato bancário
- [x] Listagem de clientes do banco

## 📝 Melhorias Futuras
- [ ] Adicionar persistência de dados (banco de dados ou arquivos)
- [ ] Implementar novas operações bancárias (pagamento de contas, investimentos)
- [ ] Adicionar sistema de autenticação por senha
- [ ] Implementar histórico de transações com data e hora
- [ ] Criar interface gráfica com JavaFX ou Swing
- [ ] Adicionar novos tipos de contas (salário, investimento)
- [ ] Implementar sistema de cobrança de taxas e juros
- [ ] Adicionar testes unitários
- [ ] Melhorar o tratamento de exceções
- [ ] Documentar o código com Javadoc

## 👨‍💻 Autor
[Henrique Camargo] - [https://github.com/HenriqueCamarg0]

