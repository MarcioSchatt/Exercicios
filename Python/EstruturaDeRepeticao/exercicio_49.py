"""
Faça um programa que mostre os n termos da Série a seguir:

  S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. 

Imprima no final a soma da série.
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
