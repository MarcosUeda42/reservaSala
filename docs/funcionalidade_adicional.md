Funcionalidade adicional

Adicionado um novo tipo de sala.
Sala de tipo Especial, no qual somente professores podem reservar.
Caso um Aluno tente reservar, receberá um aviso que a reserva foi negada.

==== exemplo de funcionalidade adicional ===

1.⁠ ⁠Protection Proxy Objetivo do padrão: Tem como objetivo controlar o acesso a um objeto real por meio de um objeto intermediário(Proxy). No caso do protection, o objetivo é garantir o uso do objeto somente se atender as especificações do objeto intermediário (Proxy), garantindo uma camada a mais de segurança e impedindo acessos indevidos do objeto real.

•⁠  ⁠Aplicação no projeto: Criação de reservas de salas especiais, com a condição de que a reserva possa somente ser feita por um professor. O padrão Protection Proxy funcionará para controlar o acesso a criação de reservas das salas especiais, verificando se o usuário é um professor ou aluno. Caso o usuário seja não seja um professor, o Proxy impedirá a criação da reserva.

Exemplo funcional do código:

Escolher a opção 1 para criar o aluno no terminal.

Digitar Nome e Papel. ex.: João // Aluno

Escolher a opção 2 para criar a sala especial.

Digitar número da sala. ex.: 101
Escolher o tipo da sala como “Especial”.
Digitar capacidade da sala. ex.: 10

Escolher a opção 3 para tentar agendar.

Nome de quem quer agendar: João
Sala a ser agendada: 101
Data de ínicio. ex.: 2026-05-12 10:00
Data de fim. ex.: 2026-05-12 12:00
Sem serviço extra, digitar 3

Mensagem: “Acesso Negado, sem autorização” aparecerá.
