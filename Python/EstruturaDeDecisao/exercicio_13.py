"""
Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
"""

dias = {
    1: "Domingo",
    2: "Segunda",
    3: "Terça",
    4: "Quarta",
    5: "Quinta",
    6: "Sexta",
    7: "Sábado"}

try:
    dia = int(input('Digite um número correspondente da semana: '))
    if dia >= 1 and dia <= 7:
        print(f"Dia da semana correspondente: {dias[dia]}")
    else:
        print('Digite um número entre 1 e 7.')
except ValueError:
    print('Digite um número válido.')
