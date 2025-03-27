i: int = 0
test_value : int = 5

assert i == test_value, f"Error, the variable i must be {test_value} instead is {i}"

#verifica se una condizione è vera, se è vera non torna nulla, se è falsa torna AssertionError
#serve per fare test

def sum(a:int, b:int) -> int:

    return 0

result = sum(a=5, b=2)
test_value:int = 7
assert result == test_value, f"Error, the variable i must be {test_value} instead is {result}"
#assert   condizione da verificare      messaggio da stampare

a = [1,2,3]
a = [1,2,3]

res_check = [True, False, True]
result = sum(a=4, b=2)
test_value = 6
assert all(res_check), f"Error, the variable i must be {test_value} instead is {result}"
#all() verifica se tutto quello all'interno di qualcosa è True, se c'è un False o 0 torna False

#lancio test senza assert: python3 -m unittest -v
#se va a buon fine spunta un pallino, se fallisce spunta una f 