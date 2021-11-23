package mail_sender;

import lombok.Getter;

@Getter
public class Client {
    private int id, age;
    private String name;
    private Gender sex;

    public Client(String name, int age, Gender sex) {
        this.id = ClientIdGenetor.generateId();
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static class ClientIdGenetor{
        private static int currentId = -1;

        public static int generateId(){
            currentId++;
            return currentId;
        }
    }
}
