## Email MicroService (Clean Architecture) - SOLID - AWS SES - AWS IAM

Microserviço para realizar o envio de e‑mails de forma independente, seguindo princípios (Clean Architecture).


``` Funcionalidades ```
  
◦ Permite receber requisições HTTP para envio de e‑mail.

◦ Componentização clara: controllers para interface, serviços para lógica, modelos/DTOs para dados.

◦ Configuração externa (via application.properties), possibilitando configuração de SMTP ou provedores de e‑mail sem alterar código.

◦ Microserviço independente (pode ser integrado a diversos front-ends ou outros serviços).

``` Cenários```

◦ Envio de e‑mail de confirmação para novos usuários.

◦ Reset de senha via e‑mail.

◦ Notificações automáticas (ex: pedido concluído, alertas, relatório, etc.).

◦ Logs ou alertas para administradores.
