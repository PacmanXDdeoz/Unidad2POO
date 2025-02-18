public class MainS {//clase

    public static void main(String[] args) {//metodo principal
        Suma sum =new Suma();//creacion de mi nuevo objeto con el nombre de sum
        Suma sum2 =new Suma();//creacion de mi nuevo objeto con el nombre de sum2

        sum.setNum(500);//almacenar el valor de 500 en mi objeto 
        sum.setNum2(174);//almacenar el valor de 174 en mi objeto 
        System.out.println(sum.getNum()+sum.getNum2());//impresion del mensaje junto con la operacion dentro

        sum2.setNum(178);//almacenar el valor de 178 en mi objeto
        sum2.setNum2(145);//almacenar el valor de 145 en mi objeto
        System.out.println(sum2.getNum()+sum2.getNum2());//impresion del mensaje junto con la operacion dentro
    }
}