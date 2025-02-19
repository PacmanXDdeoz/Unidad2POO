class MainMu{ //es la clase MainMu
    public static void main(String[] args) { //es el metodo main
        Multi a = new Multi(); //es el constructor de la clase Multi
        a.setNum1(2); //es el metodo setNum1
        a.setNum2(3); //es el metodo setNum2
        System.out.println(a.getNum1()*a.getNum2()); //es el metodo getNum1
        Multi b = new Multi(); //es el constructor de la clase Multiplicador
        b.setNum1(4); //es el metodo setNum1
        b.setNum2(5); //es el metodo setNum2
        System.out.println(b.getNum1()*b.getNum2()); //es el metodo getNum1
    } // termina el metodo main
}   // termina la clase MainMu 