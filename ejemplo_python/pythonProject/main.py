# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def factorial(uno):
    if uno == 0:
        return 1
    else:
        return  uno * factorial(uno-1)



numero = 5
print(f"El factorial de {numero} es: {factorial(numero)}")



