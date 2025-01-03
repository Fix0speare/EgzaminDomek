import random
#Nie obiektowo, ale zrobione
def stworzTablice():
    tab=[]
    for x in range(0,50):
        tab.append(random.randint(1,100))
    return tab

def znajdzWartosc():
    x = int(input("Podaj wartość, którą chcesz znaleźć: "))
    tablica = stworzTablice()
    tablica.append(x)
    for y in range(0,len(tablica)):
        if tablica[y]==x:
            if y==(len(tablica)-1):
                print(tablica)
                return print("Trafiłeś na wartownika, szukany element nie występuje w liscie")
            else:
                print(tablica)
                return print("Szukany element znajduje się w liście - numer indeksu: "+ str(y))
        else:
            pass
print(znajdzWartosc())
