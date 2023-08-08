"""
Faça um programa que leia dez conjuntos de dois valores, o primeiro representando o número do aluno e o segundo representando a sua altura em centímetros.
Encontre o aluno mais alto e o mais baixo.
Mostre o número do aluno mais alto e o número do aluno mais baixo, junto com suas alturas.
"""

numero_alunos = 10
numeros_alunos = []
alturas_alunos = []

for i in range(numero_alunos):
    numero_aluno = int(input(f"Digite o número do aluno {i + 1}: "))
    altura_aluno = int(input(f"Digite a altura do aluno {i + 1} (em cm): "))

    numeros_alunos.append(numero_aluno)
    alturas_alunos.append(altura_aluno)

indice_aluno_mais_alto = alturas_alunos.index(max(alturas_alunos))
indice_aluno_mais_baixo = alturas_alunos.index(min(alturas_alunos))

numero_aluno_mais_alto = numeros_alunos[indice_aluno_mais_alto]
numero_aluno_mais_baixo = numeros_alunos[indice_aluno_mais_baixo]
altura_mais_alto = alturas_alunos[indice_aluno_mais_alto]
altura_mais_baixo = alturas_alunos[indice_aluno_mais_baixo]

print(f"Aluno mais alto - Número: {numero_aluno_mais_alto}, Altura: {altura_mais_alto}cm")
print(f"Aluno mais baixo - Número: {numero_aluno_mais_baixo}, Altura: {altura_mais_baixo}cm")
