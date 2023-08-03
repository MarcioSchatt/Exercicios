"""
Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
"""

base = float(input("Digite a base: "))
expoente = int(input("Digite o expoente: "))
resultado = 1

for i in range(expoente):
    resultado *= base

print(f"{base} elevado na potência de {expoente} é igual a {resultado:.1f}.")
