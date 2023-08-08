"""
Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:

a) Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
b) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
c) A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior.

Faça um programa que determine o salário atual desse funcionário.
Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.
"""

# Salário inicial informado pelo usuário
salario_inicial = float(input("Digite o salário inicial do funcionário: R$ "))

# Aumento em 1996
aumento_1996 = salario_inicial * 0.015
salario_1996 = salario_inicial + aumento_1996

# Aumentos a partir de 1997
ano_atual = 1997
salario_atual = salario_1996

while ano_atual <= 2023:
    aumento_anual = salario_atual * (ano_atual - 1995) * 0.015
    salario_atual += aumento_anual
    ano_atual += 1

print(f"Salário atual do funcionário em 2023: R$ {salario_atual:.2f}")
