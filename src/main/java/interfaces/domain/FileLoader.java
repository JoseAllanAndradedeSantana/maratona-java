package interfaces.domain;

public class FileLoader implements DataLoader,DataRemove{
    @Override
    public void load() {
        System.out.println("Load File Database");
    }

    @Override
    public void remove() {
        System.out.println("Remove File Database");
    }
}
