package CaseStudies.GitImplementation;

public class Main {
    public static void main(String[] args) {
        Git git = new Git();

        FileSystem file = new FileSystem();
        file.setVersion("1.0").setData("Yes, I'm Gaurav Verma");
        Stash stash1= file.stashData();
        git.addStash(stash1);

        file.setVersion("1.1-RC").setData("Yes, I'm Shiv Verma");
        git.addStash(file.stashData());

        file.setVersion("1.1-RC2").setData("Yes, I'm Shiv");

        //----------------------------------------------------------------------
        System.out.println(file.getVersion() +"  version contains Data: "+file.getData());

        Stash version = git.pop();
        file.popStash(version);
        System.out.println(file.getVersion() +"  version contains Data: "+file.getData());

        file.popStash(git.pop());
        System.out.println(file.getVersion() +"  version contains Data: "+file.getData());
    }
}