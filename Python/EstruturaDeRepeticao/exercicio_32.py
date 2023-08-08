"""
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120.

A saída deve ser conforme o exemplo abaixo:
Fatorial de: 5
5! =  5 . 4 . 3 . 2 . 1 = 120
"""
def calcular_fatorial(numero):
    fatorial = 1
    for i in range(1, numero + 1):
        fatorial *= i
    return fatorial

numero = int(input("Digite um número inteiro para calcular o fatorial: "))

fatorial = calcular_fatorial(numero)

print(f"Fatorial de: {numero}")
print(f"{numero}! =", end=" ")
for i in range(numero, 0, -1):
    print(i, end="")
    if i != 1:
        print(" . ", end="")
    else:
        print(" =", end=" ")
print(fatorial)
