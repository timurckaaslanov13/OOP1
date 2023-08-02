public class CalcMain {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcPresenter presenter = new CalcPresenter(model, view);
        presenter.math();
    }
}
