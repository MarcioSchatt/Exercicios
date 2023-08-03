"""
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
"""

numero = int(input(f"Digite o número para ver a tabuada (entre 1 e 10): "))
if numero > 10 or numero < 1:
    while numero > 10 or numero < 1:
        print("Por favor, digite um número entre 1 e 10.")
        numero = int(input(f"Digite o número para ver a tabuada (entre 1 e 10): "))

print(f"Tabuada do {numero}:")
for i in range(1, 11):
    resultado = numero * i
    print(f"{numero} x {i} = {resultado}")
