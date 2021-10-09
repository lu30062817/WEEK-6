package fishtank.state;

public interface State
{
    public abstract void idleFishtank();
    public abstract void manufactureFishtank();
    public abstract void installFishtank();
    public abstract void dirtyFishtank();
}