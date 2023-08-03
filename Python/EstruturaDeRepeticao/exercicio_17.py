"""
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
"""

fatorial = int(input(f"Digite o fatorial: "))
if fatorial <= 0:
    print(f"Não é possível fazer o fatorial de {fatorial}.")
    exit()

print(f"{fatorial}!=", end="")
numero = 1
for i in range(fatorial, 0, -1):
    numero *= i
    if i == 1:
        print(f"{i}", end="")
    else:
        print(f"{i}.", end="")
print(f"={numero}")
