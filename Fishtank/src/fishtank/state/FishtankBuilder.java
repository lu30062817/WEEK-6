package fishtank.state;

public class FishtankBuilder implements Builder{

    FishtankBuilder(){

    }

    @Override
    public Builder Glass() {
        System.out.println("Fish tank is made up of glass");
        return this;
    }

    @Override
    public Builder Adhesives() {
        System.out.println("A transparent glass help to see through");
        return this;
    }

    @Override
    public Builder Fish() {
        System.out.println("Water are poured in the fish glass");
        return this;
    }

    @Override
    public Fishtank build() {
        Fishtank s=new Fishtank();
        System.out.println("Fish tank is to pet fish!");
        return s;
    }
}
