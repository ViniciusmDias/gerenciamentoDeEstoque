# gerenciamentoDeEstoque

Neste trabalho eu criarei uma aplicação desktop de gerenciamento de estoque. Essa aplicação deverá permitir o cadastro e a listagem de funcionários, clientes e mercadorias, bem como visualizar os dados cadastrados e a listagem de estoque com seu valor de compra e de venda. A aplicação será programada na linguagem Java(fim acadêmico/professor obrigou kkkkk), e sua interface gráfica deve ser construída utilizando os componentes gráficos da API Swing.

Requisitos da Aplicação

A aplicação a ser desenvolvida deve permitir a execução das seguintes ações através de sua interface gráfica:

Autenticar um funcionário por meio de usuário e senha;
Cadastrar um novo produto;
Cadastrar um novo funcionário (Opção disponível apenas para um perfil de administrador);
O cadastro deve coletar informações como nome, CPF, RG, data de nascimento, telefone e endereço. O cadastro de um funcionário também deve indicar seu cargo (ex. administrador, atendente), salário, usuário e senha (para que também consiga acessar o sistema);
Listar os clientes cadastrados;
Listar os funcionários cadastrados (Opção disponível apenas para um perfil de administrador);
Listar o estoque disponível;
Exceções devem ser tratadas (ex.: falha na autenticação deve ser informada, entre outras);
A aplicação deve ser user-friendly.

O código da aplicação deve ser organizado de acordo com o padrão MVC (Model-View-Controller), no qual o Modelo é composto pelas entidades manipuladas pela aplicação, a Visão corresponde à interface gráfica e o Controlador implementa a lógica da aplicação.

Implemente componentes que sejam responsáveis por executar as ações descritas acima. Sua aplicação deve conter os seguintes componentes: um componente de autenticação de usuários; um gerenciador de cadastros; um gerenciador de persistência de dados; e outros componentes que você considerar adequados. Estes componentes serão invocados pelo controlador da aplicação sempre que necessário.

A persistência dos dados da aplicação pode ser feita em memória, arquivo ou banco de dados. Os componentes desenvolvidos devem estar em pacotes ou projetos separados do código da interface gráfica da aplicação.

Um usuário administrador padrão deve ser criado para que possa ser feito o primeiro acesso ao sistema (Sugestão: usuário: admin, senha: admin).
