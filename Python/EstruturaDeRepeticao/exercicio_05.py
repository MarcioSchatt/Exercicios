"""
Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
Valide a entrada e permita repetir a operação.
"""

while True:
    print("Informe os dados para o país A:")
    while True:
        try:
            populacao_a = int(input("População inicial de A: "))
            crescimento_a = int(input("Taxa de crescimento anual de A (%): "))
            if populacao_a <= 0 or crescimento_a <= 0:
                print('Por favor, digite um número positivo.')
                pass
            else:
                break
        except ValueError:
            print("Entrada inválida. Por favor, digite um número válido.")

    print("Informe os dados para o país B:")
    while True:
        try:
            populacao_b = int(input("População inicial de B: "))
            crescimento_b = int(input("Taxa de crescimento anual de B (%): "))
            if populacao_b <= 0 or crescimento_b <= 0:
                print('Por favor, digite um número positivo.')
                pass
            else:
                break
        except ValueError:
            print("Entrada inválida. Por favor, digite um número válido.")

    anos = 0
    while populacao_a < populacao_b:
        populacao_a *= (1 + crescimento_a / 100)
        populacao_b *= (1 + crescimento_b / 100)
        anos += 1

    print(f"Levará {anos} anos para a população do país A ultrapassar ou igualar a população do país B.")

    comando = input("Digite se deseja repetir a operação (S/N): ").lower()
    if comando == "s":
        pass
    elif comando == "n":
        break
    else:
        while comando not in ["s", "n"]:
            print("Entrada inválida. Por favor, digite uma letra válida.")
            comando = input("Digite se deseja repetir a operação (S/N): ").lower()
        if comando == "s":
            pass
        elif comando == "n":
            break
