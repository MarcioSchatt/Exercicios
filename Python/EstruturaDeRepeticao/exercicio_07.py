"""
Faça um programa que leia 5 números e informe o maior número.
"""

for i in range(1, 6):
    numero = int(input(f"Digite o {i}º número: "))
    if i == 1:
        maior = numero
    else:
        if numero > maior:
            maior = numero

print(f'O maior número foi {maior}.')
