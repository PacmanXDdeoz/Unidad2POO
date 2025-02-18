class MainR{
    public static void main(String[] args){
        Resta r = new Resta();
        Resta r2 = new Resta();
        r.setNumero(36);
        r.setNumero2(5);
        System.out.println(r.getNumero()-r.getNumero2());
        r2.setNumero(6);
        r2.setNumero2(28);
        System.out.println(r2.getNumero()-r2.getNumero2());
    }
}