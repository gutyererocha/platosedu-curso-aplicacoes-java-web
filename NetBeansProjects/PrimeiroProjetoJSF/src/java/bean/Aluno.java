package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class Aluno {
    String nome;
    String senha;
    
    public Aluno(){
        
    }
    
    public String validar() {
        if(nome.equals("Ana") && senha.equals("123")){
            return "principal";
        }
        else{
            FacesMessage fm = new FacesMessage("Login ou senha incorretos");
            FacesContext.getCurrentInstance().addMessage("msg", fm);
            return null;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
