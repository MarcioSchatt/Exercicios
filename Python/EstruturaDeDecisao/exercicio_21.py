"""
Faça um Programa para um caixa eletrônico.
O programa deverá perguntar ao usuário a valor do saque e depois informar quantas notas de cada valor serão fornecidas.
As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais.
O programa não deve se preocupar com a quantidade de notas existentes na máquina.

- Ex 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
- Ex 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
"""

saque = int(input("Digite o valor que deseja sacar (entre 10 e 600 reais): "))
notas_disponiveis = [100, 50, 10, 5, 1]
quantidade_notas = [0, 0, 0, 0, 0]

if saque < 10 or saque > 600:
    print("Valor inválido. Digite um valor entre 10 e 600 reais.")
    exit()

saque_temp = saque
while saque_temp > 0:
    for i in range(len(notas_disponiveis)):
        if saque_temp >= notas_disponiveis[i]:
            quantidade_notas[i] += saque_temp // notas_disponiveis[i]
            saque_temp %= notas_disponiveis[i]

resultado = quantidade_notas

print(f"Para sacar a quantia de R${saque:.2f}, serão fornecidas as seguintes notas:")
for i in range(len(resultado)):
    if resultado[i] > 1:
        string_nota = 'notas'
    else:
        string_nota = 'nota'
    if resultado[i] > 0:
        print(f"{resultado[i]} {string_nota} de R${notas_disponiveis[i]:.2f}.")