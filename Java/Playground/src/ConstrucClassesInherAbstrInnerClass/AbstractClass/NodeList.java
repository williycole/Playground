package ConstrucClassesInherAbstrInnerClass.AbstractClass;

public interface NodeList {
    abstract ListItem getRoot();
    abstract boolean addItem(ListItem newItem);
    abstract boolean removeItem(ListItem item);
    abstract void traverse(ListItem root);
}