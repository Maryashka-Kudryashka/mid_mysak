/**
 * Created by cs.ucu.edu.ua on 11/28/2016.
 */
public enum Type_Enum {
    WORK_DAYS, HOLYDAYS, SEASON;
    public String toString(){
        switch (this){
            case WORK_DAYS:
                return "Work daays";
            case HOLYDAYS:
                return "Holydays";
            case SEASON:
                return "Season";
            default:
                return "Non type ski-pass";
        }
    }
}
