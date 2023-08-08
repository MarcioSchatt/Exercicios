"""
Faça um programa que mostre os n termos da Série a seguir:

  S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 

Imprima no final a soma da série.
"""

preco_pao = float(input("Digite o preço do pão: R$ "))

print("Panificadora Pão de Ontem - Tabela de preços")

for i in range(1, 51):
    preco_total = i * preco_pao
    print(f"{i:2} - R$ {preco_total:.2f}")
