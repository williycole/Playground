package ConstrucClassesInherAbstrInnerClass.InnerClass.Playlist.InnerAndAbstractClasses;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breath() {
        System.out.println("The " + getName() + " is breathing very fast");
    }

    public abstract void  fly();
}
