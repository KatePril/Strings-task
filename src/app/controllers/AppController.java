package app.controllers;

import app.models.AppModel;
import app.utils.Constants;
import app.utils.Input;
import app.views.AppView;

public class AppController {

    public void handleData() {
        AppModel model = new AppModel();
        AppView view = new AppView();

        String[] taskOneList = {"brange", "plum", "tomato", "onibn", "grape"};
        model.replacePatterns(taskOneList, "b", "o");
        String taskOneResult = view.getList(taskOneList);
        view.getOutput(taskOneResult);

        String[] taskTwoList =  {"orange", "plum", "tomato",
                "onion", "grape", "onion"};
        model.deleteElements(taskTwoList, "onion");
        String taskTwoResult = view.getList(taskTwoList);
        view.getOutput(taskTwoResult);

        String[] taskThreeList = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
        String name = Input.inputString(Constants.INPUT_NAME_MSG);
        int count = model.findElement(taskThreeList, name);
        String taskThreeResult = view.printReplyFindingElement(name, count);
        view.getOutput(taskThreeResult);

    }

}
