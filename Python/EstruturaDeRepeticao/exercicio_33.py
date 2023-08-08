"""
O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.
"""

temperaturas = []

while True:
    temperatura = int(input("Digite a temperatura (ou digite 0 para encerrar): "))
    if temperatura == 0:
        break
    temperaturas.append(temperatura)

if not temperaturas:
    print("Nenhuma temperatura foi informada.")
else:
    menor_temperatura = min(temperaturas)
    maior_temperatura = max(temperaturas)
    media_temperaturas = sum(temperaturas) / len(temperaturas)

    print(f"Menor temperatura: {menor_temperatura:.2f}")
    print(f"Maior temperatura: {maior_temperatura:.2f}")
    print(f"Média das temperaturas: {media_temperaturas:.2f}")
