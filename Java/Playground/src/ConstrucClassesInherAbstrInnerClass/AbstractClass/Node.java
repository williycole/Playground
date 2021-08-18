package ConstrucClassesInherAbstrInnerClass.AbstractClass;

public class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return super.rightLink;
    }

    @Override
    ListItem setNext(ListItem rightLink) {
        super.rightLink = rightLink;
        return super.rightLink;
    }

    @Override
    ListItem previous() {
        return super.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem leftLink) {
        super.leftLink = leftLink;
        return super.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }
}