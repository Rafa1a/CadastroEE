# CadastroEE - Sistema de Cadastro Java EE com Bootstrap
 
Este projeto é um sistema de cadastro desenvolvido em Java EE, utilizando o framework Bootstrap para melhorar o design da interface. Ele permite o cadastro e gerenciamento de produtos, seguindo as práticas recomendadas de desenvolvimento Java Enterprise Edition.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `CadastroEE`: projeto Java EE principal, que encapsula os outros dois projetos.
- `CadastroEE-ejb`: projeto EJB (Enterprise JavaBeans) responsável pela camada de persistência e controle.
- `CadastroEE-war`: projeto da interface web, que utiliza Servlets e JSPs para interagir com os EJBs.

## Procedimentos

### Procedimento 1: Configuração Inicial

1. Configurar a conexão com SQL Server via NetBeans e o pool de conexões no GlassFish Server 6.2.1. [Clique PDF](/mundo%203%20nv%204%20pro1.pdf)

### Procedimento 2: Interface Cadastral com Servlet e JSPs

2. Criar um Servlet com o nome ServletProdutoFC no projeto CadastroEE-war e melhorar o design da interface. [Clique PDF](/mundo%203%20nv%204%20pro2.pdf)

### Procedimento 3: Melhorando o Design da Interface

3. Incluir as bibliotecas do framework Bootstrap nos arquivos ProdutoLista.jsp e ProdutoDados.jsp para aprimorar o design. [Clique PDF](/mundo%203%20nv%204%20pro3.pdf)

## Utilização do Projeto

Para utilizar o projeto, siga estas etapas:

1. Clone o repositório para a sua máquina local.

2. Importe os projetos `CadastroEE`, `CadastroEE-ejb` e `CadastroEE-war` em um ambiente de desenvolvimento Java EE, como o NetBeans.

3. Configure um servidor GlassFish (ou equivalente) no ambiente do NetBeans.

4. Execute o projeto principal `CadastroEE` no servidor GlassFish.

5. Acesse o sistema pelo endereço `http://localhost:8080/CadastroEE-war`.

## Dependências

- [Java EE](https://javaee.github.io/javaee-spec/): Plataforma Java Enterprise Edition.
- [Bootstrap](https://getbootstrap.com/): Framework de design e responsividade para páginas web.

## Considerações Finais

Este projeto demonstra a integração do framework Bootstrap em uma aplicação Java EE para melhorar o design da interface do usuário. Sinta-se à vontade para explorar o código e adaptá-lo às suas necessidades ou expandir suas funcionalidades.

## Autor

Rafael Leal Altero

