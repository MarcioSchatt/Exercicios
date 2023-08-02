"""
Faça um programa que leia e valide as seguintes informações:

- Nome: maior que 3 caracteres;
- Idade: entre 0 e 150;
- Salário: maior que zero;
- Sexo: 'f' ou 'm';
- Estado Civil: 's', 'c', 'v', 'd';
"""

nome = input("Digite seu nome: ")
while True:
    if len(nome) <= 3:
        print("Seu nome deve ter mais de 3 caracteres.")
        nome = input("Digite seu nome: ")
    else:
        break

idade = int(input("Digite sua idade: "))
while True:
    if idade > 150 or idade < 0:
        print("Sua idade deve ser entre 0 e 150.")
        idade = int(input("Digite sua idade: "))
    else:
        break

salario = float(input("Digite seu salário: R$"))
while True:
    if salario < 0:
        print("Seu salário deve ser maior que 0.")
        salario = float(input("Digite seu salário: R$"))
    else:
        break

sexo = input("Digite seu gênero (F/M): ").lower()
while True:
    if sexo not in ["f", "m"]:
        print("Seu gênero deve ser 'm' ou 'f'.")
        sexo = input("Digite seu gênero (F/M): ").lower()
    else:
        break

estado_civil = input("Digite seu estado civil (S/C/V/D): ").lower()
while True:
    if estado_civil not in ["s", "c", "v", "d"]:
        print("Seu estado civil deve ser 's', 'c', 'v' ou 'd'.")
        estado_civil = input("Digite seu estado civil (S/C/V/D): ").lower()
    else:
        break

print('As informações foram validadas.')
