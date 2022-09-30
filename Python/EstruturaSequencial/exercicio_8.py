# Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

dinheiro = float(input('Salário por hora trabalhada: '))
horas = float(input('Horas trabalhadas: '))
salario = dinheiro * horas

print(f'O salário é de R${salario:.2f}.')
