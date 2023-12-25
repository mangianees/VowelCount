public class Main {
    public static void main(String[] args) {
        String str = "Once upon a time";
        int vowelCount = 0;
        for(int i=0; i < str.length(); i++)
        {
            switch (str.toLowerCase().charAt(i)){
                case 'a':
                            vowelCount += 1;
                            break;
                case 'e' :
                            vowelCount += 1;
                            break;
                case 'i':
                    vowelCount += 1;
                    break;
                case 'o' :
                    vowelCount += 1;
                    break;
                case 'u':
                    vowelCount += 1;
                    break;
            }


        }
        System.out.println("Total Vowels= " + Integer.toString(vowelCount));
    }
}