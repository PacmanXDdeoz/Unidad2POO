class MainR { //es la clase MainR
    public static void main(String[] args) { //es el metodo main
        Resta a = new Resta(); //es el constructor de la clase Resta
        a.setNum1(2); //es el metodo setNum1
        a.setNum2(3); //es el metodo setNum2
        System.out.println(a.getNum1()-a.getNum2());//es el metodo getNum1
        Resta b = new Resta();//es el constructor de la clase Resta
        b.setNum1(4);//es el metodo setNum1
        b.setNum2(5);//es el metodo setNum2
        System.out.println(b.getNum1()-b.getNum2());//es el metodo getNum1
    }//termina el metodo main
}//termina la clase MainR