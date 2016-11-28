
public class Ski_pass_holydays extends Ski_pass{
    protected Ski_pass_spec specialy;

    public Ski_pass_holydays(Type_Enum type, Ski_pass_days days, Ski_pass_slopes slopes) {
        super(type);
        this.specialy = new Ski_pass_spec(slopes, days);
    }
}
