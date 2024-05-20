public class MetodosTv{
    boolean ligada= false;
    int canal = 1;
    int volume = 25;


    public void mudarDeCanalMais(){
        canal++
    }
    public void mudarDeCanalMenos(){
        canal--
    }
    public void aumentarVolume(){
        volume++
    }
    public void diminuirVolume(){
        volume--
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

}