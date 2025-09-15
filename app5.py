num1 = int(input("Digite a primeira nota: "))
num2 = int(input("Digite a segunda nota: "))
num3 = int(input("Digite a terceira nota: "))
num4 = int(input("Digite a quarta nota: "))

med = (num1 + num2+ num3+ num4) / 4

if med < 7:
    print(f"Você está reprovado, sua média foi {med}")
else: 
    print(f"Você está aprovado, sua média foi {med}")