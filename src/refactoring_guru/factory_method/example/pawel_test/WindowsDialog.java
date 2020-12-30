package refactoring_guru.factory_method.example.pawel_test;

public class WindowsDialog extends Dialog{

    @Override
    void render() {
        super.render();
    }

    @Override
    Button creatureButton() {
        return new WindowsDialog();
    }
}
