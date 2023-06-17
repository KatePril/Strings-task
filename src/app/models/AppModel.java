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
        int count = findElement(list, elementToBeDeleted);
        String[] newList = new String[list.length - count];
        int indexCount = 0;
        for (String element : list) {
            if (!element.equals(elementToBeDeleted)) {
                newList[indexCount] = element;
                indexCount++;
            }
        }
        return newList;
    }

    public int findElement(String[] list, String elementToBeFounded) {
        int count = 0;
        for (String element : list) {
            if (element.equals(elementToBeFounded)) {
                count++;
            }
        }
        return count;
    }

}
