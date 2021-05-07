package Kontrolltöö;

public class Ioon implements LiidesIoon {
    String nimetus;
    Double aatomMassideSumma;
    int laeng;
    public Ioon(String nimetus, Double aatomMassideSumma, int laeng ){
        this.nimetus = nimetus;
        this.aatomMassideSumma=aatomMassideSumma;
        this.laeng= laeng;
    }
    public String kysiNimi(){
        return nimetus;
    }
    public Double kysiAatomMassideSumma(){
        return aatomMassideSumma;
    }
    public int kysiLaeng(){
        return laeng;
    }
    public String kysiMisTyypi(){
        if(laeng<0d){return " See on negatiivse elektrilaenguga ioon";}
        if(laeng>0d){return " See on positiivse elektrilaenguga ioon";}
        else{return "ioon";}
    }
}

    

