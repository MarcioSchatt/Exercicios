"""
Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                      Até 5 Kg           Acima de 5 Kg
Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
"""

morango = float(input("Digite a quantidade (em Kg) de morangos adquiridos: "))
maca = float(input("Digite a quantidade (em Kg) de maçãs adquiridas: "))
preco_morango = 2.50 if morango <= 5 else 2.20
preco_maca = 1.80 if maca <= 5 else 1.50

valor = (morango * preco_morango) + (maca * preco_maca)

if morango + maca > 8 or valor > 25.00:
    valor *= 0.9

print(f"Valor a ser pago pelo cliente: R${valor:.2f}.")
