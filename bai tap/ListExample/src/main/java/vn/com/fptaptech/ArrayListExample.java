package vn.com.fptaptech;
import java.util.ArrayList;
import java.util.List;
public class ArrayListExample {
    public void methodArrayList(){
        // tao arraylist co 2 cach
        //cach 1:
        ArrayList<String> animals= new ArrayList<>();
        //cach 2:
        List<String> cars = new ArrayList<>();
        //them phan tu vao arraylist
        animals.add("vet");
        animals.add("dog");
        animals.add("cat");
        // hien thi
        System.out.println(animals);
        //them pt vao vi tri xac dinh
        animals.add(2,"Buffalo");
        System.out.println(animals);
        // kiem tra kich thuoc arraylist
        int size = animals.size();
        System.out.println("kich thuoc cua arraylist: " +size);
        // su dung vong lap foreach de lap trong mot arraylist
        for (String am : animals){
            System.out.println(am);
        }
        // truy cap den mot phan tu dc xac dinh trong arraylist
        System.out.println("phan tu co index =2 la: " +animals.get(2));
        //cap nhat ( sua gia tri trong arraylist )
        animals.set(1,"pig"); //sua dung set yhem dung add
        //xoa 1 phan tu trong arraylist
        animals.remove("buffalo"); // xoa du vao gia tri cua pt
        animals.remove("1");//xoa dua vao index
        //xoa toan bo
        animals.clear();
        System.out.println("kich thuoc cua Arraylist " +animals.size());
    }
}
