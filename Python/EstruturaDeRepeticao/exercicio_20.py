"""
Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando o fatorial a números inteiros positivos e menores que 16.
"""

while True:
    fatorial = int(input(f"Digite o fatorial (até 16): "))
    if fatorial <= 0 or fatorial > 16:
        print(f"Não é possível fazer o fatorial de {fatorial}.")
        continue

    print(f"{fatorial}!=", end="")
    numero = 1
    for i in range(fatorial, 0, -1):
        numero *= i
        if i == 1:
            print(f"{i}", end="")
        else:
            print(f"{i}.", end="")
    print(f"={numero}")
    repetir = input("Deseja calcular o fatorial de outro número? (s/n): ")
    if repetir.lower() == 's':
        continue
    elif repetir.lower() == 'n':
        break
    else:
        while repetir not in ["s", "n"]:
            print("Digite uma letra válida.")
            repetir = input("Deseja calcular o fatorial de outro número? (s/n): ")
        if repetir.lower() == "n":
            break
