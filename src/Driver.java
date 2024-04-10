public class Driver {
    public static void main(String[] args) {
        CasualFactory casFac = new CasualFactory();
        Shoes casShoes = casFac.createShoes();

        ProfessionalFactory profFac = new ProfessionalFactory();
        Pants profPants = profFac.createPants();

        PartyFactory parFac = new PartyFactory();
        Top partTop = parFac.createTop();

        casShoes.wear();
        profPants.wear();
        partTop.wear();

        /**
         * If you would like to add a new Clothing Type, just adjust "ClothingFactory" interface.
         * Any knew category's make a new factory for it and then implement "ClothingFactory" and then "Top" "Pants" "Shoes"
         * for each "[Category][Type]
         */
    }
}