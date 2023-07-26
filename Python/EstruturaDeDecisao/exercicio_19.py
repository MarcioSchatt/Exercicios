"""
Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:

326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
"""

numero = int(input("Digite um número inteiro menor que 1000: "))

if numero < 1000:
    numero_str = str(numero)
else:
    print('Digite um número menor que 1000.')
    exit()

if len(numero_str) == 3:
    centenas = int(numero_str[0])
    dezenas = int(numero_str[1])
    unidades = int(numero_str[2])
elif len(numero_str) == 2:
    centenas = 0
    dezenas = int(numero_str[0])
    unidades = int(numero_str[1])
else:
    centenas = 0
    dezenas = 0
    unidades = int(numero_str[0])

if centenas > 1 or centenas == 0:
    string_centena = 'centenas'
elif centenas < 1:
    string_centena = 'centena'
if dezenas > 1 or dezenas == 0:
    string_dezena = 'dezenas'
elif dezenas < 1:
    string_dezena = 'dezena'
if unidades > 1 or unidades == 0:
    string_unidade = 'unidades'
elif unidades < 1:
    string_unidade = 'unidade'

if centenas > 0 and dezenas >= 0 and unidades >= 0:
    print(f"{centenas} {string_centena}, {dezenas} {string_dezena} e {unidades} {string_unidade}.")
elif dezenas > 0 and unidades >= 0:
    print(f"{dezenas} {string_dezena} e {unidades} {string_unidade}.")
else:
    print(f"{unidades} {string_unidade}.")
