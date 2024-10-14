# Projeto Java FX - Cadastro de Clientes com Busca de CEP e Tratamento de Exceções

## Descrição do Projeto

Este projeto é uma aplicação Java desenvolvida utilizando **JavaFX** e **Scene Builder** para criar uma interface gráfica intuitiva, permitindo o cadastro de clientes com seus respectivos endereços e números de telefone. Além disso, o sistema busca automaticamente os dados do endereço através do **Web Service ViaCEP**, utilizando o CEP informado.

O foco principal deste projeto é o **tratamento de exceções** e o uso do **JavaFX** para construir a interface, aplicando boas práticas de programação para garantir uma experiência de usuário fluida e eficiente. A aplicação lida com situações como:

- Validação do formato de CEP.
- Tratamento de erros de conexão com o serviço de busca de CEP.
- Exibição de mensagens de erro claras para o usuário.

## Funcionalidades

1. **Cadastro de Clientes**:
   - Preenchimento de dados como nome, telefone, CEP, rua, número, cidade e estado.
   - Armazenamento dos clientes cadastrados em uma lista.

2. **Busca Automática de Endereço**:
   - Ao informar o CEP, o sistema busca automaticamente os dados do endereço (rua, cidade, estado) através do Web Service **ViaCEP**.
   
3. **Validação de Dados**:
   - O sistema valida se o CEP informado está no formato correto (99999-999) e trata possíveis erros, como CEP inválido ou erro de conexão.

4. **Interface Gráfica com JavaFX**:
   - Utilização do **Scene Builder** para criar uma interface gráfica amigável para o usuário, com campos de texto e botões que facilitam a interação.

5. **Tratamento de Exceções**:
   - **IllegalArgumentException**: Para CEPs com formato inválido.
   - **IOException**: Para erros de comunicação com o Web Service ViaCEP.
   - Exceções genéricas para tratar erros desconhecidos.

## Estudo de Exceções

O projeto aborda o **tratamento de exceções** como um ponto central. As exceções são usadas para capturar e manipular erros que podem ocorrer durante a execução do programa. A seguir estão os principais casos de uso de exceções no projeto:

1. **Formato de CEP Inválido**: Quando o usuário digita um CEP em um formato incorreto, o sistema lança uma `IllegalArgumentException`, informando o usuário sobre o formato esperado.

2. **Erro na Comunicação com o Web Service**: Se houver problemas ao tentar se conectar ao serviço ViaCEP, como falta de internet ou endereço inválido, o programa lança uma `IOException`, exibindo uma mensagem de erro ao usuário.

3. **Tratamento de Exceções Genéricas**: Caso um erro inesperado ocorra, o sistema captura a exceção e exibe uma mensagem de erro genérica, garantindo que o aplicativo continue rodando sem quebrar a experiência do usuário.

## Como Rodar o Projeto

### Pré-requisitos
- **Java JDK 11** ou superior.
- **JavaFX SDK**.
- **Scene Builder** (opcional, para edição da interface).
- **Bibliotecas Externas**:
  - **Gson**: Para manipulação de JSON.
  - **Apache HttpClient**: Para realizar requisições HTTP ao ViaCEP.

### Instruções de Execução

1. Clone o repositório ou faça o download dos arquivos do projeto.
2. Configure o seu ambiente para rodar o JavaFX. Certifique-se de que o `path` do JavaFX esteja corretamente configurado no seu projeto.
3. Execute o arquivo `TelaController.java` para iniciar a interface gráfica.
4. Utilize o campo de CEP para buscar endereços automaticamente e cadastre clientes inserindo os dados nos campos correspondentes.

### Estrutura de Pastas

- **src/com**: Contém os arquivos principais do código Java.
- **resources**: Contém os arquivos de interface criados pelo Scene Builder.

## Tecnologias Utilizadas

- **Java 11+**: Linguagem principal do projeto.
- **JavaFX**: Framework para desenvolvimento da interface gráfica.
- **Scene Builder**: Ferramenta para criação da interface de forma visual.
- **Gson**: Biblioteca para conversão de objetos Java para JSON e vice-versa.
- **Apache HttpClient**: Biblioteca para realizar requisições HTTP.

## Print Clientes após executar o botão "Gravar"
![image](https://github.com/user-attachments/assets/3af01516-1197-4c5b-af22-640fcf17d5b8)

## Conclusão

Este projeto apresenta uma solução completa de cadastro de clientes com validação de dados e integração com um serviço externo de busca de endereços. A implementação do tratamento de exceções garante uma experiência de usuário mais robusta, permitindo capturar e tratar erros de maneira eficiente. A interface gráfica desenvolvida com JavaFX e Scene Builder torna o sistema amigável e fácil de usar.
