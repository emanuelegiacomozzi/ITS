

def SerializzaLista(lVar): 
    s = str(lVar)
    return s

print(SerializzaLista(['mario', 'gino', 'lucrezia']))
    

def Deserializza(sVar):
    
    l = sVar.strip("S")
    l2 = str(l)
    l1 = l2.split()
    return l1

print(Deserializza("['mario', 'gino', 'lucrezia']"))


import json


def SerializaJson(dData, file_path):
    sData = json.dumps(dData)
    try:
        with open(file_path, "w") as myfile:
            myfile.write(sData)
        return True
    except:
        return False
    
'''
    try:
        with open(file_path, "w") as myfile:
            json.dump(dData, myfile)
        return True
    except:
        return False
'''
        

def DeserializaJson(file_path):
    sData = ""
    sAppo = ""
    with open(file_path, 'r') as file:
        sAppo = file.read(500)
        while len(sAppo)==500:
            sData += sAppo
            sAppo = file.read(500)
        if len(sAppo)>0:
            sData += sAppo
    if len(sData)>0:
        dData = json.loads(sData)
        return dData
    else:
        return None

mydict_1 = { "brand": "Ford",
"electric": False,
"year": 1964,
"colors": ["red", "white", "blue"]}

mydict_2 = "{ 'brand':   'Ford'," + \
"'electric': False," + \
"'year': 1964," + \
"'colors': ['red', 'white', 'blue']}"

bRet = SerializaJson(mydict_1, "./esercizio.json")
print(bRet)
bRet1 = DeserializaJson("./esercizio2.json")