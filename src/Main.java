
public class Main {
    public static void main(String args[]) {
        int[] heights = new int[3];
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(heights[0]+heights[1]+heights[2]);
        boolean[] bools = new boolean[6];
        bools[0] = true;
        bools[1] = false;
        bools[2] = true;
        bools[3] = false;
        bools[4] = true;
        bools[5] = false;
        bools[0] = bools[3];
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String name = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = name;
        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);
        double[] array1 = {7.5,10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = new double[2];
        array3[0] = array1[0] + array2[0];
        array3[1] = array1[1] * array2[1];
        System.out.println(array3[0]);
        System.out.println(array3[1]);
        String[] animals = new String[4];
        int i = 0;
        while(i <= 3) {
            System.out.println(animals[i]);
            i++;
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        System.out.print(animals[3]);
        animals[1] += "s";
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals.length);

        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);
        Dog[] dogs = {dog1,dog2,dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());

    }






}
