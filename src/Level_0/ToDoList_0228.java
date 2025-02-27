package Level_0;

import java.util.ArrayList;
import java.util.List;

public class ToDoList_0228 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        Boolean[] finished = {true, false, true, false};
        List<String> temp = new ArrayList<>();
        for (int i = 0; i<todo_list.length; i++) {
            if (!finished[i]) {
                temp.add(todo_list[i]);
            }
        }
        String[] answer = new String[temp.size()];
        for (int i = 0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
    }
}
