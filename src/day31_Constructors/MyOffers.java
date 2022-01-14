package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

       Offer myOffer1 = new Offer();
       myOffer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);


        Offer myOffer2 = new Offer();
        myOffer2.setInfo("CA", "Sony Inc", "QA",120000, true, false, false,true);

        Offer myOffer3 = new Offer();
       myOffer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer myOffer4 = new Offer();
        myOffer4.setInfo("TX", "CapitalOne","SM", 90000, false, false, true, true);

        Offer myOffer5 = new Offer();
        myOffer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false,true);


        System.out.println(myOffer1);
        System.out.println(myOffer2);
        System.out.println(myOffer3);
        System.out.println(myOffer4);
        System.out.println(myOffer5);
        System.out.println("=========================================================================================");

        Offer[] myOffers = {myOffer1,myOffer2,myOffer3,myOffer4,myOffer5};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> ! p.isFullTime);  // remove all the offers that are not full time
        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !(p.location.equals("VA") || p.location.equals("CA")));
        System.out.println(localOffers.size());
        for (Offer each : localOffers) {
            System.out.println(each);
            System.out.println(each.companyName + " : " + each.salary);

        }

        System.out.println("===============================");

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println(offersWithBenefits.size());

        ArrayList<Offer>  sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p-> ! p.jobTitle.equals("SDET"));
        System.out.println(sdetOffers.size());

        ArrayList<Offer> offersWith100K= new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100K.size());












    }








}
/*
 2. Create a class named MyOffers:

            2.1 Create 7 objects of Offer
            2.2 Create an array of Offers named myOffers and store all 7 objects of offers
            2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
                    2.3.1 Write a program that can remove the offer objects that are not full-time
            2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
                    2.4.1 Write a program that can remove all the offers that are not from local
            2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
                    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
            2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
                    2.6.1 Write a program that can remove all the offers that are not for SDET
            2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
                    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary

 */