"""
Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.
"""
def calcular_serie(n):
    soma = 0
    m = 1

    for i in range(1, n + 1):
        termo = i / m
        print(f"{i}/{m}", end=" ")
        soma += termo
        m += 2

    return soma

n_termos = int(input("Digite o número de termos da série: "))

soma_serie = calcular_serie(n_termos)
print(f"\nSoma da série: {soma_serie:.1f}")
