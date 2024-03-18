public class extended_calculator extends Calculator{
    
     public int Square(int num1){
        int sq=num1*num1;
        return sq;
    }

    public int Cube(int num1){
        int cb=num1*num1*num1;
        return cb;
    }
    public static void main(String[] args){
        extended_calculator c=new extended_calculator();

        int add=c.Addition(10, 5);
        int sub=c.Substraction(20, 5);
        int mul=c.Multiplication(2,10);
        int sq=c.Square(5);
        int cb=c.Cube(7);

        System.out.println("Calculator:");
        System.out.println("Addition:"+add);
        System.out.println("substraction:"+sub);
        System.out.println("Multiplication:"+mul);
        System.out.println("Square:"+sq);
        System.out.println("Cube:"+cb);

    }
}
