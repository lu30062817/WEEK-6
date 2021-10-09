package fishtank.state;

public class Fishtank
{
    ManufacturingState manufacturingState;
    IdleState idleState;
    InstallationState installationState;
    DirtyState dirtyState;
    State state;

    Fishtank()
    {
        manufacturingState = new ManufacturingState(this);
        idleState= new IdleState(this);
        dirtyState = new DirtyState(this);
        installationState=new InstallationState(this);
        state=installationState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public ManufacturingState getManufacturingState() {
        return manufacturingState;
    }

    public IdleState getIdleState() {
        return idleState;
    }

    public InstallationState getInstallationState() {
        return installationState;
    }

    public DirtyState getDirtyState() {
        return dirtyState;
    }

    public void idleFishtank()  {
        state.idleFishtank();
    }

    public void manufactureFishtank()  {
        state.manufactureFishtank();
    }

    public void installFishtank() {
        state.installFishtank();
    }
    public void dirtyFishtank() {
        state.dirtyFishtank();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();

        sbuffer.append("\nFishtank State  \nFishtank "+state);

        return sbuffer.toString();
    }
}
