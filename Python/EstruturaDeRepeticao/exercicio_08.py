"""
Faça um programa que leia 5 números e informe a soma e a média dos números.
"""

for i in range(1, 6):
    numero = int(input(f"Digite o {i}º número: "))
    if i == 1:
        soma = numero
    else:
        soma += numero

media = soma / 5

print(f"A soma é: {soma}")
print(f"A média é: {media}")
