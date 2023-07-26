"""
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente.
Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra.
Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal.
Contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.
"""

tipos_carne = {
    1: 'File Duplo',
    2: 'Alcatra',
    3: 'Picanha'}
tabela_precos = {
    'File Duplo': {5: 4.90, 'acima': 5.80},
    'Alcatra': {5: 5.90, 'acima': 6.80},
    'Picanha': {5: 6.90, 'acima': 7.80}
}
print("Tipos de carne disponíveis:")
print("1 - File Duplo")
print("2 - Alcatra")
print("3 - Picanha")

tipo_carne_escolhida = int(input("Digite o número correspondente ao tipo de carne que deseja comprar: "))
tipo_carne = tipos_carne.get(tipo_carne_escolhida)
kg_carne = float(input("Digite a quantidade (em Kg) de carne que deseja comprar: "))
cartao_tabajara = input("Você possui o cartão Tabajara? (sim ou não): ").lower()

if kg_carne <= 5:
    preco_por_kg = tabela_precos[tipo_carne][5]
else:
    preco_por_kg = tabela_precos[tipo_carne]['acima']

valor = kg_carne * preco_por_kg

desconto = 0
if cartao_tabajara == 'sim':
    desconto = valor * 0.05
    valor -= desconto

print("\nCupom Fiscal")
print(f"Tipo de carne: {tipo_carne}")
print(f"Quantidade: {kg_carne:.1f}kg")
print(f"Preço total: R${valor:.2f}")
print(f"Tipo de pagamento: {'Cartão Tabajara' if cartao_tabajara == 'sim' else 'Dinheiro'}")
print(f"Desconto: R${desconto:.2f}")
print(f"Valor a pagar: R${valor:.2f}")
