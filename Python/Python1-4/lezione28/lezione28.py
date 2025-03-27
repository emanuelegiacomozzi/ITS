import os #operative system
import PyPDF2

lTextExtensions = [".txt", ".py", ".js", ".csv", "json"]

def CercaStringaInNomefile(sFile,sStringa):
    #mettiamo tutto a minuscolo
    sFileLower = sFile.lower()
    sStringaLower = sStringa.lower()

    #usiamo sFileLower.find() che torna -1 se la parola non c'è e la pos altrimenti
    if(sFileLower.find(sStringaLower)>=0):
        return True
    else:
        return False
    #torniamo true oppure false
    
def CercaStringaInTextFile(sFile, sStringa):
    iRet = -1
    with open(sFile, "r") as file1:
        sRiga = file1.readline()
        while (len(sRiga)>0):
            iRet= sRiga.lower().find(sStringa.lower())
            if(iRet >= 0):
                return True
            sRiga = file1.readline()
    return False

def CercaStringaInPdfFile(sFile,sString):
	object = PyPDF2.PdfReader(sFile)
	numPages = len(object.pages)
	for i in range(0, numPages):
		pageObj = object.pages[i]
		text = pageObj.extract_text()
		text = text.lower()
		if(text.find(sString)!=-1):
			return True
	return False

def CercaStringaInContenutoFile(sPathFile,sStringa):
    bRet = False
    sOutFileName,sOutFileExt = os.path.splitext(sPathFile) #divido pathfile in due(split) es: lettera.PDF---> lettera(sOutFileName) pdf(sOutFileExt)
    if sOutFileExt.lower() in lTextExtensions:
        bRet = CercaStringaInTextFile(sPathFile,sStringa)
    if sOutFileExt.lower() == ".pdf":
        bRet = CercaStringaInPdfFile(sPathFile,sStringa)
    return bRet

sRoot = input("Inserisci directory in cui cercare")
sParola = input("Inserisci parola da cercare")
sOutDir = input("Inserisci directory di output")

NumFileTrovati = 0
for root,dirs,files in os.walk(sRoot):
    print(f"Sto guardando {root} che contiene {len(dirs)} subdir e {len(files)} file")
    for file in files:
        print(f"Devo vedere se {file} contiene {sParola}")
        bRet = CercaStringaInNomefile(file,sParola)
        if bRet  == True:
            NumFileTrovati += 1
        else:
            sFilePathCompleto = os.path.join(root,file)
            bRet = CercaStringaInContenutoFile(sFilePathCompleto,sParola)
            if(bRet==True):
                NumFileTrovati += 1
        if(bRet == True):
            print("Trovata parola in file " + file)
print(f"Ho trovato {NumFileTrovati} files")