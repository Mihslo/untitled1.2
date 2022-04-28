package gb.HomeWorkApp4;

public class ArraySumma {
    public static  final int SIZE=4;
    public static int sum(String[][] arr){
        int sum=0;
        for (int x=0;x< arr.length;x++){
            if(arr[x].length!=SIZE){
                throw new MyArraySizeException("Не соответвие длины массива");}
            for (int y=0;y<arr[x].length;y++){
                try {
                    sum+=Integer.parseInt(arr[x][y]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y + 1));
                }
            }
        }
        System.out.println("Sum="+sum);
        return sum;
    }

}
