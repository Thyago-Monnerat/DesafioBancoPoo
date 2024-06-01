# Banco Java utilizando POO 

## Se trata de um sistema de banco fictício para consolidação do paradigma de programação orientada a objetos.

A classe Cliente é onde funciona a criação de conta, transferência, saque e depósito.

O método de transferência é controlado pela classe Banco, e somente contas correntes podem efetuar transferências.

A classe Conta é generalizada, e possui duas especializações:

**Corrente:** possui um atributo de cheque especial, porém, não tem utilidade no projeto
**Poupança:** possui um atributo de rendimento de 3%, o qual é aplicado para simular o rendimento de acordo com o saldo atual

As contas possuem a localização 'BR', 'EUA' e 'EUR'. Ao trocar, o saldo será multiplicado de acordo com o preço da moeda.
> Obs: Os valores de cada moeda é de forma fixa, sendo 5 para EUA e 6 para EUR.
