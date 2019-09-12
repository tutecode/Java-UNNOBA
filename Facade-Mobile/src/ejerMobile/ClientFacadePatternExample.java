package ejerMobile;


//Main?
//Probamos la facade desde nuestro cliente.
public class MainClientFacadePatternExample {
	public static void main(String[] args) {

        MobileFacade facade = new MobileFacade();
        Mobile mobile = facade.on();

        System.out.println("---------------");

        facade.off(mobile);
    }
}
