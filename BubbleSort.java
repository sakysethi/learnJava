package JavaPrograms100;

// Sorting string using Bubble Sorting Technique
class sorting {
    public void working() {
        String name[] = {
                "Shruti", "Shashank", "Yogita", "Dheeraj", "Ratnesh", "Sharad", "Vanya" };
        for (int j = 0; j < name.length; j++) {
            for (int i = j + 1; i < name.length; i++) {
                if (name[i].compareTo(name[j]) < 0) {
                    String temp = name[j];
                    name[j] = name[i];
                    name[i] = temp;
                }
            }
            System.out.println(name[j]);
        }
    }
}
