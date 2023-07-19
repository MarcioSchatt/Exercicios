"""
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.

Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:

a) comprar apenas latas de 18 litros;
b) comprar apenas galões de 3,6 litros;
c) misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
"""
import math

area = float(input("Digite o tamanho da área a ser pintada em metros quadrados: "))
preco_lata = 80
preco_galao = 25

area_com_folga = area * 1.1
litros = area_com_folga / 6
latas_tinta = math.ceil(litros / 18)
galoes_tinta = math.ceil(litros / 3.6)

total_latas = latas_tinta * preco_lata
total_galoes = galoes_tinta * preco_galao

mistura_lata = int(litros / 18)
mistura_galao = int((litros - (mistura_lata * 18)) / 3.6)
if litros - (mistura_lata * 18) % 3.6 != 0:
    mistura_galao += 1
preco_mistura = (mistura_galao*25) + (mistura_lata*80)

print(f"Quantidade de latas de 18 litros a serem compradas: {latas_tinta}")
print(f"Preço apenas com latas de 18 litros: R$ {total_latas:.2f}")

print(f"\nQuantidade de galões de 3,6 litros a serem comprados: {galoes_tinta}")
print(f"Preço apenas com galões de 3,6 litros: R$ {total_galoes:.2f}")

print(f"\nMisturando latas e galões:")
print(f"Quantidade de latas de 18 litros: {mistura_lata}")
print(f"Quantidade de galões de 3,6 litros: {mistura_galao}")
print(f"Preço com a mistura: R$ {preco_mistura:.2f}")
