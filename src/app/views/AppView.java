package app.views;

public class AppView {

    public String printList(String[] list) {
        StringBuilder listOutput = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            listOutput.append(i+1);
            listOutput.append(". ").append(list[i]).append("\n");
        }
        return String.valueOf(listOutput);
    }

    private void getOutput(String output) {
        System.out.println(output);
    }
}
