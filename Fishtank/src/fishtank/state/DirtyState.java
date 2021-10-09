package fishtank.state;

public class DirtyState implements State {

    Fishtank fishtank;
    public DirtyState(Fishtank fishtank) {
        this.fishtank = fishtank;
    }

    @Override
    public void idleFishtank() {
        System.out.println("Buying fishtank");
        fishtank.setState(fishtank.getInstallationState());
    }

    @Override
    public void manufactureFishtank() {
        System.out.println("Fishtanks are manufactured to pet fish");
    }

    @Override
    public void installFishtank() {
        System.out.println("Fishtank broken, can not be repaired");

    }

    @Override
    public void dirtyFishtank() {
        System.out.println("Fishtank broke");

    }

    public String toString() {
        return "Destroy";
    }

}
