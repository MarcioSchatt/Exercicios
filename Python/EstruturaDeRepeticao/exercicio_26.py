"""
Numa eleição existem três candidatos.
Faça um programa que peça o número total de eleitores.
Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
"""

numero_eleitores = int(input("Digite o número total de eleitores: "))

candidatos = ["Candidato 1", "Candidato 2", "Candidato 3"]
votos = [0, 0, 0]

for i in range(numero_eleitores):
    print(f"Eleitor {i+1}, escolha o candidato (1, 2 ou 3):")
    voto = int(input("1 - Candidato 1\n2 - Candidato 2\n3 - Candidato 3\nEscolha: "))

    while voto not in [1, 2, 3]:
        print("Opção inválida. Por favor, escolha 1, 2 ou 3.")
        voto = int(input("1 - Candidato 1\n2 - Candidato 2\n3 - Candidato 3\nEscolha: "))

    votos[voto - 1] += 1

print("Resultado da eleição:")
for i, candidato in enumerate(candidatos):
    print(f"{candidato}: {votos[i]} votos")
