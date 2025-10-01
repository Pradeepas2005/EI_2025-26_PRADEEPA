import java.util.Stack;

public class FormHistory {
    private Stack<FormState> history = new Stack<FormState>();

    public void push(FormState state) {
        history.push(state);
    }

    public FormState pop() {
        if (!history.isEmpty())
            return history.pop();
        return null;
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
