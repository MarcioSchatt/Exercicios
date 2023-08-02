"""
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
"""

while True:
    user = input("Usuário: ").lower()
    senha = input("Senha: ").lower()
    if user == senha:
        print("Não é permitido usuário e senha iguais.")
        pass
    else:
        break
