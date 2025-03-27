def convert_to_title(col_number:int) -> str:
    result:str = ""
    while col_number > 0:
        resto:int = (col_number - 1) % 26
        result = chr(resto + ord('A')) + result
        col_number = (col_number - 1) // 26
    return result
print(convert_to_title(int(input("Inserisci un numero: "))))
