"""
Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais gordo e o mais magro.
Para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código, sua altura e seu peso.
O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.
Ao encerrar o programa também deve ser informados os códigos e valores do clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes
"""

codigos = []
alturas = []
pesos = []

while True:
    codigo = int(input("Digite o código do cliente (ou 0 para encerrar): "))
    if codigo == 0:
        break

    altura = float(input("Digite a altura do cliente (em metros): "))
    peso = float(input("Digite o peso do cliente (em kg): "))

    codigos.append(codigo)
    alturas.append(altura)
    pesos.append(peso)

if not codigos:
    print("Nenhum cliente foi informado.")
else:
    mais_alto = alturas.index(max(alturas))
    mais_baixo = alturas.index(min(alturas))
    mais_gordo = pesos.index(max(pesos))
    mais_magro = pesos.index(min(pesos))

    media_alturas = sum(alturas) / len(alturas)
    media_pesos = sum(pesos) / len(pesos)

    print(f"Código do cliente mais alto: {codigos[mais_alto]}")
    print(f"Código do cliente mais baixo: {codigos[mais_baixo]}")
    print(f"Código do cliente mais gordo: {codigos[mais_gordo]}")
    print(f"Código do cliente mais magro: {codigos[mais_magro]}")
    print(f"Média das alturas dos clientes: {media_alturas:.1f} metros")
    print(f"Média dos pesos dos clientes: {media_pesos:.1f} kg")
