"""
Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura em centímetros.
Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
"""

preco_pao = float(input("Digite o preço do pão: R$ "))

print("Panificadora Pão de Ontem - Tabela de preços")

for i in range(1, 51):
    preco_total = i * preco_pao
    print(f"{i:2} - R$ {preco_total:.2f}")
