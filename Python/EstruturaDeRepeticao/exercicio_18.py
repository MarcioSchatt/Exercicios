"""
Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.
"""

conjunto = int(input("Digite a quantidade de números no conjunto: "))

numeros = []
for i in range(1, conjunto+1):
    numero = int(input(f"Digite o {i}º número: "))
    numeros.append(numero)

maior = max(numeros)
menor = min(numeros)
soma = sum(numeros)

print(f"Menor valor: {menor}")
print(f"Maior valor: {maior}")
print(f"Soma dos valores: {soma}")
