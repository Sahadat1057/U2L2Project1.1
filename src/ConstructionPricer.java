public class ConstructionPricer {
    private double boardPrice = 11.50;
    private double windowPrice = 25.75;
    private double taxRate;

    private int numberOfBoards;

    private int numberOfWindows;


    public ConstructionPricer(double boardPrice, double windowPrice, double taxRate) {
        this.boardPrice = boardPrice;
        this.windowPrice = windowPrice;
        this.taxRate = taxRate;

    }

    public ConstructionPricer(int numberOfBoards, int numberOfWindows) {
        this.numberOfBoards = numberOfBoards;
        this.numberOfWindows = numberOfWindows;
    }

    public double totalBoardPrice() {
        double boardCost = numberOfBoards * boardPrice;
        return boardCost;
    }

    public double totalWindowPrice() {
        double windowCost = numberOfWindows * windowPrice;
        return windowCost;
    }

    public double totalMaterialPrice() {
        double materialPrice = totalWindowPrice() + totalBoardPrice();
        return materialPrice;
    }
    public double totalPrice() {
        double completePrice = (totalMaterialPrice() * taxRate) / 100.0;
        return completePrice;
    }
}