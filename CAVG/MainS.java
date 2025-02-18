class MainS{
    public static void main(String[] args){
        Suma s = new Suma();
        Suma s2 = new Suma();
        s.setNumerador(10);
        s.setSumar(2);
        System.out.println(s.getNumerador()+s.getSumar());
        s2.setNumerador(10);
        s2.setSumar(2);
        System.out.println(s2.getNumerador()+s2.getSumar());
    }
}