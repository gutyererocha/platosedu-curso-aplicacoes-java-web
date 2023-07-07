package Usuario;

import com.sun.jdi.connect.spi.Connection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;

@ManagedBean
@ReferencedBean
public class Usuario {
    String nome, email;
    
    public Usuario() {
        
    }
    
    public boolean salvar() {
        int result = 0;
        
        try{
            DriverManaged.registerDriver(new com.mysql.jdbc.Driver());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetodb","gutyererocha","123456");
            PreparedStatement stmt = con.prepareStatement("insert into usuario(nome,email) values(?,?)");
            stmt.setString(1, this.getNome());
            stmt.setString(2, this.getEmail());
            result = stmt.executeUpdate();
        }catch(Exception e) {
            System.out.println(e);
        }
        if (result == 1){
            return true;
        }else
            return false;
        
    }
    
    public String submit() {
        if(this.salvar())
            return "resposta.xhtml";
        else
            return "index.xhtml";
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
