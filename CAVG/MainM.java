class MainM{
    public static void main(String[] args){
        Modulo m = new Modulo();
        Modulo m2 = new Modulo();
        m.setNumerador(10);
        m.setDivisor(2);
        System.out.println(m.getNumerador()%m.getDivisor());
        m2.setNumerador(10);
        m2.setDivisor(2);
        System.out.println(m2.getNumerador()%m2.getDivisor());
    }
}