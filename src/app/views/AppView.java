package app.views;

import app.utils.Constants;

public class AppView {

    public String getList(String[] list) {
        StringBuilder listOutput = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            listOutput.append(i+1);
            listOutput.append(". ").append(list[i]).append("\n");
        }
        return String.valueOf(listOutput);
    }

    public String printReplyFindingElement(String element, int count) {
        if (count == 0) {
            return String.format(Constants.ABSENT_NAME_MSG, element);
        } else {
            return String.format(Constants.PRESENT_NAME_MSG, count, element);
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
