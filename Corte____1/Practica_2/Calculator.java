package calculator;


public class Calculator {

  public int x1,x2;
  // construtor (es lo mismo que la clase)(no se usa return)
  public Calculator(int a, int b){

x1=a ;
x2=b ;
}

  public int add(){
      return x1 + x2;
  }
  
  public int subs(){
      return x1 - x2;
  }
  
 
    public int mul(){
      return x1 * x2;
  }
    public int mul2(){
      return x1 / x2;
  }
  //Metodo Principal
    
    public static void main(String[] args) {
    Calculator m = new Calculator (4,2);
    Calculator n = new Calculator (9,3);
    
    System.out.println(" La resta de las variables m es: " + m.subs());
    System.out.println(" La suma de las variables m es: " + m.add());
    System.out.println(" El producto de las variables m es: " + m.mul());
    System.out.println(" La division de las variables m es: " + m.mul2());
    
        System.out.println(n.add());



    }
    
}
