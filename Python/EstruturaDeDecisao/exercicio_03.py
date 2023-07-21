"""
Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
"""

gen = str(input('Digite a letra que representa seu gênero (F/M): '))

if gen.lower() == 'f':
    print('Gênero: Feminino')
elif gen.lower() == 'm':
    print('Gênero: Masculino')
else:
    print('Sexo Inválido.')
