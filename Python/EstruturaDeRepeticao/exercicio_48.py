"""
Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero invertido.
Exemplo:

  12376489
  => 98467321
"""
def inverter_numero(numero):
    return int(str(numero)[::-1])

numero_inteiro = int(input("Digite um número inteiro positivo: "))

if numero_inteiro >= 0:
    numero_invertido = inverter_numero(numero_inteiro)
    print(f"Número invertido: {numero_invertido}")
else:
    print("Número inválido. Digite um número inteiro positivo.")
