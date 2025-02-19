class MainDi { //es la clase MainDivisor
    public static void main(String[] args) { //es el metodo main
        Div a = new Div(); //es el constructor de la clase Divisor
        a.setNum1(10); //es el metodo setNum1
        a.setNum2(2); //es el metodo setNum2
        System.out.println(a.getNum1()/a.getNum2()); //es el metodo getNum1
        Div b = new Div(); //es el constructor de la clase Divisor
        b.setNum1(12); //es el metodo setNum1
        b.setNum2(3); //es el metodo setNum2
        System.out.println(b.getNum1()/b.getNum2()); //es el metodo getNum1
    } // termina el metodo main
}   // termina la clase MainDivisor