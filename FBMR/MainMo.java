class MainMo { //es la clase MainModulo
    public static void main(String[] args) { //es el metodo main
        Modul a = new Modul(); //es el constructor de la clase Modul
        a.setNum1(13); //es el metodo setNum1
        a.setNum2(2); //es el metodo setNum2
        System.out.println(a.getNum1()%a.getNum2()); //es el metodo getNum1
        Modul b = new Modul(); //es el constructor de la clase Modulo
        b.setNum1(17); //es el metodo setNum1
        b.setNum2(3); //es el metodo setNum2
        System.out.println(b.getNum1()%b.getNum2()); //es el metodo getNum1
    } // termina el metodo main
}   // termina la clase MainModulo