
public enum Ski_pass_days {
        ONE, TWO, FIVE;
        public String toString(){
            switch (this){
                case ONE:
                    return "One day";
                case TWO:
                    return "Two days";
                case FIVE:
                    return "Five days";
                default:
                    return "Non days ski pass";
            }
        }
    }

