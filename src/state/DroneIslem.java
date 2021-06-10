
package state;


public class DroneIslem {
    
    public IDurum kapaliState;
    public IDurum yerdeState;
    public IDurum havadaState;
    
    IDurum simdiki;
    
    public DroneIslem(){
        kapaliState=new KapaliDurum(this);
        yerdeState=new YerdeDurum(this);
        havadaState=new HavadaDurum(this);
        simdiki=kapaliState;
     
    }
    public IDurum durumGetir(){
        return simdiki; //üzerinde çalışılaak olan döndürülür
    }
    public void durumSetle(IDurum d)
    {
        simdiki=d;
    }
    public void durdurulsun()
    {
        simdiki.durdur();//IDurumdan nesne aldığımız için durdur metodu çağrılır
    }
    public void yerdeCalissin()
    {
        simdiki.yerdeCalis();
    }
    public void yukselsin()
    {
        simdiki.yuksel();
    }
}
