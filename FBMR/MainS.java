class MainS {
    public static void main(String[] args) {
       Suma a = new Suma();
       a.setNum1(2);
       a.setNum2(3);
       System.out.println(a.getNum1()+a.getNum2());
       Suma b = new Suma();
       b.setNum1(4);
       b.setNum2(5);
       System.out.println(b.getNum1()+b.getNum2());
    }
}