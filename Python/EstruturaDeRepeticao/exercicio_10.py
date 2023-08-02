"""
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
"""

for i in range(1, 3):
    numero = int(input(f"Digite o {i}º número: "))
    if i == 1:
        maior = numero
        menor = numero
    else:
        if numero > maior:
            maior = numero
        elif numero < menor:
            menor = numero

print(f"Os números inteiros entre {menor} e {maior} são:", end=" ")
for i in range(menor+1, maior):
    print(i, end=" ")
