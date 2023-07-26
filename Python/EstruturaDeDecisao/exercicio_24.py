"""
Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

1. par ou ímpar;
2. positivo ou negativo;
3. inteiro ou decimal.
"""

num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))
operacao = input("Escolha a operação ([+], [-], [*], [/]): ")

if operacao == '+':
    resultado = num1 + num2
elif operacao == '-':
    resultado = num1 - num2
elif operacao == '*':
    resultado = num1 * num2
elif operacao == '/':
    resultado = num1 / num2
else:
    print("Operação inválida.")
    exit()

if resultado % 2 == 0:
    adj1 = "par"
else:
    adj1 = "ímpar"
if resultado >= 0:
    adj2 = "positivo"
else:
    adj2 = "negativo"
if resultado == round(resultado):
    adj3 = "inteiro"
else:
    adj3 = "decimal"

print(f"Resultado da operação: {resultado:.1f}")
print(f"O número {resultado:.1f} é {adj1}, {adj2} e {adj3}.")
