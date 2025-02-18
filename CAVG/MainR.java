class MainR{
    public static void main(String[] args){
        Resta r = new Resta();
        Resta r2 = new Resta();
        r.setNumerador(10);
        r.setSubstraer(2);
        System.out.println(r.getNumerador()-r.getSubstraer());
        r2.setNumerador(10);
        r2.setSubstraer(2);
        System.out.println(r2.getNumerador()-r2.getSubstraer());
    }
}