package fishtank.state;

public class Main {

    public static void main(String[] args) {

        FishtankBuilder fish=new FishtankBuilder();
        Fishtank glassbuilder=fish.Glass().Adhesives().Fish().build();


        glassbuilder.idleFishtank();
        glassbuilder.dirtyFishtank();
        glassbuilder.installFishtank();
        glassbuilder.manufactureFishtank();
        glassbuilder.idleFishtank();
        glassbuilder.idleFishtank();
        glassbuilder.installFishtank();

    }

}