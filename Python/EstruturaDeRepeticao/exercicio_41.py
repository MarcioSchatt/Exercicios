"""
Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados: valor da dívida, valor dos juros, quantidade de parcelas e valor da parcela.
Os juros e a quantidade de parcelas seguem a tabela abaixo:

Quantidade de Parcelas  % de Juros sobre o valor inicial da dívida
1       0
3       10
6       15
9       20
12      25

Exemplo de saída do programa:

Valor da Dívida Valor dos Juros Quantidade de Parcelas  Valor da Parcela
R$ 1.000,00     0               1                       R$  1.000,00
R$ 1.100,00     100             3                       R$    366,00
R$ 1.150,00     150             6                       R$    191,67
"""
def calcular_valor_parcela(valor_divida, juros, parcelas):
    valor_juros = valor_divida * juros / 100
    valor_total = valor_divida + valor_juros
    valor_parcela = valor_total / parcelas
    return valor_juros, valor_parcela

valor_divida = float(input("Digite o valor da dívida: R$ "))

print("Valor da Dívida | Valor dos Juros | Quantidade de Parcelas | Valor da Parcela")
print("--------------------------------------------------------------------------")

juros_parcelas = [(0, 1), (10, 3), (15, 6), (20, 9), (25, 12)]

for juros, parcelas in juros_parcelas:
    valor_juros, valor_parcela = calcular_valor_parcela(valor_divida, juros, parcelas)
    print(f"R${valor_divida:.2f} | R${valor_juros:.2f} | {parcelas} | R${valor_parcela:.2f}")
