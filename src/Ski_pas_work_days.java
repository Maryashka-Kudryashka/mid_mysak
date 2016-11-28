
public class Ski_pas_work_days extends Ski_pass {
    protected Ski_pass_spec specialy;

    public Ski_pas_work_days(Type_Enum type, Ski_pass_days None, Ski_pass_slopes slopes) {
        super(type);
        this.specialy = new Ski_pass_spec(slopes,None);
    }
}


