public class Main {
    static void main() {
        ArrayCollection<Artifact> Artifacts = new ArrayCollection<>(10);

        Artifact Item1 = new Artifact("A101", "Stone Axe", "Neolithic");
        Artifact Item2 = new Artifact("B205", "Bronze Dagger", "Bronze Age");
        Artifact Item3 = new Artifact("C309", "Greek Vase", "Classical Era");

        Artifacts.add(Item1);
        Artifacts.add(Item2);
        Artifacts.add(Item3);

        System.out.println("=== INITIAL CATALOG ===");
        System.out.println("Collection size: " + Artifacts.size());

        Artifact search = new Artifact("B205", "", "");
        System.out.println("Contains B205? " + Artifacts.contains(search));
        System.out.println(Artifacts.get(search));

        boolean wasRemoved = Artifacts.remove(new Artifact("A101", "", ""));
        System.out.println("Was A101 removed? " + wasRemoved);
        System.out.println("New collection size: " + Artifacts.size());
        System.out.println("Still contains A101? " + Artifacts.contains(new Artifact("A101", "", "")));


    }
}
