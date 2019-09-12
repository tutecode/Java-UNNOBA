package ejerMobile;

import java.util.Arrays;
import java.util.List;

/*
 * Definamos el facade que se encargará de simplificar todas la operaciones de encendido y de apagado del teléfono móvil.
 * 
 * Observa que el facade expondrá dos metodos “ON” , “OFF”.
 * Todo el resto ocurre dentro de facade y el cliente no necesita entender las acciones ni el orden de encendido.
 * 
 */
public class MobileFacade {
	public Mobile on() {

        Battery battery = new Battery();
        battery.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        MobileService gps = new GPSService();
        gps.start();

        MobileService wifi = new WifiService();
        wifi.start();

        List<MobileService> mobileServices = Arrays.asList(gps, wifi);

        Mobile mobile = new Mobile(battery, cpu, mobileServices);

        return mobile;
    }

    public void off(Mobile mobile) {

        for(MobileService service :mobile.getMobileServices()) {
            service.close();
        }
        mobile.getCpu().shutDown();
        mobile.getBattery().off();
    }
}
