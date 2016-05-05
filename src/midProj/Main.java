package midProj;

import midProj.Controller;

/**
 * Created by MashaJM
 * Задано 3 целых числа. Найти их среднее арифметическое и ближайшее к нему
 целое.
 */
public class Main {


    public static void main(String[] args) {

        Model model = Controller.choseModel();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.setUser(model);
    }
}