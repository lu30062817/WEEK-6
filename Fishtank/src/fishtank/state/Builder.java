package fishtank.state;

public interface Builder {
    Builder Glass();
    Builder Adhesives();
    Builder Fish();
    Fishtank build();
}