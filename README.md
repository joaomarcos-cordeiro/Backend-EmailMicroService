## Email MicroService (Clean Architecture) - SOLID - AWS SES - AWS IAM

Microserviço criado para realizar o envio de e‑mails de forma independente, seguindo princípios (Clean Architecture) e boas práticas de estruturação. O serviço pode ser usado por aplicações front‑end ou outros microserviços para disparar e-mails por exemplo, confirmações, notificações ou reset de senha.


- Funcionalidades
  
Permite receber requisições HTTP para envio de e‑mail.

Componentização clara: controllers para interface, serviços para lógica, modelos/DTOs para dados (seguindo boas práticas de arquitetura).

Configuração externa (via application.properties), possibilitando configuração de SMTP ou provedores de e‑mail sem alterar código.

Microserviço independente — pode ser integrado a diversos front-ends ou outros serviços da sua aplicação.

- Cenários

Envio de e‑mail de confirmação para novos usuários.

Reset de senha via e‑mail.

Notificações automáticas (ex: pedido concluído, alertas, relatório, etc.).

Logs ou alertas para administradores.
