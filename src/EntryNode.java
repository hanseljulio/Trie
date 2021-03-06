import java.util.*;

public class EntryNode {
    private final char letter;
    private boolean isTerminal;
    private Map<Character, EntryNode> children = new HashMap<>();

    public EntryNode(char letter) {
        this(letter, false);
    }

    public EntryNode(char letter, boolean isTerminal) {
        this.letter = letter;
        this.isTerminal = isTerminal;
    }


    public EntryNode getChild(Character data) {
        return children.get(data);
    }

    public void addChild(EntryNode child) {
        this.children.put(child.letter, child);
    }

    public boolean isTerminal() {
        return isTerminal;
    }

    public void setTerminal(boolean isTerminal) {
        this.isTerminal = isTerminal;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof EntryNode)) {
            return false;
        }

        return ((EntryNode) obj).letter == this.letter;
    }

    public String toString() {
        char modifier = ' ';
        if (isTerminal) {
            modifier = '*';
        }

        return String.valueOf(new char[] {letter, modifier});
    }

    public String subtreeToString(String prefix, boolean isTail) {
        StringBuilder result = new StringBuilder(
                prefix + (isTail ? "└── " : "├── ") + this.toString() + "\n"
        );
        for (char letter : children.keySet()) {
            result.append(children.get(letter).subtreeToString(
                    prefix + (isTail ? "    " : "│   "), false)
            );
        }

        return result.toString();
    }
}
