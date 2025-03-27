def lenght_of_last_word(s:str):
    s1 = "".join(reversed(s))
    for i in range(len(s)):
        if i == " ":
            break
        else:
            s1 += 1
    return len(s)
s = input("Inserisci stringa: ")
print(lenght_of_last_word(s))