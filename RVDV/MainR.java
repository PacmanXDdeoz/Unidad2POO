public class MainR {//clase

    public static void main(String[] args) {//metodo principal
        Resta rest =new Resta();//creacion de mi nuevo objeto con el nombre de rest
        Resta rest2 =new Resta();//creacion de mi nuevo objeto con el nombre de rest2

        rest.setNum(45);//almacenar el valor de 45 en mi objeto rest
        rest.setNum2(47);//almacenar el valor de 47 en mi objeto rest
        System.out.println(rest.getNum()-rest.getNum2());//impresion del mensaje

        rest2.setNum(12);//almacenar el valor de 12 en mi objeto rest2
        rest2.setNum2(1045);//almacenar el valor de 1045 en mi objeto rest2
        System.out.println(rest2.getNum()-rest2.getNum2());//impresion del mensaje
    }
}