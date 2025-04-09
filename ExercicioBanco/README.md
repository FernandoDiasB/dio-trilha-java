## Proposta do exercicio

Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:

Consultar saldo OK
consultar cheque especial X 
Depositar dinheiro; OK
Sacar dinheiro; X 
Pagar um boleto. X 

Siga as seguintes regras para implementar

O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação; OK

Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado; OK 

Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial. X 