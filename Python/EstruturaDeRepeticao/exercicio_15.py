"""
A série de Fibonacci é formada pela seqüência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
Faça um programa capaz de gerar a série até o n-ésimo termo.
"""

n = int(input("Digite o número de termos da série de Fibonacci desejado: "))
serie = [0, 1]

for i in range(2, n):
    proximo = serie[i - 1] + serie[i - 2]
    serie.append(proximo)

print(f"A série de Fibonacci com {n} termos é:", end=" ")
for numero in serie:
    print(numero, end=" ")
