"""
Faça um Programa que peça dois números e imprima o maior deles.
"""

num1 = float(input('Digite o primeiro número: '))
num2 = float(input('Digite o segundo número: '))

if num1 > num2:
    maior = num1
else:
    maior = num2
print(f'O maior número é: {maior}.')
