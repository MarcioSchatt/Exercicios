"""
Faça um programa que leia uma quantidade indeterminada de números positivos e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100].
A entrada de dados deverá terminar quando for lido um número negativo.
"""

preco_pao = float(input("Digite o preço do pão: R$ "))

print("Panificadora Pão de Ontem - Tabela de preços")

for i in range(1, 51):
    preco_total = i * preco_pao
    print(f"{i:2} - R$ {preco_total:.2f}")
