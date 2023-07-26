"""
Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
"""

data = input("Digite uma data (dd/mm/aaaa): ")

try:
    dia, mes, ano = map(int, data.split('/'))
except ValueError:
    print('Digite uma data válida.')
    exit()

if 1 <= mes <= 12 and 1 <= dia <= 31:
    if mes in [4, 6 , 9, 11] and dia > 30:
        data_valida = False
    elif mes == 2:
        if (ano % 4 == 0 and ano % 100 != 0) or ano % 400 == 0:
            data_valida = (dia <= 29)
        else:
            data_valida = (dia <= 28)
    else:
        data_valida = True
else:
    data_valida = False

if data_valida:
    print(f"A data {data} é válida.")
else:
    print(f"A data {data} não é válida.")
