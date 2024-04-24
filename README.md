# Java 21 - Record Patterns: Exemplos Práticos

Projeto baseado no tutorial:

* [Record Patterns – Java 21](https://www.mballem.com/post/record-patterns-java-21/)

A versão 21 do Java foi aprimorada com padrões de registro (_Record Patterns_) para desconstruir valores de um objeto **record**. Padrões de registro chegou a linguagem para permitir uma forma poderosa, declarativa e combinável de navegação e processamento de dados.
```java
public static void main(String[] args) {  
  Vehicle vehicle = new Vehicle("Honda", "Fit 1.4", "JAV-1621");  
  
  if(vehicle instanceof Vehicle(String brand, String model, String licensePlate)) {  
        System.out.println(brand + " - " + model + ": " + licensePlate);  
  }  
  
  if(vehicle instanceof Vehicle(var marca, var modelo, var placa)) {  
        System.out.println(marca + " - " + modelo + ": " + placa);  
  }  
}
```

### 🛑 Pré-requistos

-   Java 21+

### 🤝 Contribuindo

[](https://github.com/mballem/sequenced-collections#-contribuindo)

Desenvolvido e publicado pelo blog  **[MBallem - Programando com Java](https://www.mballem.com/)**

Este repositório foi criado para fins de estudo.

Se te ajudei de alguma forma ⭐️ Star o projeto.