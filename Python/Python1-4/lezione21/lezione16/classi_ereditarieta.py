#esercizio 1
class Contatore:

    def __init__(self):
        self.conteggio = 0
    
    def setZero(self):
        self.conteggio = 0
    
    def add1(self):
        self.conteggio += 1
        return f"Conteggio attuale: {self.conteggio}"

    def sub1(self):
        if self.conteggio > 0:
            self.conteggio -= 1
            return f"Conteggio attuale: {self.conteggio}"
        else:
            print("Non è possibile eseguire la sottrazione")

        
        
    def get(self):
        return self.conteggio

    def mostra(self):
        print(f"Conteggio attuale: {self.get()}")
    

    
c = Contatore()  
c.add1() 
c.sub1()
c.mostra()

#esercizio 2

class RecipeManager:

    def __init__(self):
        self.ricetta:dict = {}
    
    def create_recipe(self, name:str, ingredients:list):

        self.name = name
        self.ingredients = ingredients
        if name not in self.ricetta and tuple(ingredients) not in self.ricetta:
            self.ricetta[name] = ingredients
            return self.ricetta
        if name in self.ricetta and tuple(ingredients) in self.ricetta:
            return "La ricetta esiste già"
    
    def add_ingredient(self, recipe_name:str, ingredient:str):

        self.recipe_name = self.name
        if ingredient not in self.ingredients:
            self.ingredients.append(ingredient)
            return self.ricetta
        elif recipe_name not in self.ricetta or ingredient in self.ricetta:
            return "Errore"
    
    def remove_ingredient(self, recipe_name:str, ingredient:str):
        
        self.ingredient = ingredient
        self.recipe_name = self.name
        if ingredient in self.ingredients:
            self.ingredients.remove(ingredient)
            return self.ricetta
        elif recipe_name not in self.ricetta or ingredient not in self.ricetta:
            return "Errore"
    
    def update_ingredient(self,recipe_name:str, old_ingredient:str, new_ingredient:str):
        
        self.remove_ingredient(recipe_name, old_ingredient)
        self.add_ingredient(recipe_name, new_ingredient)
        for recipe_name, self.ingredients in self.ricetta.items():
            self.ingredients[-1], self.ingredients[-2] = self.ingredients[-2], self.ingredients[-1]
            return self.ricetta
        if new_ingredient not in self.ricetta or recipe_name not in self.ricetta:
            return "Errore"
            
    def list_recipes(self):
        for key in self.ricetta.keys():
            return [key]
   
    def list_ingredients(self, recipe_name:str):
        self.recipe_name = recipe_name
        for recipe_name,self.ingredients in self.ricetta.items():
            return self.ingredients
    
    def search_recipe_by_ingredient(self, ingredient:str):
        for self.recipe_name, self.ingredients in self.ricetta.items():
            if ingredient in self.ingredients:
                return self.ricetta
            elif ingredient not in self.ingredients:
                return "Errore"
            

manager = RecipeManager()
print(manager.create_recipe("Pizza margherita", ["Farina", "Acqua", "Lievito", "Pomodoro", "Mozzarella"]))
print(manager.add_ingredient("Pizza Margherita", "Basilico"))
print(manager.remove_ingredient("Pizza Margherita", "Acqua"))
print(manager.update_ingredient("Pizza Margherita", "Mozzarella", "Mozzarella di Bufala"))
print(manager.list_recipes())
print(manager.list_ingredients("Pizza Margherita"))
print(manager.search_recipe_by_ingredient("Farina"))


#esercizio 3

class Veicolo:
    
    def __init__(self, marca:str, modello:str, anno:int):
        
        self.marca = marca
        self.modello = modello
        self.anno = anno
    
    def descrivi_veicolo(self):
        
        print(f"Marca: {self.marca}, Modello: {self.modello}, Anno: {self.anno}")

class Auto(Veicolo):
    
    def __init__(self, marca, modello, anno, numero_porte:int):
        super().__init__(marca, modello, anno)
        self.numero_porte = numero_porte
    
    def descrivi_veicolo(self):
        
        print(f"Marca: {self.marca}, Modello: {self.modello}, Anno: {self.anno}, Numero di porte: {self.numero_porte}")

class Moto(Veicolo):
    
    def __init__(self, marca, modello, anno, tipo:str):
        super().__init__(marca, modello, anno)
        self.tipo = tipo
    
    def descrivi_veicolo(self):
        
        print(f"Marca: {self.marca}, Modello: {self.modello}, Anno: {self.anno}, Tipo: {self.tipo}")

#esercizio 4

class Specie:

    def __init__(self, nome:str, popolazione:int, tasso_crescita:float):

        self.nome = nome
        self.popolazione = popolazione
        self.tasso_crescita = tasso_crescita

    def cresci(self):

        self.popolazione_attuale = self.popolazione
        popolazione_nuova = self.popolazione_attuale * (1 + self.tasso_crescita/100)
        return popolazione_nuova
    
    def anni_per_superare(self, altra_specie):
        anni = 0
        while self.popolazione <= altra_specie.popolazione and anni < 1000:
            self.aggiorna_popolazione()
            altra_specie.aggiorna_popolazione()
            anni += 1
        if anni == 1000:
            return -1 
        return anni
    
    def getDensita(self,area_kmq:float):
        anni = 0
        densità = self.popolazione / area_kmq
        while densità < 1 and anni < 1000:
            self.aggiorna_popolazione()
            anni += 1
        if anni == 1000:
            return -1
        return anni

class BufaloKlingon(Specie):

    def __init__(self, popolazione: int, tasso_crescita: float):
        super().__init__(popolazione, tasso_crescita)

        self.nome = "Bufalo Klingon"

class Elefante(Specie):

    def __init__(self, popolazione: int, tasso_crescita: float):
        super().__init__(popolazione, tasso_crescita)

        self.nome = "Elefante"
    

bufalo_klingon = BufaloKlingon(100, 15)
elefante = Elefante(10, 35)

anni_necessari = elefante.anni_per_superare(bufalo_klingon)  # Calcola gli anni necessari affinché gli elefanti superino i bufali Klingon
print(f"Anni necessari perché la popolazione di elefanti superi quella dei bufali Klingon: {anni_necessari}")



