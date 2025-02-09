package CaseStudies.GitImplementation;

public class Stash {
    private String data;
    private String Version;

    public Stash() {
    }

    public Stash(String data, String version) {
        this.data = data;
        Version = version;
    }

    public String getData() {
        return data;
    }

    public Stash setData(String data) {
        this.data = data;
        return this;
    }

    public String getVersion() {
        return Version;
    }

    public Stash setVersion(String version) {
        Version = version;
        return this;
    }
}
