package ConstrucClassesInherAbstrInnerClass.InnerClass.Playlist.InnerAndAbstractClasses;

public class HummingBird extends Bird{

    public HummingBird(String name) {
        super(name);
    }
    @Override
    public void fly(){
        System.out.println("Flying from branch to branch");
    }

}
