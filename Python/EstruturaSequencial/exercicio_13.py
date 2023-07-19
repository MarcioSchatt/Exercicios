"""
Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
utilizando as seguintes fórmulas:

a) Para homens: (72.7*h) - 58
b) Para mulheres: (62.1*h) - 44.7
"""

altura = float(input("Digite a altura da pessoa (em metros): "))
genero = input("Digite o gênero da pessoa (homem/mulher): ")

if genero.lower() == "homem":
    peso_ideal = (72.7 * altura) - 58
elif genero.lower() == "mulher":
    peso_ideal = (62.1 * altura) - 44.7
else:
    print("Gênero inválido. Por favor, insira 'homem' ou 'mulher'.")

print(f"O peso ideal para uma pessoa de {altura:.2f} metros do gênero {genero} é de {peso_ideal:.2f} kg.")
