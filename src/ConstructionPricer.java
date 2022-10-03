public class ConstructionPricer {
    private double boardPrice = 11.50;
    private double windowPrice = 25.75 ;
    private double taxRate;


    public ConstructionPricer(int boardPrice, int windowPrice, int taxRate) {
        this.boardPrice = boardPrice;
        this.windowPrice = windowPrice;
        this.taxRate = taxRate;

    }
    public double costOfBoards()
    {
        double costBoards = boardPrice * numberOfBoards ;
        return costBoards;
    }

}