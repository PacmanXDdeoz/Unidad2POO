class MainR {
    public static void main(String[] args) {
        Resta a = new Resta();
        a.setNum1(2);
        a.setNum2(3);
        System.out.println(a.getNum1()-a.getNum2());
        Resta b = new Resta();
        b.setNum1(4);
        b.setNum2(5);
        System.out.println(b.getNum1()-b.getNum2());
    }
}