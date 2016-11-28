
public enum Ski_pass_slopes {
    TEN, TWENTY, FIFTY, HUNDRED;
    public String toString(){
        switch (this){
            case TEN:
                return "Ten slopes";
            case TWENTY:
                return "Twenty slopes";
            case FIFTY:
                return "Fifty slopes";
            case HUNDRED:
                return "Hundred slopes";
            default:
                return "Non slopes ski pass";
        }
    }
}
