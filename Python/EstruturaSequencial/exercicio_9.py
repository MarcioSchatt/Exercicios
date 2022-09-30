# Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

fahrenheit = int(input('Graus em fahrenheit: '))
celsius = (fahrenheit - 32) / 1.8

print(f'{fahrenheit}F = {celsius}º')
