"""
Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questões.
O programa deve perguntar ao aluno a resposta de cada questão e ao final comparar com o gabarito da prova e assim calcular o total de acertos e a nota (atribuir 1 ponto por resposta certa).
Após cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno vai utilizar o sistema.
Após todos os alunos terem respondido informar:

a) Maior e Menor Acerto;
b) Total de Alunos que utilizaram o sistema;
c) A Média das Notas da Turma.

Gabarito da Prova:

01 - A
02 - B
03 - C
04 - D
05 - E
06 - E
07 - D
08 - C
09 - B
10 - A

Após concluir isto você poderia incrementar o programa permitindo que o professor digite o gabarito da prova antes dos alunos usarem o programa.
"""
def obter_respostas_aluno():
    respostas_aluno = []
    for i in range(1, 11):
        resposta = input(f"Digite a resposta da questão {i}: ").upper()
        while resposta not in ['A', 'B', 'C', 'D', 'E']:
            print("Resposta inválida. Digite A, B, C, D ou E.")
            resposta = input(f"Digite a resposta da questão {i}: ").upper()
        respostas_aluno.append(resposta)
    return respostas_aluno

def calcular_acertos(gabarito, respostas_aluno):
    acertos = 0
    for i in range(len(gabarito)):
        if gabarito[i] == respostas_aluno[i]:
            acertos += 1
    return acertos

gabarito_prova = []
for i in range(1, 11):
    resposta_gabarito = input(f"Digite a resposta correta da questão {i}: ").upper()
    while resposta_gabarito not in ['A', 'B', 'C', 'D', 'E']:
        print("Resposta inválida. Digite A, B, C, D ou E.")
        resposta_gabarito = input(f"Digite a resposta correta da questão {i}: ").upper()
    gabarito_prova.append(resposta_gabarito)

maior_acerto = 0
menor_acerto = 10
total_alunos = 0
soma_notas = 0

while True:
    respostas_aluno = obter_respostas_aluno()
    acertos_aluno = calcular_acertos(gabarito_prova, respostas_aluno)
    
    print(f"Total de acertos do aluno: {acertos_aluno}")
    
    if acertos_aluno > maior_acerto:
        maior_acerto = acertos_aluno
    if acertos_aluno < menor_acerto:
        menor_acerto = acertos_aluno

    total_alunos += 1
    soma_notas += acertos_aluno

    opcao = input("Outro aluno irá utilizar o sistema? (S/N): ").upper()
    if opcao != 'S':
        break

media_notas = soma_notas / total_alunos

print("Resultado da Turma:")
print(f"Maior Acerto: {maior_acerto}")
print(f"Menor Acerto: {menor_acerto}")
print(f"Total de Alunos: {total_alunos}")
print(f"Média das Notas: {media_notas:.2f}")
