class Media:

    def __init__(self, title:str):
        self.title = title
        self.reviews:list[int] = []
    
    def set_title(self, title):
        self.title = title
    
    def get_title(self):
        return f"Media title: {self.title}"
    
    def aggiungiValutazione(self, voto:int):
        if voto >= 1 and voto <= 5:
            self.reviews.append(voto)
            return self.reviews
        else:
            return f"{voto} è un voto non valido"
    
    def getMedia(self):
        self.somma = sum(self.reviews)
        self.media = self.somma / len(self.reviews)
        return f"Voto medio: {self.media}"
    
    def getRate(self):
        if self.media == 1:
            return f"Giudizio: Terribile"
        if self.media > 1 and self.media <=2:
            return f"Giudizio: Brutto"
        if self.media > 2 and self.media <= 3:
            return f"Giudizio: Normale"
        if self.media > 3 and self.media <= 4:
            return f"Giudizio: Bello"
        if self.media > 4 and self.media <= 5:
            return "Giudizio: Grandioso"
    
    def ratePercentage(self, voto:int):
        self.percentage = self.reviews.count(voto)
        return self.percentage * 100 / len(self.reviews)
                                
        
    
    def recensione(self):
        print(f"Titolo del film: {self.title}")
        print(f"Voto Medio: {self.media}")
        print(f"{self.getRate()}")
        print(f"Terribile: {self.ratePercentage(1)}\nBrutto: {self.ratePercentage(2)}\nNormale: {self.ratePercentage(3)}\nBello: {self.ratePercentage(4)}\nGrandioso: {self.ratePercentage(5)}")



class Film(Media):

    def __init__(self, title: str):
        super().__init__(title)

film1 = Film("Harry Potter")
film1.set_title("Harry Potter")
film1.get_title
film1.aggiungiValutazione(1)
film1.aggiungiValutazione(2)
film1.aggiungiValutazione(3)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(5)
film1.aggiungiValutazione(5)
film1.aggiungiValutazione(5)
film1.aggiungiValutazione(5)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(2)
film1.getMedia()
film1.getRate()
film1.recensione()
print()
print("####################################################")
print()
film2 = Film("Cars")
film1.set_title("Cars")
film1.get_title
film1.aggiungiValutazione(2)
film1.aggiungiValutazione(3)
film1.aggiungiValutazione(3)
film1.aggiungiValutazione(3)
film1.aggiungiValutazione(3)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(4)
film1.aggiungiValutazione(5)
film1.getMedia()
film1.getRate()
film1.recensione()


