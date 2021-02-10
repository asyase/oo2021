import java.util.Scanner;

public class CookieCake {
    public static void main(String[] args){

    Scanner küpsised = new Scanner(System.in);
    int Inum, IInum, IIInum, IVnum, Vnum, VIpakki, jääk;
    System.out.println("Mitu küpsist on sinu tort lai? ");
    Inum = küpsised.nextInt();
    System.out.println("Mitu küpsist on sinu tort pikk? ");
    IInum = küpsised.nextInt();
    System.out.println("Mitu küpsiste kihti on sinu tordil? ");
    IIInum = küpsised.nextInt();
    System.out.println("Mitu küpsist on on ühes pakis? ");
    Vnum = küpsised.nextInt();

    IVnum = Inum * IInum * IIInum;
    System.out.println("Kokku läheb vaja " + IVnum + " küpsist. ");

    VIpakki = IVnum / Vnum;
    
    //kas mõni küpsis jääb ka järgi?
    jääk = IVnum % Vnum;
    System.out.println("Järgi jääb " + jääk + " küpsist. ");

    if(jääk != 0) {
      VIpakki = VIpakki + 1;
      System.out.println("Meil läheb vaja " + VIpakki + " küpsisepakki. "); }
    else {
      System.out.println("Meil läheb vaja " + VIpakki + " küpsisepakki. "); }
      System.out.println("Nüüd arvutame kui palju kreemi me vajame meie koogi jaoks.\n1cm^2 peale läheb 15grammi kreemi.");
      int kreem_1kiht = (Inum * IInum)*5;
      int kreemiKogus = kreem_1kiht * IIInum;
      System.out.println(IIInum + "-kihilise tordi jaoks meile läheb vaja " + kreemiKogus + " grammi kreemi. "); 
  }
  
    

}
       
     

