"""
Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:

a) o produto do dobro do primeiro com metade do segundo.
b) a soma do triplo do primeiro com o terceiro.
c) o terceiro elevado ao cubo.
"""

num_int1 = int(input("Digite o primeiro número inteiro: "))
num_int2 = int(input("Digite o segundo número inteiro: "))
num_real = float(input("Digite o número real: "))

resultado_a = ((2*num_int1) * (num_int2/2))
resultado_b = (3*num_int1) + num_real
resultado_c = (num_real**3)

print(f"a) O produto do dobro do primeiro com metade do segundo é: {resultado_a}")
print(f"b) A soma do triplo do primeiro com o terceiro é: {resultado_b}")
print(f"c) O terceiro elevado ao cubo é: {resultado_c}")
