package model;

public class Professor extends Usuario implements IUsuario{

  private int matriculaProfessor;
	private String nome;
	private String especialidade;
	
	
	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}
	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	

    
    
    
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String login, String senha, int tipo) {
		super(login, senha, tipo);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Professor(String login, String senha, int tipo, String nome, String especialidade,int matriculaProfessor) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	@Override
	
	public boolean validarLogin(String login, String senha) {
		if (getLogin().equals(login)&& getSenha().equals(senha )) {
			return true;
		}
           return false;
	}
	
	
	
	
	
	@Override
	 public void mostrar() {
		System.out.println("Informações do Professor:");
		System.out.println("Login:"+ super.getLogin());
		System.out.println("senha:*****");
		
		System.out.println("Matrícula:"+matriculaProfessor);
		System.out.println("Nome:"+nome);
		System.out.println("Especialidade:"+especialidade);
		
				
		
		
		
		
		
	}
	
	
	
	
	
}
