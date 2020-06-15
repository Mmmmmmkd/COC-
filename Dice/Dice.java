import java.lang.*;
class Dice {
    private int sides;
    int nd2,nd3,nd4,nd6,nd8,nd10,nd12,nd20,nd100,ndx;
    public Dice(){};
    public Dice(int s){sides=s;}
    public int getNumber(){return (int)(Math.random()*sides+1);}
    public void D2(){
        Dice d2=new Dice(2);
        nd2=d2.getNumber();
    }
    public void D3(){
        Dice d3=new Dice(3);
        nd3=d3.getNumber();
    }
    public void D4(){
        Dice d4=new Dice(4);
        nd4=d4.getNumber();
    }
    public int D6(){
        Dice d6=new Dice(6);
        nd6=d6.getNumber();
        return nd6;
    }
    public void D8(){
        Dice d8=new Dice(8);
        nd8=d8.getNumber();
    }
    public void D10(){
        Dice d10=new Dice(10);
        nd10=d10.getNumber();
    }
    public void D12(){
        Dice d12=new Dice(12);
        nd12=d12.getNumber();
    }
    public void D20(){
        Dice d20=new Dice(20);
        nd20=d20.getNumber();
    }
    public void D100(){
        Dice d100=new Dice(100);
        nd100=d100.getNumber();
    }
}