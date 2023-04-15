package com.snapolitano.exercises.practice.chapter1;

/**
 * Prints a poem
 */
public class E1_13 {

    /**
     * @return the string containing the poem
     *
     * @see "https://poets.org/poem/i-taste-liquor-never-brewed-214"
     */
    public static String poem() {
        return """
                I taste a liquor never brewed –
                From Tankards scooped in Pearl –
                Not all the Frankfort Berries
                Yield such an Alcohol!
                            
                Inebriate of air – am I –
                And Debauchee of Dew –
                Reeling – thro' endless summer days –
                From inns of molten Blue –
                            
                When "Landlords" turn the drunken Bee
                Out of the Foxglove's door –
                When Butterflies – renounce their "drams" –
                I shall but drink the more!
                            
                Till Seraphs swing their snowy Hats –
                And Saints – to windows run –
                To see the little Tippler
                Leaning against the – Sun!
                      Emily Dickinson, I taste a liquor never brewed (214)""";
    }

    public static void main(String[] args) {
        System.out.println(poem());
    }
}
