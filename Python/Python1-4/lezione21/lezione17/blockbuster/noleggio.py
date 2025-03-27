from movie_genre import Azione, Commedia, Drama

class Noleggio:

    def __init__(self, film_list:list[str]):

        self.film_list = film_list
        self.rented_film:dict = {}
    
    def isAvaible(self, film:str):

        if film not in self.film_list:
            print(f"Il film scelto non è disponibile: {film}! ")
            return False
        if film in self.film_list:
            print(f"Il film scelto è disponibile: {film}!")
            return True
        
    def rentAMovie(self, film:str, clientID:str):

        if film in self.film_list and self.isAvaible(film):
            self.film_list.remove(film)
            if clientID in self.rented_film:
                self.rented_film[clientID].append(film)
            else:
                self.rented_film[clientID] = [film]
            print(f"Il cliente {clientID} ha noleggiato {film}!")
        else:
            print(f"Non è possibile noleggiare il film {film}!")
    
    def giveBack(self, film:str, clientID:str, days:int):

        if clientID in self.rented_film and film in self.rented_film[clientID]:
            self.rented_film[clientID].remove(film)
            self.film_list.append(film)
            penale = film.calcolaPenaleRitardo(days)
            print(f"Cliente: {clientID}! La penale da pagare per il film {film} è di {penale} euro!")
    
    def printMovies(self):

        for film in self.film_list:

            print(f"{film}-{film.getGenere()}-")

    def printRentMovies(self, clientID):

        for film in self.rented_film[clientID]:

            print(film)