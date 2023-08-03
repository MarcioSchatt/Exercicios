"""
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.
"""

qtd_pares = 0
qtd_impares = 0

for i in range(1, 11):
    numero = int(input(f"Digite o {i}º número: "))
    if numero % 2 == 0:
        qtd_pares += 1
    else:
        qtd_impares += 1

print(f"Quantidade de números pares: {qtd_pares}")
print(f"Quantidade de números ímpares: {qtd_impares}")
