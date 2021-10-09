package fishtank.state;

public class InstallationState implements State {

    Fishtank fishtank;
    public InstallationState(Fishtank fishtank) {
        this.fishtank = fishtank;
    }

    @Override
    public void idleFishtank() {
        System.out.println("There are many types of fish tanks");

    }

    @Override
    public void manufactureFishtank() {
        System.out.println("Fishtanks are manufactured to protect and comfort the fish");
        fishtank.setState(fishtank.getManufacturingState());

    }

    @Override
    public void installFishtank() {
        System.out.println("cleaning Fishtank");
        fishtank.setState(fishtank.getIdleState());
    }

    @Override
    public void dirtyFishtank() {
        System.out.println("Fishtank Destroyed");
        fishtank.setState(fishtank.getDirtyState());
    }
    public String toString() {
        return "brought";
    }
}

