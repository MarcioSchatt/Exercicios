"""
A série de Fibonacci é formada pela seqüência 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,...
Faça um programa que gere a série até que o valor seja maior que 500.
"""

serie = [0, 1]
while True:
    proximo = serie[-1] + serie[-2]
    if proximo >= 500:
        break
    serie.append(proximo)

print(f"Série de Fibonacci:", end=" ")
for numero in serie:
    print(numero, end=" ")
