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

num_cidades = 5
maior_indice_acidentes = menor_indice_acidentes = None
cidade_maior_indice = cidade_menor_indice = None
total_veiculos = total_acidentes = 0

for i in range(num_cidades):
    print(f"=== Cidade {i + 1} ===")
    codigo_cidade = int(input("Digite o código da cidade: "))
    num_veiculos = int(input("Digite o número de veículos de passeio (em 1999): "))
    num_acidentes = int(input("Digite o número de acidentes de trânsito com vítimas (em 1999): "))

    # Cálculo do índice de acidentes de trânsito
    indice_acidentes = num_acidentes / num_veiculos

    # Atualização do maior e menor índice de acidentes
    if maior_indice_acidentes is None or indice_acidentes > maior_indice_acidentes:
        maior_indice_acidentes = indice_acidentes
        cidade_maior_indice = codigo_cidade

    if menor_indice_acidentes is None or indice_acidentes < menor_indice_acidentes:
        menor_indice_acidentes = indice_acidentes
        cidade_menor_indice = codigo_cidade

    # Cálculo da média de veículos nas cinco cidades juntas
    total_veiculos += num_veiculos

    # Cálculo da média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio
    if num_veiculos < 2000:
        total_acidentes += num_acidentes

media_veiculos = total_veiculos / num_cidades
media_acidentes_cidades_menores_2000 = total_acidentes / (num_cidades - 2)

print(f"Maior índice de acidentes: {maior_indice_acidentes:.1f}, Cidade: {cidade_maior_indice}")
print(f"Menor índice de acidentes: {menor_indice_acidentes:.1f}, Cidade: {cidade_menor_indice}")
print(f"Média de veículos nas cinco cidades: {media_veiculos:.1f}")
print(f"Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: {media_acidentes_cidades_menores_2000:.1f}")
