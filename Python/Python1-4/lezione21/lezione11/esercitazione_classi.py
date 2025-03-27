#cinema 1--->N sale 
#sala -----> film
class Film:

    def __init__(self, titolo:str, durata:int):
        self.titolo = titolo
        self.durata = durata
    
    def __str__(self):
        return f"Titolo: {self.titolo}\nDurata film: {self.durata}"

class Sala:

    def __init__(self, id:int, film:str, posti_totali:int):
        self.id = id
        self.film = film
        self.posti_totali = posti_totali
        self.posti_prenotati = 0

    def prenota_posti(self, num_posti:int):
        if num_posti <= self.posti_totali - self.posti_prenotati:
            self.posti_prenotati += num_posti
            return f"{num_posti} posti prenotati per il film '{self.film}' nella sala {self.id}."
        else:
            return "Errore: posti insufficienti disponibili."
    
    def posti_disponibili(self):
         self.posti_totali - self.posti_prenotati
         return f"Posti ancora disponibili: {self.posti_totali}"

    def __str__(self):
        return f"ID sala:{self.id}\nFilm in programmazione: {self.film}\nPosti Sala: {self.posti_totali}\nPosti prenotati: {self.posti_prenotati}"
    
class Cinema:

    def __init__(self):
        self.sale = []
    
    def aggiungi_sala(self, sala:Sala):
        self.sale.append(sala)

    def prenota_film(self, titolo_film:Film, num_posti:Sala):
        for sala in self.sale:
            if sala.film == titolo_film:
                return sala.prenota_posti(num_posti)
            else:
                return "Film non trovato."
    
film1 = Film("Inception", 205)
film2 = Film("Matrix", 195)

sala1 = Sala(1234, film1, 40)
sala2 = Sala(1235, film2, 35)
print(sala1)
print(sala2)

sala1.prenota_posti(1)
sala2.prenota_posti(4)
print(sala1.posti_disponibili())
print(sala2.posti_disponibili())

cinema = Cinema()
cinema.aggiungi_sala(sala1)
cinema.aggiungi_sala(sala2)
#print(cinema.prenota_film("Inception", 40))
#print(cinema.prenota_film("Matrix", 40))


#esercizio Magazzino

class Prodotto:

    def __init__(self, nome:str, quantità:int):
        self.nome = nome
        self.quantità = quantità
    
    def describe_magazzino(self):
        for prodotto in self.prodotti:
            print(prodotto)

    def __str__(self):
        return f"\nProdotto: {self.nome}\nQuantità: {self.quantità}"

class Magazzino:

    def __init__(self):
        self.prodotti = []
    
    def add_prodotto(self, prodotto:Prodotto):
        self.prodotto = prodotto
        self.prodotti.append(prodotto)
    
    def cerca_prodotto(self, nome:str):
        for prodotto in self.prodotti:
            if prodotto.nome == nome:
                return prodotto
            else:
                return None
    
    def verifica_disponibilità(self, nome:str):
        prodotto = self.cerca_prodotto(nome)
        if prodotto in self.prodotti:
            return f"{prodotto.nome} presente nel magazzino in quantità {prodotto.quantità}"
        else:
            return f"{prodotto.nome} non disponibile"

magazzino = Magazzino()

prodotto1 = Prodotto("Banana", 30)
prodotto2 = Prodotto("Fragola", 40)
print(prodotto1)
print(prodotto2)

magazzino.add_prodotto(prodotto1)
magazzino.add_prodotto(prodotto2)

print(magazzino.cerca_prodotto("Fragola"))

print(magazzino.verifica_disponibilità("Banana"))
