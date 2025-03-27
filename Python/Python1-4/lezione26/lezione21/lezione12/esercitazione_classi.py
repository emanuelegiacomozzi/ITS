class Libro:

    def __init__(self, titolo:str, autore:str, stato_prestito = "Disponibile"):
        self.titolo = titolo
        self.autore = autore
        self.stato_prestito = stato_prestito
    def __str__(self):
        return f"Libro = {self.titolo}, autore = {self.autore}, stato_libro = {self.stato_prestito}"

class Biblioteca:

    def __init__(self):
        self.catalogo = []
        
    def aggiungi_libro(self, libro:str):
        self.libro = libro
        self.catalogo.append(libro)
        return f"{libro.titolo} aggiunto al catalogo"
    
    def presta_libro(self, titolo:Libro):
        for libro in self.catalogo:
            if libro.titolo == titolo and libro.stato_prestito == "Disponibile":
                libro.stato_prestito = "Prestato"
                return f"{titolo} prestato"
            else:
                return f"{titolo} non disponibile"
    
    def restituisci_libro(self, titolo:Libro):
        for libro in self.catalogo:
            if libro.titolo == titolo and libro.stato_prestito == "Prestato":
                libro.stato_prestito = "Disponibile"
                return f"{titolo} restituito"
            else:
                return f"{titolo} non in prestito"
    
    def mostra_libri(self):
        libri_disponibili = []
        for libro in self.catalogo:
            if libro.stato_prestito == "Disponibile":
                libri_disponibili.append(libro.titolo)
        if libro.titolo in libri_disponibili:
            return "Libri disponibili:\n" + "\n".join(libri_disponibili)
        else:
            return "Nessun libro disponibile"


biblioteca = Biblioteca()

libro1 = Libro("Lord of the rings", "Paolo" )
print(libro1)

libro2 = Libro("Harry Potter", "Paolo")
print(libro2)

libro3 = Libro("Mia", "Pina")
print(libro3)


print(biblioteca.aggiungi_libro(libro1))
print(biblioteca.aggiungi_libro(libro2))
print(biblioteca.aggiungi_libro(libro3))


print(biblioteca.presta_libro("Lord of the rings"))

print(biblioteca.mostra_libri())

print(biblioteca.restituisci_libro("Lord of the rings"))

print(biblioteca.mostra_libri())

print(biblioteca.presta_libro("Harry Potter"))

print(biblioteca.restituisci_libro("Mia"))

print(biblioteca.mostra_libri())


#Catalogo Film

class MovieCatalog:

    def __init__(self):

        self.catalogo:dict[str,list[str]] = {}
        
    
    def add_movie(self, director_name:str, movies:list):
        if director_name in self.catalogo:
            self.catalogo[director_name].extend(movies)
        else:
            self.catalogo[director_name] = movies
    
    def remove_movie(self, director_movie:str, movie_name:str):
        if director_movie in self.catalogo:
            if movie_name in self.catalogo[director_movie]:
                self.catalogo[director_movie].remove(movie_name)
            elif not self.catalogo[director_movie]:
                del self.catalogo[director_movie] 
        return f"{movie_name} eliminato dal catalogo"
    
    def list_directors(self):
        return self.catalogo.keys()
    
    def get_movies_by_director(self, director_name:str):
        if director_name in self.catalogo:
            return self.catalogo[director_name]
        else:
            return f"{director_name} non presente nel catalogo"

    def search_movies_by_title(self, title:str):
        result = {}
        for director_name,movies in self.catalogo.items():
            matching_movies = []
            for movie in movies:
                if title.lower() in movie.lower():
                    matching_movies.append(movie)
            if matching_movies:
                    result[director_name] = matching_movies
        if result:
            return result
        
    def catalogo_completo(self):
        return self.catalogo
        
            
catalogo = MovieCatalog()

catalogo.add_movie("Nolan", ["Inception"])
catalogo.add_movie("Nolan", ["Memento", "The Prestige"])
catalogo.add_movie("Tarantino", ["Il Padrino |", "Il Padrino ||"])

print(catalogo.remove_movie("Nolan","Inception"))

print("Catalogo: " , catalogo.catalogo_completo())

print("Registi: ", catalogo.list_directors())

print(catalogo.get_movies_by_director("Tarantino"))

print(catalogo.search_movies_by_title("|"))

