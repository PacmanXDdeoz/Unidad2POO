public class MainM {//clase 

    public static void main(String[] args) {//metodo principal
        Multiplicacion mul =new Multiplicacion();//creacion de mi nuevo objeto con el nombre de mul
        Multiplicacion mul2 =new Multiplicacion();//creacion de mi nuevo objeto con el nombre de mul2

        mul.setNum(478);//almacenar el valor de 478 en mi objeto mul
        mul.setNum2(69);//almacenar el valor de 69 en mi objeto mul
        System.out.println(mul.getNum()*mul.getNum2());//impresion de la operacion

        mul2.setNum(47);//almacenar el valor de 478 en mi objeto mul2
        mul2.setNum2(2);//almacenar el valor de 478 en mi objeto mul2
        System.out.println(mul2.getNum()*mul2.getNum2());//impresion de la operacion
    }
}