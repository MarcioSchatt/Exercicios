"""
Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
"""

letra = str(input('Digite a letra: '))

if letra.isalpha() and len(letra) == 1:
    if letra.lower() in 'aeiou':
        print('A letra é: vogal')
    else:
        print('A letra é: consoante')
else:
    print('Entrada inválida.')
