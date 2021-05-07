package kontrolltöö;

public class Ioon implements LiidesIoon {
    String nimetus;
    Double aatomMassideSumma;
    Double laeng;
    public Ioon(String nimetus, Double aatomMassideSumma, Double laeng ){
        this.nimetus = nimetus;
        this.aatomMassideSumma=aatomMassideSumma;
        this.laeng= laeng;
    }
    public String kysiNimetus(){
        return nimetus;
    }
    public Double kysiAatomMassideSumma(){
        return aatomMassideSumma;
    }
    public Double kysiLaeng(){
        return laeng;
    }
    public String kysiMisTyypi(){
        if(laeng<0){return " See on negatiivse elektrilaenguga ioon";}
        if(laeng>0){return " See on positiivse elektrilaenguga ioon";}
        else{return "ioon";}
    }
}

    

