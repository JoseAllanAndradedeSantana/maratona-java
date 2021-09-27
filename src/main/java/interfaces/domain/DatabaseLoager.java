package interfaces.domain;

public class DatabaseLoager implements DataLoader, DataRemove{

    @Override
    public void load() {
        System.out.println("Load Database");
    }

    @Override
    public void remove() {
        System.out.println("Remove Database");
    }
}
