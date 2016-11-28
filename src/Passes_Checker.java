
public class Passes_Checker {
    private int defaultSize = 10;
    private int insertIndex = 0;
    private Ski_pass[] ski_passes_list = new Ski_pass[defaultSize]; // list of ski-passes, that were given and are active

    public void add_ski_pass(Ski_pass pass) {
        //метод випускає нову картку, добавляючи її в список діючихх карток
        checkSize();
        ski_passes_list[insertIndex] = pass;
        insertIndex++;
    }

    private void checkSize() {
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Ski_pass[] b = new Ski_pass[defaultSize];
            for (int i = 0; i <= insertIndex; i++) {
                b[i] = ski_passes_list[i];
            }
            ski_passes_list = b;
        }
    }
    public void remove(int y) {
        Ski_pass [] arraychuk = new Ski_pass[ski_passes_list.length - 1];
        for (int i = 0; i < y; i++) {
            arraychuk[i] = ski_passes_list[i];
        }
        for (int i = y + 1; i < ski_passes_list.length; i++) {
            arraychuk[i - 1] = ski_passes_list[i];
        }
        ski_passes_list = arraychuk;
    }

    private void delete(Ski_pass pass) {
        // метод видаляє картку по ідентифікаційному унікальному номеру з списку активних карток в разі порушення
        int identity = pass.identifier;
        for (int i = 0; i < ski_passes_list.length; i++){
            if(identity == ski_passes_list[i].identifier){
                remove(i);
            }
        }
    }

    public void check_card(Ski_pass pass){
        for (int i = 0; i < ski_passes_list.length; i++){
            if (pass.identifier == ski_passes_list[i].identifier){

            }
        }
    }
}

