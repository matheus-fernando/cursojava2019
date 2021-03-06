package model;

public class Aluno extends Usuario implements IUsuario {

	private String nome;
	private String turno;
	private String turma;
	private int matriculaAluno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}

   public String getTurno() {
	   return turno;
   }

   public void setTurno(String turno) {
	   this.turno=turno;
   }
   public String getTurma() {
	   return turma;
	   
   }

   public void setTurma(String turma) {
	   this.turma=turma;
   }
   public int getMatriculaAluno() {
	   return matriculaAluno;
   }
    public void setMatriculaAluno(int matriculaAluno) {
    	this.matriculaAluno=matriculaAluno;
    }


    
    public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Aluno(String login, String senha, int tipo,String nome, String turno, String turma, int matriculaAluno) {
		super(login, senha, tipo);
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
		this.matriculaAluno = matriculaAluno;
	}
  @Override
  
  public boolean validarLogin (String login,String senha) {
	  
	  if (getLogin().equals(login)&& getSenha().equals(senha)) {
		  return true;
	  }
	  
	  return false;
  }
  
  
  


@Override

	
	
	
	
    public void mostrar() {
    	System.out.println("Informações do aluno:");
    	System.out.println("login:"+super.getLogin());
    	System.out.println("senha:*****");
    	
    	System.out.println("Matrícula:"+matriculaAluno);
    	System.out.println("Nome:"+nome);
    	System.out.println("Turno:"+turno);
    	System.out.println("Turma:"+turma);
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
}
