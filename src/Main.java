import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Servico> listaServico1;
    public static List<Servico> listaServico2;
    static Servico servico1;

    public static void main(String[] args) {
        popularServicos();
        getPostOrderTraversal();

    }

    public static ArrayList<Servico> getPostOrderTraversal() {
        ArrayList<Servico> postOrder = new ArrayList<>();
        buildPostOrder(servico1, postOrder);
        return postOrder;
    }

    private static void buildPostOrder(Servico node, ArrayList<Servico> postOrder) {
        for (Servico child : node.getDependencias()) {
            buildPostOrder(child, postOrder);
        }
        postOrder.add(node);
    }

    public static void popularServicos(){
        listaServico1 = new ArrayList<>();
        listaServico2 = new ArrayList<>();

        servico1 = new Servico();
        servico1.setId(1);
        servico1.setDescricao("Servico 1");
        servico1.setDependencias(listaServico1);

        Servico servico2 = new Servico();
        servico2.setId(2);
        servico2.setDescricao("Servico 2");
        servico2.setDependencias(listaServico2);

        Servico servico3 = new Servico();
        servico3.setId(3);
        servico3.setDescricao("Servico 3");
        servico3.setDependencias(new ArrayList<>());

        Servico servico4 = new Servico();
        servico4.setId(4);
        servico4.setDescricao("Servico 4");
        servico4.setDependencias(new ArrayList<>());

        Servico servico5 = new Servico();
        servico5.setId(5);
        servico5.setDescricao("Servico 5");
        servico5.setDependencias(new ArrayList<>());

        Servico servico6 = new Servico();
        servico6.setId(6);
        servico6.setDescricao("Servico 6");
        servico6.setDependencias(new ArrayList<>());

        listaServico1.add(servico2);
        listaServico1.add(servico3);
        listaServico1.add(servico4);

        listaServico2.add(servico5);
        listaServico2.add(servico6);

        System.out.println("ok");
    }
}
