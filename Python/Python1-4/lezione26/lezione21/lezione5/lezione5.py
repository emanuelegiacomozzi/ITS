def is_palindrome(x:int):
    y = str(x)
    z = "".join(reversed(y))
    if z == x:
        return True
    else:
        return False
x = input("inserisci un numero: ")
print(is_palindrome(x)) 