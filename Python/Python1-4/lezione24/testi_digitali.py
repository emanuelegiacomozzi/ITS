class Documento:

    def __init__(self, testo:str):

        self.testo = testo
    
    def getText(self):

        return self.testo
    
    def setText(self, testo:str):

        self.testo = testo
    
    def isInText(self, parola:str):

        if parola in self.testo:
            return True
        return False
    
documento = Documento("Ciao sono emanuele giacomozzi, ho 20 anni e frequento l'ITS")
documento.setText("Ciao sono emanuele giacomozzi, ho 20 anni e frequento l'ITS")
print(documento.getText())
print(documento.isInText("anni"))

class Email(Documento):

    def __init__(self, testo: str, mittente:str, destinatario:str, titolo:str):
        super().__init__(testo)

        self.mittente = mittente
        self.destinatario = destinatario
        self.titolo = titolo
    
    def getMittente(self):
        
        return self.mittente
    
    def setMittente(self, mittente:str):

        self.mittente = mittente
    
    def getDestinatario(self):

        return self.destinatario

    def setDestinatario(self, destinatario:str):

        self.destinatario = destinatario

    def getTitolo(self):

        return self.titolo

    def setTitolo(self, titolo:str):

        self.titolo = titolo

    def getText(self):

        return f"Da:{self.mittente}, A:{self.destinatario}\nTitolo:{self.titolo}\nMessaggio:{self.testo}"

email = Email("Ciao sono emanuele", "mario@gmail.com", "marco@gmail.com", "Mi presento")
print(email.getText())

class File(Documento):
    
    def __init__(self, testo: str, nomePercorso:str):
        super().__init__(testo)
        self.nomePercorso = nomePercorso
    
    
        