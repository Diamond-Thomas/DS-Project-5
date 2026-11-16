public class Artifact {
    private String id;
    private String name;
    private String era;

    Artifact(String id, String name, String era){
        this.id = id;
        this.name = name;
        this.era = era;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEra() {
        return era;
    }

    public String toString() {
        return "-----Artifact----- \n" +
                "Name: " + name + "\n" +
                "Id: " + id + "\n" +
                "Era: " + era +
                "\n------------------";
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        else{
            Artifact other = (Artifact) obj;
            return this.id.equals(other.id);
        }
    }

}
