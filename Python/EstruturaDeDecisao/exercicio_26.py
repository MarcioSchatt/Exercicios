"""
Um posto está vendendo combustíveis com a seguinte tabela de descontos:

1. Álcool: até 20 litros, desconto de 3% por litro - acima de 20 litros, desconto de 5% por litro

2. Gasolina: até 20 litros, desconto de 4% por litro - acima de 20 litros, desconto de 6% por litro

Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina).
Calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.
"""

litros = float(input("Digite o número de litros vendidos: "))
combustivel = input("Digite o tipo de combustível (A-álcool, G-gasolina): ").upper()
preco_alcool = 1.90
preco_gasolina = 2.50

if combustivel == 'A':
    if litros <= 20:
        desconto = 0.03
    else:
        desconto = 0.05
    valor = litros * preco_alcool * (1 - desconto)
elif combustivel == 'G':
    if litros <= 20:
        desconto = 0.04
    else:
        desconto = 0.06
    valor = litros * preco_gasolina * (1 - desconto)
else:
    print("Tipo de combustível inválido.")
    exit()

print(f"Valor a ser pago pelo cliente: R${valor:.2f}.")
