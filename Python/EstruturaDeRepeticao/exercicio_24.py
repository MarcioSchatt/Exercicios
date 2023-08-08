"""
Faça um programa que calcule o mostre a média aritmética de N notas.
"""

N = int(input("Digite a quantidade de notas que você deseja calcular a média: "))

notas = []
for i in range(N):
    nota = float(input(f"Digite a {i+1}ª nota: "))
    notas.append(nota)

media = sum(notas) / N

print(f"A média aritmética das {N} notas é: {media:.1f}")
