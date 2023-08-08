"""
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código.
Os códigos utilizados são:

1 , 2, 3, 4  - Votos para os respectivos candidatos 
(você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
5 - Voto Nulo
6 - Voto em Branco

Faça um programa que calcule e mostre:

- O total de votos para cada candidato;
- O total de votos nulos;
- O total de votos em branco;
- A percentagem de votos nulos sobre o total de votos;
- A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
"""

candidatos = {
    1: "Jose",
    2: "João",
    3: "Maria",
    4: "Ana"
}

votos_candidatos = {candidato: 0 for candidato in candidatos.values()}
votos_nulos = 0
votos_brancos = 0
total_votos = 0

while True:
    print("1 - Jose")
    print("2 - João")
    print("3 - Maria")
    print("4 - Ana")
    print("5 - Nulo")
    print("6 - Branco")
    voto = int(input("Digite o código do seu voto (0 para encerrar): "))

    if voto == 0:
        break

    if voto in candidatos:
        votos_candidatos[candidatos[voto]] += 1
    elif voto == 5:
        votos_nulos += 1
    elif voto == 6:
        votos_brancos += 1
    else:
        print("Código inválido. Por favor, escolha um código válido.")

    total_votos += 1

print("Resultado da Eleição:")
for candidato, nome in candidatos.items():
    print(f"{nome}: {votos_candidatos[nome]} votos")

print(f"Votos Nulos: {votos_nulos}")
print(f"Votos em Branco: {votos_brancos}")
print(f"Percentagem de Votos Nulos: {(votos_nulos / total_votos) * 100:.2f}%")
print(f"Percentagem de Votos em Branco: {(votos_brancos / total_votos) * 100:.2f}%")
