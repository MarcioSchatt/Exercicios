"""
Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito.
Foram obtidos os seguintes dados:

b) Código da cidade;
c) Número de veículos de passeio (em 1999);
d) Número de acidentes de trânsito com vítimas (em 1999). Deseja-se saber:
e) Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
f) Qual a média de veículos nas cinco cidades juntas;
g) Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.
"""

preco_pao = float(input("Digite o preço do pão: R$ "))

print("Panificadora Pão de Ontem - Tabela de preços")

for i in range(1, 51):
    preco_total = i * preco_pao
    print(f"{i:2} - R$ {preco_total:.2f}")
