package org.example;

public class Main {
    public static void main(String[] args) {
        PriceForEducation priceForEducation=new PriceForEducation();
        priceForEducation.high=new HighSchool();
        priceForEducation.high.schoolName="JRS";
        priceForEducation.high.pricePerYear=200.10;
        priceForEducation.high.year=10;

        priceForEducation.puc=new Puc();
        priceForEducation.puc.collegeName="Mandavaya";
        priceForEducation.puc.years=2;
        priceForEducation.puc.pricePerYear=250.05;

        priceForEducation.engg=new Engg();
        priceForEducation.engg.university="PES";
        priceForEducation.engg.numberOfYear=8;
        priceForEducation.engg.pricePerSemester=400.50;

        priceForEducation.invoice=priceForEducation.high.year*priceForEducation.high.pricePerYear + priceForEducation.puc.years*priceForEducation.puc.pricePerYear + priceForEducation.engg.numberOfYear*priceForEducation.engg.pricePerSemester;
        System.out.println("Total price for education is:"+priceForEducation.invoice);
    }
}