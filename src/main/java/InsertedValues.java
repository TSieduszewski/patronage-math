public class InsertedValues {

    EnteringData type;

    public InsertedValues() {

    }

    public void execute(int selectedOption, int i) {

        if (selectedOption == 1) {
            type = new EnteringNumbers();
            if(i==0){
                System.out.println(type.whatIsPossible());
            }
            type.enterValue();
        }
        if (selectedOption == 2) {
            type = new EnteringVectors();
            if(i==0){
                System.out.println(type.whatIsPossible());
            }
            type.enterValue();
        }

        if (selectedOption == 3) {
            type = new EnteringMatrix();
            if(i==0){
                System.out.println(type.whatIsPossible());
            }
            type.enterValue();
        }
    }

    public Values getExecutedData(){
        return type.getEnteredValue();
    }
}
