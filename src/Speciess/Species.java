package Speciess;

public class Species {
//pola
    private String typeName;
    private String speciesName;
    private String description;
    private int numberOfChromosomes2N;
    private int numberOfChromosomesX;
//konstruktory
    public Species(String typeName, String speciesName, String description, int numberOfChromosomes2N, int numberOfChromosomesX) {
        this.typeName = typeName;
        this.speciesName = speciesName;
        this.description = description;
        this.numberOfChromosomes2N = numberOfChromosomes2N;
        this.numberOfChromosomesX = numberOfChromosomesX;
    }

    public Species() {
    }
//metody
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public int getNumberOfChromosomes2N() {
        return numberOfChromosomes2N;
    }

    public void setNumberOfChromosomes2N(int numberOfChromosomes2N) {
        this.numberOfChromosomes2N = numberOfChromosomes2N;
    }

    public int getNumberOfChromosomesX() {
        return numberOfChromosomesX;
    }

    public void setNumberOfChromosomesX(int numberOfChromosomesX) {
        this.numberOfChromosomesX = numberOfChromosomesX;
    }
    public void displayTypeAndSpecies(){
        System.out.println("Nazwa rodzaju "+typeName+" nazwa gatunkowa "+speciesName);
    }
    public void displayHaploidalNumberOfChromosomes(){
        System.out.println("Haploidalna liczba chromosomów tego gatunku to "+(numberOfChromosomes2N/2));
    }
    public void displayEverything(){
        System.out.println("Nazwa rodzaju "+typeName+" nazwa gatunkowa "+speciesName+". \nHaploidalna liczba chromosomów tego gatunku to "+(numberOfChromosomes2N/2)+". \nLiczba chromosomów 2n: "+numberOfChromosomes2N+" \nPodstawowa liczba chromosomów x: "+numberOfChromosomesX+" \nOpis "+speciesName+":\n"+description);
    }
    public Species cloneCurrentSpecies(){
        Species clonedSpecies = new Species(this.typeName,this.speciesName,this.description,this.numberOfChromosomes2N,this.numberOfChromosomesX);
        return clonedSpecies;
    }

}
