import random

def posizioni(posizione_t, posizione_h):
    percorso = ['_']*70
    if posizione_t == posizione_h and posizione_t >= 1:
            percorso[posizione_t - 1] = 'OUCH!!!'
    else:
        if posizione_h >= 1:
            percorso[posizione_h - 1] = 'H'
        if posizione_t >= 1:
            percorso[posizione_t - 1] = 'T'
    print(''.join(percorso))

def mosse_tartaruga(tartaruga,energia_t):
    i:int = random.randint(1,10)
    if 1 <= i <= 5:
        if energia_t >= 5:
            tartaruga -= 3
            energia_t -= 5
    elif 6 <= i <= 7:
        if energia_t >= 10:
            tartaruga -= 6
            energia_t -= 10
    elif 8 <= i <= 10:
        if energia_t >= 3:
            tartaruga += 1
            energia_t -= 3
    if tartaruga < 1:
        tartaruga = 1
    if tartaruga > 70:
        tartaruga = 70
    if energia_t > 100:
        energia_t = 100
    return tartaruga, energia_t



def mosse_lepre(lepre,energia_h):
    i:int = random.randint(1,10)
    lepre = 0
    if 1 <= i <= 2:
        energia_h += 10
    elif 3 <= i <= 4:
        if energia_h >= 15:
            lepre += 9
            energia_h -= 15
    elif i == 5:
        if energia_h >= 20:
            lepre -= 12
            energia_h -= 20
    elif 6 <= i <= 8:
        if energia_h >= 5:
            lepre += 1
            energia_h -= 5
    elif 9 <= i <= 10:
        if energia_h >= 8:
            lepre -= 2
            energia_h -= 8
    if lepre < 1:
        lepre = 1
    if lepre > 70:
        lepre = 70
    if energia_h > 100:
        energia_h = 100
    return lepre, energia_h

def gara():
    energia_t = 100
    energia_h = 100
    posizione_t = 1
    posizione_h = 1
    print("'BANG !!!!! AND THEY'RE OFF !!!!!'")

    while True:
        posizione_t, energia_t = mosse_tartaruga(posizione_t, energia_t)
        posizione_h, energia_h = mosse_lepre(posizione_h,energia_h)
        posizioni(posizione_t, posizione_h)
        print(f"Energia Tartaruga: {energia_t}\nEnergia lepre: {energia_h}")
        if posizione_h >= 70 and posizione_t >= 70:
            print("IT'S A TIE.")
            break
        elif posizione_t >= 70:
            print("TORTOISE WINS! || VAY!!!")
            break
        elif posizione_h >= 70:
            print("HARE WINS || YUCH!!!")
            break
        
gara()




