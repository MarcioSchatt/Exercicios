"""
Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia.
Um número primo é aquele que é divisível apenas por um e por ele mesmo.
Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.
"""
def prime_number(numero):
    if numero < 2:
        return False

    for i in range(2, int(numero ** 0.5) + 1):
        if numero % i == 0:
            return False

    return True

numero = int(input("Digite um número inteiro: "))

if prime_number(numero):
    print(f"{numero} é um número primo.")
else:
    print(f"{numero} não é um número primo.")
