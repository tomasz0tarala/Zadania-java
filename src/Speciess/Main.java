package Speciess;

public class Main {
    public static void main(String[] args) {
        Species jaguar = new Species("ssak","jaguar","The jaguar (Panthera onca) is a large cat species and the only living member of the genus Panthera native to the Americas. With a body length of up to 1.85 m (6 ft 1 in) and a weight of up to 158 kg (348 lb), it is the largest cat species in the Americas and the third largest in the world. Its distinctively marked coat features pale yellow to tan colored fur covered by spots that transition to rosettes on the sides, although a melanistic black coat appears in some individuals. The jaguar's powerful bite allows it to pierce the carapaces of turtles and tortoises, and to employ an unusual killing method: it bites directly through the skull of mammalian prey between the ears to deliver a fatal blow to the brain.",32,16);
        Species klon = jaguar.cloneCurrentSpecies();
        jaguar.displayTypeAndSpecies();
        jaguar.displayHaploidalNumberOfChromosomes();
        jaguar.displayEverything();
    }

}
