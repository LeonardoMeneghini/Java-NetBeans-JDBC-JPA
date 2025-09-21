# Java-NetBeans-JDBC-JPA
Simulação de banco de dados em Java sem a utilização de frameworks.
# 1. Objetivos
- Projeto simples em Java utilizando NetBeans, JDBC e JPA;
-  O projeto será uma aplicação de console que utiliza JPA para persistência e JDBC para conexão com o banco de dados;
-  O banco de dados embutido H2 será utilizado para simplificar.
# 2. Etapas
1. Criação do projeto no NetBeans (CONFIGURAÇÃO)
   - Configuração do projeto: _Java Application_; _Categories_ : Java with Ant; _Projects_: Java Application;
   - Nome do proejto: _JPAJDBCExample_
     
2. Adição de dependências para JPA e H2 (CONFIGURAÇÃO)
   - Baixar as bilbiotecas Eclipse Link e Hibernate (H2):
     - **EclipseLink**: https://repo1.maven.org/maven2/org/eclipse/persistence/eclipselink/2.7.7/eclipselink-2.7.7.jar
     - **H2**: https://repo1.maven.org/maven2/com/h2database/h2/1.4.200/h2-1.4.200.jar
- Adicionar as bibliotecas JPA e o driver JDBC do H2: "Libraries" -> "Compile" tab -> "Add JAR/Folder".
- 
3. Configuração de persistência (CONFIGURAÇÃO)

  3.1. Acessar o Assistente de Persistência
    - Clique com o botão direito no nome do seu projeto no NetBeans
    Selecione New > Other...

    Na janela que se abre, navegue até a categoria Persistence

    Selecione Persistence Unit e clique em Next

    Clique com o botão direito no projeto -> Properties.

    Selecione "Libraries" -> "Compile" tab -> "Add JAR/Folder".

    Você precisará baixar o JAR do H2 e o JAR do JPA (por exemplo, EclipseLink ou Hibernate). No entanto, o NetBeans geralmente vem com o EclipseLink.
