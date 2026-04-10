# 🚀 Teste Prático - Programação Java

Este projeto foi desenvolvido como parte de um teste técnico, com o objetivo de demonstrar conhecimentos em **Java**, **Programação Orientada a Objetos (POO)** e **manipulação de coleções**.

---

## 📌 Objetivo

Implementar um sistema simples de gerenciamento de funcionários, contendo:

* Cadastro de funcionários
* Manipulação de dados (remoção, atualização)
* Agrupamento por função
* Ordenação
* Cálculos e filtros

---

## 🧠 Conceitos aplicados

* Orientação a Objetos (Herança e Encapsulamento)
* Collections (`List`, `Map`)
* Streams API
* `BigDecimal` para cálculos financeiros
* `LocalDate` para manipulação de datas
* Separação de responsabilidades (camadas: model, service, util)

---

## 📁 Estrutura do Projeto

```
src/
 └── br/com/empresa
      ├── model
      │     ├── Pessoa.java
      │     └── Funcionario.java
      ├── service
      │     └── FuncionarioService.java
      ├── util
      │     └── Formatador.java
      └── Main.java
```

---

## ⚙️ Funcionalidades implementadas

✔️ Inserção de funcionários
✔️ Remoção do funcionário "João"
✔️ Listagem com formatação de data e valores
✔️ Aplicação de aumento salarial de 10%
✔️ Agrupamento por função
✔️ Listagem de aniversariantes (Outubro e Dezembro)
✔️ Identificação do funcionário mais velho
✔️ Ordenação alfabética
✔️ Cálculo do total de salários
✔️ Cálculo de salários mínimos por funcionário

---

## 🧾 Formatação

* Datas no formato: `dd/MM/yyyy`
* Valores monetários com:

  * Separador de milhar `.`
  * Separador decimal `,`

---

## ▶️ Como executar

1. Clone o repositório:

```
git clone <URL_DO_REPOSITORIO>
```

2. Abra o projeto em sua IDE (Eclipse, IntelliJ, etc.)

3. Execute a classe:

```
Main.java
```

---

## 💡 Decisões de implementação

* Separação em camadas (`model`, `service`, `util`) para melhor organização e manutenção
* Uso de métodos reutilizáveis para evitar repetição de código
* Aplicação de boas práticas de nomenclatura
* Uso de `toString()` para melhorar a saída no console

---

## 📊 Resultado

O sistema exibe no console todas as operações solicitadas de forma organizada e legível, facilitando a análise dos dados.

---

---

## 📬 Observação

Este projeto foi desenvolvido com foco em clareza, organização e boas práticas, visando demonstrar capacidade técnica e qualidade de código.

---
