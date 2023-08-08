"""
Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo:

Montar a tabuada de: 5
Começar por: 4
Terminar em: 7

Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.
"""

numero_tabuada = int(input("Montar a tabuada de: "))
inicio_tabuada = int(input("Começar por: "))
fim_tabuada = int(input("Terminar em: "))

while fim_tabuada < inicio_tabuada:
    print("O valor final deve ser maior ou igual ao valor inicial.")
    fim_tabuada = int(input("Terminar em: "))

print(f"Vou montar a tabuada de {numero_tabuada} começando em {inicio_tabuada} e terminando em {fim_tabuada}:")

for i in range(inicio_tabuada, fim_tabuada + 1):
    resultado = numero_tabuada * i
    print(f"{numero_tabuada} X {i} = {resultado}")
