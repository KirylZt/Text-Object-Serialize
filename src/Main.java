import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //1
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Text.txt"))) {
//            String word;
//            List<String> list = new ArrayList<>();
//            while ((word = bufferedReader.readLine()) != null) {
//                StringBuffer stringBuffer = new StringBuffer(word);
//                String reverseWord = String.valueOf(stringBuffer.reverse());
//                if (word.equals(reverseWord)) {
//                    list.add(word);
//                }
//            }
//            Files.write(Paths.get("Palindromes.txt"), list);
//        } catch (IOException e) {
//            e.getStackTrace();
//        }

        //2
//        List<String> sentences = Files.readAllLines(Paths.get("TextToCheck.txt"));
//        List<String> blackList = Files.readAllLines(Paths.get("blackList.txt"));
//        int count = 0;
//        for (String sentence: sentences){
//            String[] words = sentence.split(" ");
//            for (String word : words){
//                if (blackList.contains(word)){
//                    count++;
//                    System.out.println(sentence + "нужно отредактировать. Не проходит: " + word);
//                    break;
//                }
//            }
//        }
//        System.out.println("Кол-во предложений на исправление: " + count);


        //3
//        Car car = new Car("BMW", 220, 40000);
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("car.bin"))) {
//            objectOutputStream.writeObject(car);
//        } catch (IOException e) {
//            e.getStackTrace();
//        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("car.bin"))){
            Car car = (Car) objectInputStream.readObject();
            System.out.println(car);
        }catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}