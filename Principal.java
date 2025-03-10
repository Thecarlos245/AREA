



public class Principal {
    
    double area(double radio) {
        return Math.PI * radio * radio; //circulo
    }
    
    double area(double base, double altura) {
        return base * altura;  //rectangulo
    }
    double area(float base, double altura) {
        return   (base * altura)/2 ;  // trianglo rect 
    }
    
    double area(float a, float base,double altura) {
        return ((a + base)/2) * altura; // trapecio
    }
    float area(float pentagono, float apotema) {
        return 3 * pentagono * apotema;  //hexagono
    }
    
  


    public static void main(String[] args) {
         Principal f1 = new Principal();
         Principal f2 = new Principal();
         Principal f3 = new Principal();
         Principal f4 = new Principal();
         Principal f5 = new Principal();
         
            System.out.println("circulo: " + f1.area(1));
            System.out.println("rectangulo: " + f2.area(2.3,8.0));
            System.out.println("triangulo rect : " + f3.area(4.3f,2.1));
            System.out.println("trapecio: " + f4.area(4.1f,2.3f,6.1));
            System.out.println("hexagono: " + f5.area(3.3f,4.0f));
            
          
       
    }
    
}
