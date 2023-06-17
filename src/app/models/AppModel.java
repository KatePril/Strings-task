package app.models;

import java.util.ArrayList;

public class AppModel {

    public String[] replacePatterns(String[] list, String pattern, String patternReplacement) {
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i].replace(pattern, patternReplacement);
        }
        return list;
    }

    public String[] deleteElements(String[] list, String elementToBeDeleted) {
        ArrayList<String> newList = new ArrayList<>();
        for (String element : list) {
            if (!element.equals(elementToBeDeleted)) {
                newList.add(element);
            }
        }
        return (String[]) newList.toArray();
    }

    public void executeTaskThree() {}

}
