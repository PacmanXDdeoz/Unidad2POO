class MainS{
    public static void main(String[] args){
        Suma s = new Suma();
        Suma s2 = new Suma();
        s.setNumero(38);
        s.setSumar(5);
        System.out.println(s.getNumero()+s.getSumar());
        s2.setNumero(38);
        s2.setSumar(5);
        System.out.println(s2.getNumero()+s2.getSumar());
    }
}