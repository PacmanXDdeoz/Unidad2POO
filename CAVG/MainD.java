class MainD{
    public static void main(String[] args){
        Division d = new Division();
        Division d2 = new Division();
        d.setNumerador(10);
        d.setDenominator(2);
        System.out.println(d.getNumerador()/d.getDenominator());
        d2.setNumerador(10);
        d2.setDenominator(2);
        System.out.println(d2.getNumerador()/d2.getDenominator());
    }
}