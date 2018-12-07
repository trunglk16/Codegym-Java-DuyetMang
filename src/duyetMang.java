

public class duyetMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        java.util.Scanner input = new java.util.Scanner(System.in);

        String name = input.nextLine();
        boolean flag = false;
        int j = 0;

        for (int i = 0; i < students.length ; i++) {
            if(students[i].equals(name)){
                flag = true;
                j = i;
                break;
            }
        }
        if (flag){
            System.out.println("Ten ban can tim nam o vi tri thu " +(j+1)+" trong mang");
        }else{
            System.out.println("Ten ban tim khong co trong danh sach");
        }
    }
}
