class MainS {//es la clase MainS
    public static void main(String[] args) { //es el metodo main
       Suma a = new Suma(); //es el constructor de la clase Suma
       a.setNum1(2);//es el metodo setNum1
       a.setNum2(3);//es el metodo setNum2
       System.out.println(a.getNum1()+a.getNum2());//es el metodo getNum1
       Suma b = new Suma();//es el constructor de la clase Suma
       b.setNum1(4);//es el metodo setNum1
       b.setNum2(5);//es el metodo setNum2
       System.out.println(b.getNum1()+b.getNum2());//es el metodo getNum1
    }//termina el metodo main
}//termina la clase MainS