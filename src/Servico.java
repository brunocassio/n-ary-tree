import java.util.List;

/**
 * Created by bru9isk on 27/10/16.
 */
public class Servico {

    private Integer id;

    private String descricao;

    private List<Servico> dependencias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Servico> getDependencias() {
        return dependencias;
    }

    public void setDependencias(List<Servico> dependencias) {
        this.dependencias = dependencias;
    }
}
