"""
Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
No final da série de saltos de cada atleta, o melhor e o pior resultados são eliminados.
O seu resultado fica sendo a média dos três valores restantes.
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a média).
Faça uso de uma lista para armazenar os saltos.
Os saltos são informados na ordem da execução, portanto não são ordenados.
O programa deve ser encerrado quando não for informado o nome do atleta.
A saída do programa deve ser conforme o exemplo abaixo:

Atleta: Rodrigo Curvêllo

Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m

Melhor salto:  6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m

Resultado final:
Rodrigo Curvêllo: 5.9 m
"""
def calcular_media_saltos(saltos):
    melhor_salto = max(saltos)
    pior_salto = min(saltos)
    saltos.remove(melhor_salto)
    saltos.remove(pior_salto)
    return sum(saltos) / len(saltos)

while True:
    nome_atleta = input("Nome do Atleta: ")
    if nome_atleta == "":
        break

    saltos_atleta = []
    for i in range(1, 6):
        distancia = float(input(f"{i}º Salto (m): "))
        saltos_atleta.append(distancia)

    media_saltos = calcular_media_saltos(saltos_atleta)

    print(f"\nAtleta: {nome_atleta}")
    for i, salto in enumerate(saltos_atleta, start=1):
        print(f"{i}º Salto: {salto} m")

    print(f"\nMelhor salto: {max(saltos_atleta)} m")
    print(f"Pior salto: {min(saltos_atleta)} m")
    print(f"Média dos demais saltos: {media_saltos:.1f} m")

    print(f"\nResultado final:")
    print(f"{nome_atleta}: {media_saltos:.1f} m\n")
