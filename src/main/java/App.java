import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Container> listCon = new ArrayList<Container>();
        //ArrayList<Container> listFrozenCon = new ArrayList<Container>();
        //ArrayList<Container> listNormalCon = new ArrayList<Container>();
        ContainerController cc =new ContainerController();
        listCon=cc.addCon(listCon);
        cc.displayContainer(listCon);

    }
}
