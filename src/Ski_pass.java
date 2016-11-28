
public abstract class Ski_pass {
    protected Ski_pass_special special;
    int identifier;


    public Ski_pass(Type_Enum type){
        this.special = new Ski_pass_special(type);
    }
}
