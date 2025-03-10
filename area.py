import math
class area:

        
    def circulo(self,radio):
        return math.pi * radio * radio

    def rectangulo(self, base, altura):
        return base * altura

    def triàngulo_rect(self, base, altura):
        return (base * altura)/2

    def trapecio(self, a, base, altura):
        return ((a + base)/2) * altura

    def pentagono(self, perimetro, apotema):
        return 3 * perimetro * apotema


f1 = area()
f2 = area()
f3 = area()
f4 = area()
f5 = area()

print("circulo: ",f1.circulo(1))
print("rectangulo: ",f2.rectangulo(2.3,8.0))
print("triàngulo rect: ",f3.triàngulo_rect(4.3,2.1))
print("trapecio: ",f4.trapecio(4.1,2.3,6.1))
print("hexagono: ",f5.pentagono(3.3,4.0))