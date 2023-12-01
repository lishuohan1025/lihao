package duotai;

public class Ploy {
    public static void main(String[] args){
    //
        duotai01[] persons = new duotai01[5];
        persons [0] = new duotai01("jack",20);
        persons [1] = new Student("jack",18,100);
        persons [2] = new Student("smith",19,30.1);
        persons [3] = new teacher("scott",30,30000);
        persons [4] = new teacher("king", 50, 25000);
        for(int i = 0; i < persons.length; i++){
           System.out.println(persons[i].say());
        }
    }


}
