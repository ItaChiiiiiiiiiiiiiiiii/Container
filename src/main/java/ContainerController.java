import java.util.ArrayList;
import java.util.Scanner;

public class ContainerController {
    Container c = new Container();

    Scanner sc= new Scanner(System.in);
    public ArrayList<Container> addCon (ArrayList<Container> conList) {
        while(true){
            System.out.println("Ban co muon them 1 container? Chon 1 de nhap 2 de thoat");
            String i = sc.nextLine();
            if(i.equals("1")){
                System.out.println("Moi ban nhap vao id cua container ");
                c.setIdContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao chieu dai cua container: ");
                c.setLengthContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao chieu cao cua container: ");
                c.setHeightContainer(sc.nextLine());
                System.out.println("Moi ban nhap vao loai container (dong lanh/ thuong): ");
                c.setKindContainer(sc.nextLine());
                System.out.println("Moi ban nhap tinh trang xua container( dung duoc hay khong) : ");
                c.setActiveFlag(sc.nextBoolean());
                conList.add(c);
            }
            else if(i.equals("2"))break;
        }
        return conList;
    }
    public void displayContainer(ArrayList<Container>conList1){
        for (Container c1: conList1
             ) {
            System.out.println(c1.toString());
        }
    }
    /*public void checkKindContainer(ArrayList<Container>conList){
        ArrayList<Container>frozenConList = new ArrayList<Container>();
        ArrayList<Container>normalConList = new ArrayList<Container>();
        if(c.getKindContainer()=="dong lanh") {
            frozenConList.add(c);
        }
        else if(c.getKindContainer()=="thuong"){
            normalConList.add(c);
        }*/

    //}
}

