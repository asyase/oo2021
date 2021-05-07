package kontrolltöö;
import java.lang.Math;

    public class Aine implements LiidesAine {
        String nimetus;
        Double aineMass;
        Double laeng;
        public Aine(Ioon I, Ioon II){

    if(I.kysiLaeng() + II.kysiLaeng() == 0 ){
        nimetus = I.kysiNimetus() + II.kysiNimetus();
        aineMass = I.kysiAatomMassideSumma() + II.kysiAatomMassideSumma();
        laeng = 0d; 
    } else {
        nimetus = "Pole Võimalik";
        aineMass = 0d;
        laeng = 0d;
    }
}
public String kysiNimetus(){
    return nimetus;
}
public double kysiMolekulMass(){
    return aineMass;
}
public double kysiLaeng(){
    return laeng;
}
}
