class MainD{
    public static void main(String[] args){
        Division d = new Division();
        Division d2 = new Division();
        d.setNumero(10);
        d.setNumero2(16);
        System.out.println(d.getNumero()/d.getNumero2());
        d2.setNumero(10);
        d2.setNumero2(24);
        System.out.println(d2.getNumero()/d2.getNumero2());
    }
}