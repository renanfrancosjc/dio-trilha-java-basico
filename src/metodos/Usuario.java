public class Usuario{
    public static void main(String[] args) throws Exception{
        MetodosTv metodosTv = new MetodosTv();

        metodosTv.diminuirVolume();
        metodosTv.diminuirVolume();
        metodosTv.diminuirVolume();
        metodosTv.diminuirVolume();

        System.out.println("on | off " + metodosTv.ligada);
        System.out.println("Canal " + metodosTv.canal);
        System.out.println("Volume " + metodosTv.volume);

        metdosTv.ligar();
        System.out.println("on | off " + metodosTv.ligada);

        metodosTv.desligar();
        System.out.println("on | off " + metodosTv.ligada);

    }
}