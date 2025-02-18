public class MainMp {//clase

    public static void main(String[] args) {//metodo principal
        Modulo mod =new Modulo();//creacion de mi nuevo objeto con el nombre de mod
        Modulo mod2 =new Modulo();//creacion de mi nuevo objeto con el nombre de mod2

        mod.setNum(87);//almacenar el valor de 87 en mi objeto mod
        mod.setNum2(4);//almacenar el valor de 4 en mi objeto mod
        System.out.println(mod.getNum()%mod.getNum2());//impresion de la operacion

        mod2.setNum(477);//almacenar el valor de 477 en mi objeto mod2
        mod2.setNum2(65);//almacenar el valor de 64 en mi objeto mod2
        System.out.println(mod2.getNum()%mod2.getNum2());//impresion de la operacion 
    }
}