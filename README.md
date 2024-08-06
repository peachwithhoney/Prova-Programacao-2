# Prova-Programacao-2

## Projeto: Controle de Acesso ao Parque de Diversões

#Descrição
Este projeto foi a 1VA (primeira prova do semestre) de programação 2 em Java, cujo objetivo é criar um sistema de controle de acesso para um parque de diversões. 
O sistema permite o cadastro de visitantes (crianças e adultos) e o gerenciamento de pacotes de uso do parque. 
Os visitantes podem usar diversos brinquedos de acordo com as regras de idade e o tipo de pacote adquirido (por tempo ou por número de usos).
A programação que eu fiz poderia ser melhorada, irei colocar o código que fiz durante a prova e posteriomente irei melhorar o código e também colocarei aqui.

#Funcionalidades

Cadastro de Visitantes: Possibilidade de cadastrar crianças e adultos, associando crianças a um responsável adulto.
Gerenciamento de Brinquedos: Cadastro de brinquedos com restrições de idade mínima e máxima.
Pacotes de Uso: Implementação de pacotes por tempo de permanência e por número de usos de brinquedos.
Verificação de Permissão: Verificação se o visitante tem permissão para usar determinado brinquedo com base na idade.

#Classes Principais
Visitante: Classe base para visitantes, contendo nome, idade, cartão e CPF.
Adulto: Subclasse de Visitante para adultos.
Crianca: Subclasse de Visitante para crianças, associando um adulto responsável.
Brinquedo: Classe para brinquedos, contendo nome e restrições de idade.
Pacote: Classe abstrata para pacotes de uso, com subclasses PacoteTempo e PacoteBrinquedo.

# Como Executar
1. Clone este repositório para sua máquina local.
2. Compile as classes Java usando um compilador de sua escolha.
3. Execute a classe Main para ver os exemplos em funcionamento.
