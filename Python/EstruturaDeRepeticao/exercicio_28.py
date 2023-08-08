"""
Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles.
O usuário deverá informar a quantidade de CDs e o valor para em cada um.
"""

quantidade_cds = int(input("Digite a quantidade de CDs na coleção: "))

valor_total_investido = 0
for i in range(1, quantidade_cds + 1):
    valor_cd = float(input(f"Digite o valor do CD {i}: "))
    valor_total_investido += valor_cd

valor_medio_cd = valor_total_investido / quantidade_cds

print(f"Valor total investido na coleção: R${valor_total_investido:.2f}")
print(f"Valor médio gasto em cada CD: R${valor_medio_cd:.2f}")
