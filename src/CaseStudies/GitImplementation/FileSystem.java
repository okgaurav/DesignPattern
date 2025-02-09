package CaseStudies.GitImplementation;

public class FileSystem {
    private String data;
    private String version;

    public FileSystem(String data, String version) {
        this.data = data;
        this.version = version;
    }

    public FileSystem() {
    }

    public String getData() {
        return data;
    }

    public FileSystem setData(String data) {
        this.data = data;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public FileSystem setVersion(String version) {
        this.version = version;
        return this;
    }

    public Stash  stashData(){
        //take a current Snapshot and returns
        return  new Stash(data, version);
    }
    public void popStash(Stash data){
        setData(data.getData());
        setVersion(data.getVersion());
    }
}
