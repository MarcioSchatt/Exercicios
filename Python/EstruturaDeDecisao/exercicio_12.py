"""
Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).

O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
"""

valor_hora = float(input("Digite o valor da sua hora: "))
horas = float(input("Digite a quantidade de horas trabalhadas no mês: "))

salario = valor_hora * horas
sindicato = salario * 0.03
fgts = salario * 0.11

if salario <= 900:
    per_ir = 0
elif salario <= 1500:
    per_ir = 5
elif salario <= 2500:
    per_ir = 10
else:
    per_ir = 20

valor_ir = salario * (per_ir / 100)
descontos = sindicato + valor_ir
salario_liq = salario - descontos

print(f"Salário Bruto: ({valor_hora:.2f} * {horas:.2f}): R${salario:.2f}")
print(f"(-) IR ({per_ir:.0f}%): R$ {valor_ir:.2f}")
print(f"(-) INSS (3%): R${sindicato:.2f}")
print(f"FGTS (11%): R${fgts:.2f}")
print(f"Total de descontos: R${descontos:.2f}")
print(f"Salário Líquido: R${salario_liq:.2f}")
