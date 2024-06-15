import java.util.ArrayList;
import java.util.List;

public class Cliente  {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String rg;
    protected List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nome, String cpf, String dataNascimento, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;


    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRg() {
        return rg;
    }



}
