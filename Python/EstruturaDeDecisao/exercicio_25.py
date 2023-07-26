"""
Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
As perguntas são:

1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"

O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
Caso contrário, ele será classificado como "Inocente".
"""

perguntas = [
    "Telefonou para a vítima?",
    "Esteve no local do crime?",
    "Mora perto da vítima?",
    "Devia para a vítima?",
    "Já trabalhou com a vítima?"]

print("Responda 'sim' ou 'não' para as perguntas abaixo:")

contador = 0
for pergunta in perguntas:
    resposta = input(pergunta + " (sim ou não): ").lower()
    while resposta not in ['sim', 'não']:
        print("Resposta inválida. Responda apenas com 'sim' ou 'não'.")
        resposta = input(pergunta + " (sim ou não): ").lower()
    if resposta == 'sim':
        contador += 1

if contador == 2:
    print("Classificação: Suspeita")
elif 3 <= contador <= 4:
    print("Classificação: Cúmplice")
elif contador == 5:
    print("Classificação: Assassino")
else:
    print("Classificação: Inocente")
