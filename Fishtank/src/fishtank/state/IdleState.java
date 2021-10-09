package fishtank.state;

public class IdleState implements State {

    Fishtank fishtank;
    public IdleState(Fishtank fishtank) {
        this.fishtank = fishtank;
    }

    @Override
    public void idleFishtank() {
        System.out.println("Fishtank can easily be broken");
        fishtank.setState(fishtank.getInstallationState());
    }

    @Override
    public void manufactureFishtank() {
        System.out.println("Fishtanks are manufactured to sustain the water pressure");
        fishtank.setState(fishtank.getManufacturingState());
    }

    @Override
    public void installFishtank() {
        System.out.println("Fishtank broken, We can not manufacture it");
    }

    @Override
    public void dirtyFishtank() {
        System.out.println("fishtank broke");
        fishtank.setState(fishtank.getDirtyState());
    }

    public String toString() {
        return "Fishtank Cleaning";
    }

}