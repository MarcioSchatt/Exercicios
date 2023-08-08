"""
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99 e agora possui uma loja de conveniências.
Faça um programa que implemente uma caixa registradora rudimentar.
O programa deverá receber um número desconhecido de valores referentes aos preços das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra.
O programa deve então mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para registrar a próxima compra. A saída deve ser conforme o exemplo abaixo:

Lojas Tabajara 
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00
...
"""

while True:
    print("Lojas Tabajara")
    total = 0.0
    qtd_produtos = 0

    while True:
        preco = float(input(f"Produto {qtd_produtos + 1} (digite 0 para finalizar): R$"))
        if preco == 0:
            break

        total += preco
        qtd_produtos += 1

    print(f"Total: R$ {total:.2f}")

    dinheiro_cliente = float(input("Dinheiro fornecido pelo cliente: R$"))
    troco = dinheiro_cliente - total

    print(f"Troco: R$ {troco:.2f}")

    resposta = input("Deseja registrar uma nova compra? (S/N): ")
    if resposta.lower() == 's':
        continue
    elif resposta.lower() == 'n':
        break
    else:
        while resposta not in ["s", "n"]:
            print("Digite uma letra válida.")
            resposta = input("Deseja calcular o fatorial de outro número? (s/n): ")
        if resposta.lower() == "n":
            break
