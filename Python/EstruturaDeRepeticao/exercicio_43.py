"""
O cardápio de uma lanchonete é o seguinte:

Especificação   Código  Preço
Cachorro Quente 100     R$ 1,20
Bauru Simples   101     R$ 1,30
Bauru com ovo   102     R$ 1,50
Hambúrguer      103     R$ 1,20
Cheeseburguer   104     R$ 1,30
Refrigerante    105     R$ 1,00

Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado.
"""

cardapio = {
    100:
        {"Especificação": "Cachorro Quente", "Preço": 1.20},
    101:
        {"Especificação": "Bauru Simples", "Preço": 1.30},
    102:
        {"Especificação": "Bauru com ovo", "Preço": 1.50},
    103:
        {"Especificação": "Hambúrguer", "Preço": 1.20},
    104:
        {"Especificação": "Cheeseburguer", "Preço": 1.30},
    105:
        {"Especificação": "Refrigerante", "Preço": 1.00},
}

total_pedido = 0

while True:
    codigo = int(input("Digite o código do item (ou -1 para encerrar o pedido): "))

    if codigo == -1:
        break

    quantidade = int(input("Digite a quantidade desejada: "))

    if codigo in cardapio:
        preco_unitario = cardapio[codigo]["Preço"]
        valor_item = preco_unitario * quantidade
        total_pedido += valor_item
        print(f"{quantidade} {cardapio[codigo]['Especificação']} - Total a pagar: R$ {valor_item:.2f}")
    else:
        print("Código inválido. Por favor, escolha um código válido do cardápio.")

print(f"Total do pedido: R$ {total_pedido:.2f}")
