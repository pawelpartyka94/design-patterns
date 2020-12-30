package refactoring_guru.factory_method.example.pawel_test;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Test linux");
    }

    @Override
    public void onClick() {
        System.out.println("Test click");
    }
}
