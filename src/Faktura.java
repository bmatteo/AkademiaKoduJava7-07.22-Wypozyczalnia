public class Faktura {
    String[] produkty = new String[100];
    double wartoscBrutto;
    double podatek;
    double wartoscNetto;
    String nrFaktury;

    public void dodajProdukt() {
        addProductToList();
        regenerateInvoideNumber();
        recalculateBrutto();
        recalculateTaxAndNetto();
    }

    private void addProductToList() {
        //coś robie
    }

    private void regenerateInvoideNumber(){
        //coś robie
    }

    private void recalculateBrutto(){
        //coś robie
    }

    private void recalculateTaxAndNetto(){
        //coś robie
    }
}
