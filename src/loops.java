public class loops {

    public static void main(String[] args) {
        for(int i = 50; i <= 55; i++) {
            System.out.println(i * 5);
        }
        int[] numbers = {12,16,9,4,22,104,66};
        for (int i = 0; i <7; i++){
            System.out.println(numbers[i]);
        }
        int counter = 0;
        while (counter <10) {
            System.out.println("Hello");
            counter++;
        }
        System.out.println("finished");

        int[] selectedNumbers = {3,5,7,9,3,1,8,6,4,2};
        int counter2 = 0;
        while (selectedNumbers[counter2]<7){
            System.out.println(selectedNumbers[counter2]);
            counter2++;
        }



    }


}
