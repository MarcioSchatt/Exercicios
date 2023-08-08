"""
Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
Exemplo:

  12376489
  => 98467321
"""

preco_pao = float(input("Digite o preço do pão: R$ "))

print("Panificadora Pão de Ontem - Tabela de preços")

for i in range(1, 51):
    preco_total = i * preco_pao
    print(f"{i:2} - R$ {preco_total:.2f}")
