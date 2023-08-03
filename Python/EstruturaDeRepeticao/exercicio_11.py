"""
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

Altere o programa anterior para mostrar no final a soma dos números.
"""

numero1 = int(input(f"Digite o 1º número: "))
numero2 = int(input(f"Digite o 2º número: "))
soma = 0

print(f"Os números inteiros entre {numero1} e {numero2} são:", end=" ")

if numero1 > numero2:
    for i in range(numero1-1, numero2, -1):
        print(i, end=" ")
        soma += i
else:
    for i in range(numero1, numero2):
        print(i, end=" ")
        soma += i

print(f"\nA soma dos números é: {soma}")
