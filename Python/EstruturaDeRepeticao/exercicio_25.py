"""
Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
"""

n = int(input("Digite o número de pessoas na turma: "))

idades = []
for i in range(n):
    idade = int(input(f"Digite a idade da {i+1}ª pessoa: "))
    idades.append(idade)

media_idades = sum(idades) / n

if 0 <= media_idades <= 25:
    print("A turma é jovem.")
elif 26 <= media_idades <= 60:
    print("A turma é adulta.")
else:
    print("A turma é idosa.")
