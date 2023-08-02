public class CalcPresenter {
    private CalcModel model;
    private CalcView view;
    public CalcPresenter(CalcModel model, CalcView view){
        this.model = model;
        this.view = view;
    }
    public void math(){
        double num1 = view.getInput();
        String ch = view.getChar();
        double num2 = view.getInput();
        model.res(num1, ch, num2);
        double res = model.getResult();
        view.disp(res);
    }
}
