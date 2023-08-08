"""
Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
As turmas não podem ter mais de 40 alunos.
"""

quantidade_turmas = int(input("Digite a quantidade de turmas: "))

total_alunos = 0
for i in range(1, quantidade_turmas + 1):
    quantidade_alunos = int(input(f"Digite a quantidade de alunos na turma {i} (Menos de 40): "))
    if quantidade_alunos > 40:
        print("Comando inválido!")
        exit()
    total_alunos += quantidade_alunos

media_alunos_por_turma = total_alunos / quantidade_turmas

print(f"A média de alunos por turma é: {media_alunos_por_turma:.1f}")
