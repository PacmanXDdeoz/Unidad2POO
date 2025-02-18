public class MainD {//clase

    public static void main(String[] args) {//metodo principal
        Division div =new Division();//creacion de mi nuevo objeto con el nombre de div
        Division div2 =new Division();//creacion de mi nuevo objeto con el nombre de div2

        div.setNum(17);//almacenar el valor de 17 en mi objeto div
        div.setNum2(7);//almacenar el valor de 7 en mi objeto div
        System.out.println(div.getNum()/div.getNum2());//impresion de la operacion

        div2.setNum(47);//almacenar el valor de 47 en mi objeto div2
        div2.setNum2(4);//almacenar el valor de 4 en mi objeto div2
        System.out.println(div2.getNum()/div2.getNum2());//impresion de la operacion 
    }
}