class BaseOperations {
    

    public static void printArray(int[] array) {
        System.out.print("[");
        //print integer array within bracket
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                //print out the last one without comma
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(String[] array) {
        System.out.print("[");
        //print String array 
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                //print out the last one without comma
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("] \n");
    }

    public static void printArray(float[] array) {
        System.out.print("[");
        //print float array
        for (int i = 0; i < array.length; i++) {
            //last one without comma
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.print("] \n");
    }

    public static int[] reverseArray(int[] array) {
        //create a new array 
        int[] reversed = new int[array.length];
        //start from the first number
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            //receive the number and put into the array
            reversed[k] = array[i];
            k++;
        }
        return reversed;
    }

    public static String[] reverseArray(String[] array) {
        //create a new array to receive the reversed array
        String[] reversed = new String[array.length];
        //start from the first number
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            //receive the number and put into the array
            reversed[k] = array[i];
            k++;
        }
        return reversed;
    }

    public static float[] reverseArray(float[] array) {
        //create a new array to receive the reversed array
        float[] reversed = new float[array.length];
        //start from the first number
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            //receive the number and put into the array
            reversed[k] = array[i];
            k++;
        }
        return reversed;
    }

    public static void main(String[] arges) {
        //define 3 arrays with integer, String and float variables
        int[] array = {1, 2, 3, 4, 5, 6};
        String[] array2 = {"Hello", "How", "are", "you"};
        float[] array3 = {2.2f, 2.3f, 6.2f, 0.5f, -5.3f};

        //call printArray methods for 3 arrays
        printArray(array);
        printArray(array2);
        printArray(array3);

        System.out.println("--------After reversion-----------");

        //call reverseArray methods to assign them into new reverseArrays
        int[] reversedArray = reverseArray(array);
        String[] reversedArray2 = reverseArray(array2);
        float []reversedArray3 = reverseArray(array3);

        //print out the reversed arrays
        printArray(reversedArray);
        printArray(reversedArray2);
        printArray(reversedArray3);
    }
}







