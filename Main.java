package gb.HomeWorkApp4;

public class Main {

    public static void main(String[] args) {
       String[][]strings=new String[][]{
               {"4", "4", "4", "4"},
               {"4", "tr", "4", "4"},
               {"4", "4", "4", "ty"},
               {"4", "4", "4", "4"}
       };try {
           ArraySumma.sum(strings);
        }catch (MyArrayDataException e){
           e.printStackTrace();
        }catch (MyArraySizeException e){
           e.printStackTrace();
        }
    }
}
