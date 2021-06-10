
package state;


public class YerdeDurum implements IDurum {
DroneIslem dron;
    public YerdeDurum(DroneIslem drn) {
        dron=drn;

    }

    @Override
    public void durdur() {
        System.out.println(" Drone durduruldu.");
           dron.durumSetle(dron.kapaliState);

    }

    @Override
    public void yerdeCalis() {
        System.out.println(" Drone şuan zaten yerde çlışıyor!");
    }

    @Override
    public void yuksel() {
        System.out.println(" Drone yükseliyor");
     dron.durumSetle(dron.havadaState);
    }

}
