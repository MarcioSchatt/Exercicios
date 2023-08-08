"""
Encontrar números primos é uma tarefa difícil.
Faça um programa que gera uma lista dos números primos existentes entre 1 e um número inteiro informado pelo usuário.
"""
def prime_number(numero):
    if numero < 2:
        return False

    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False

    return True

numero_limite = int(input("Digite um número inteiro limite: "))

primos = [numero for numero in range(2, numero_limite + 1) if prime_number(numero)]

print(f"Números primos entre 1 e {numero_limite}: {primos}")
