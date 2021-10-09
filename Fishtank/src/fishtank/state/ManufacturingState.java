package fishtank.state;

public class ManufacturingState implements State{

    Fishtank fishtank;
    public ManufacturingState(Fishtank fishtank) {
        this.fishtank = fishtank;
    }

    @Override
    public void idleFishtank() {
        System.out.println("Fishtank already brought");
        fishtank.setState(fishtank.getInstallationState());

    }

    @Override
    public void manufactureFishtank() {
        System.out.println("Fishtanks are manufactured to protect and comfort the human fish");
    }

    @Override
    public void installFishtank() {
        System.out.println("Work finished with fishtank, cleaning fishtank");
        fishtank.setState(fishtank.getIdleState());
    }

    @Override
    public void dirtyFishtank() {
        System.out.println("Fishtank can be easily be broken");
        fishtank.setState(fishtank.getDirtyState());
    }

    public String toString() {
        return "Protect Foot";
    }


}
