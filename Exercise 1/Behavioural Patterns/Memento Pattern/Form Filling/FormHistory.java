import java.util.Stack;

class FormHistory {
    private Stack<FormState> history = new Stack<>();

    public void push(FormState state) {
        history.push(state);
    }

    public FormState pop() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
