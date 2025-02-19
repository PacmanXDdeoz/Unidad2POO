class MainMulti{
    public static void main(String[] args){
        Multiplicacion m = new Multiplicacion();
        Multiplicacion m2 = new Multiplicacion();
        m.setNumerador(10);
        m.setDivisor(2);
        System.out.println(m.getNumerador()*m.getDivisor());
        m2.setNumerador(10);
        m2.setDivisor(2);
        System.out.println(m2.getNumerador()*m2.getDivisor());
    }
}