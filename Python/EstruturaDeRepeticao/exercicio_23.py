"""
Faça um programa que mostre todos os primos entre 1 e N sendo N um número inteiro fornecido pelo usuário.
O programa deverá mostrar também o número de divisões que ele executou para encontrar os números primos.
Serão avaliados o funcionamento, o estilo e o número de testes (divisões) executados.
"""

N = int(input("Digite um número inteiro para encontrar todos os primos até N: "))

if N < 2:
    print("Não existem primos menores que 2.")
else:
    numeros = [True] * (N + 1)
    numeros[0] = numeros[1] = False

    divisoes = 0

    for i in range(2, int(N**0.5) + 1):
        if numeros[i]:
            for j in range(i*i, N+1, i):
                numeros[j] = False
                divisoes += 1

    primos = [i for i in range(2, N + 1) if numeros[i]]

    print(f"Os números primos entre 1 e {N} são: {primos}")
    print(f"Número total de divisões: {divisoes}")
