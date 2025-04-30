
public class Cliente {
    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Digite nome");
            throw new IllegalArgumentException("digite um nome valido");
        }
        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("Digite um valor válido");
        }
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }


}
