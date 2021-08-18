package ConstrucClassesInherAbstrInnerClass.InnerClass.Playlist.InnerAndAbstractClasses;

public class Doggy extends Animal{

    public Doggy(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "'s eat dog food.");
    }

    @Override
    public void breath() {
        System.out.println("Little doggies breath fast, big doggies breath slow.");
    }
}
