"""
Faça um Programa para leitura de três notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e presentar:

1. A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
2. A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
3. A mensagem "Aprovado com Distinção", se a média for igual a 10.
"""

nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: "))
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3

print(f"\nMédia alcançada: {media:.1f}")
if media == 10:
    print("Aprovado com Distinção!")
elif media >= 7:
    print("Aprovado.")
else:
    print("Reprovado.")
