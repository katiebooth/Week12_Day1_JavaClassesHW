public class Printer {

    private int sheetsRemaining;
    private int tonerVolume;


    public Printer(int sheetsRemaining, int tonerVolume) {
        this.sheetsRemaining = sheetsRemaining;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsRemaining(){
        return this.sheetsRemaining;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int numberPages, int numberCopies){
        if(numberPages * numberCopies <= this.sheetsRemaining){
            this.sheetsRemaining -= numberPages * numberCopies;
            this.tonerVolume -= numberPages;
        }
    }

}
