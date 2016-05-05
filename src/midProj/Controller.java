package midProj;

/**
 * Created by MashaJM
 */
import java.util.Scanner;
public class Controller {

    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }


    /**
     * for understanding if we use the model with parameters or with randomized numbers
     * @return
     */
    public static Boolean isParameters() {
        View.printMessage(View.GREETINGS);

        Scanner scanner = new Scanner(System.in);
        while (true) {

            String yesOrNo = scanner.next();
            if ((yesOrNo.equals("Y")) || (yesOrNo.equals("y")))

            {

                return true;

            } else if ((yesOrNo.equals("N")) || (yesOrNo.equals("n")))


            {


                return false;
            } else {
                {

                    View.printMessage(View.WRONG_INPUT_INT_DATA);



                }

            }
        }
    }


    /**
     * returns user's input while it is integer number
     * @param scanner
     * @return
     */



    public static int inputInt(Scanner scanner) {


        View.printMessage(View.INPUT_INT_DATA);
        while(!scanner.hasNextInt()) {
            View.printMessage(View.WRONG_INPUT_INT_DATA);
            scanner.next();

        } return scanner.nextInt();

    }

    /**
     * Parameters for the model setting (if User didn't choose the model with randomize parameters)
     * @return the array of 3 model parameters
     */

    public static int[] setParameters () {

        int [] array = new int [3];

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);

            array[i] = inputInt(scanner);
        }

        return array;
    }

    /**
     * here user can choose the type of the model - with randomize or set parameters
     * @return
     */

    public static Model choseModel() {

        int[] array;
        Model model;
        if(isParameters()) {
            array = setParameters();
            return model = new Model(array[0], array[1], array[2]);
        }
        else return model = new Model();

    }

    /**
     * the main game begins here
     * @param model
     */

    public void setUser (Model model) {


        double x = model.findMidNumber(model.getA(), model.getB(),model.getC());
        int y = model.theClosestInt(x);
        view.printMessage("Our numbers: " + model.getA() + ", " + model.getB() + ", " + model.getC());
        view.printMessage("Our median: " + Double.toString(x));
        view.printMessage("The nearest integer: " + Double.toString(y));



        }



    }



