package refactoring_guru.factory_method.example.pawel_test;

public class WindowsButton implements Button{

    @Override
    public void render() {

    }

    @Override
    public void onClick() {
        System.out.println("Test onclick");
    }
}
