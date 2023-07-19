"""
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.

Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.

João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso.

Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.

Imprima os dados do programa com as mensagens adequadas.
"""

peso_peixes = float(input("Digite o peso de peixes (em quilos): "))

limite_peso = 50.0
if peso_peixes > limite_peso:
    excesso = peso_peixes - limite_peso
    multa_por_quilo_excedente = 4.0
    multa = excesso * multa_por_quilo_excedente
else:
    excesso = 0.0
    multa = 0.0

print(f"Peso de peixes: {peso_peixes:.2f} kg")
if excesso > 0:
    print(f"Excesso de peso: {excesso:.2f} kg")
    print(f"Valor da multa a pagar: R$ {multa:.2f}")
else:
    print("Não houve excesso de peso. Nenhuma multa será aplicada.")
