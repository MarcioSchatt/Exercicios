"""
Faça um Programa que leia três números e mostre o maior e o menor deles.
"""

num1 = float(input('Digite o primeiro número: '))
num2 = float(input('Digite o segundo número: '))
num3 = float(input('Digite o terceiro número: '))

maior = max(num1, num2, num3)
menor = min(num1, num2, num3)
# OU
if num1 >= (num2) and (num3):
    maior = num1
elif num2 >= (num1) and (num3):
    maior = num2
else:
    maior = num3

if num1 <= (num2) and (num3):
    menor = num1
elif num2 <= (num1) and (num3):
    menor = num2
else:
    menor = num3

print(f'O maior número é: {maior}')
print(f'O menor número é: {menor}')
