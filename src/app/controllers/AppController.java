package app.controllers;

import app.models.AppModel;
import app.utils.Constants;
import app.utils.Input;
import app.views.AppView;

public class AppController {

    public void handleData() {
        AppModel model = new AppModel();
        AppView view = new AppView();

        System.out.println("\n Task 1");

        String[] taskOneList = {"brange", "plum", "tomato", "onibn", "grape"};
        model.replacePatterns(taskOneList, "b", "o");
        String taskOneResult = view.getList(taskOneList);
        view.getOutput(taskOneResult);

        /*
        Alternative version of task 1

        String[] taskOneList = {"brange", "plum", "tomato", "onibn", "grape"};
        String[] patterns = Input.inputPattern(Constants.INPUT_PATTERN, Constants.INPUT_PATTERN_REPLACEMENT);
        model.replacePatterns(taskOneList, patterns[0], patterns[1]);
        String taskOneResult = view.getList(taskOneList);
        view.getOutput(taskOneResult);
        */

        System.out.println("\n Task 2");

        String[] taskTwoList =  {"orange", "plum", "tomato",
                "onion", "grape", "onion"};
        String[] editedList = model.deleteElements(taskTwoList, "onion");
        String taskTwoResult = view.getList(editedList);
        view.getOutput(taskTwoResult);

        /*
        Alternative version of task 2

        String[] taskTwoList =  {"orange", "plum", "tomato",
                "onion", "grape", "onion"};
        String[] editedList = model.deleteElements(taskTwoList, Input.inputString(Constants.INPUT_DELETE));
        String taskTwoResult = view.getList(editedList);
        view.getOutput(taskTwoResult);
        */

        System.out.println("\n Task 3");

        String[] taskThreeList = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        String name = Input.inputString(Constants.INPUT_NAME_MSG);
        int count = model.findElement(taskThreeList, name);
        String taskThreeResult = view.printReplyFindingElement(name, count);
        view.getOutput(taskThreeResult);

    }

}
