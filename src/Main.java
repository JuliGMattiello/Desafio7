import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Funcionários
        Funcionario funcionario = new Funcionario(1, "Juliana", "04696900975", 5.000);
        FuncionarioService service = new FuncionarioService();
        service.save(funcionario);
        funcionario.setNome(funcionario.getNome() + " - alterado");
        service.update(funcionario);
        FuncionarioRepository repository = new FuncionarioRepository();
        repository.findAll();
        repository.findById(10);


        //Diretor
        Diretor diretor = new Diretor(1, "Silvana", "04696900975", 7.000, 1.000);
        DiretorService service2 = new DiretorService();
        service2.save(diretor);
        diretor.setNome(diretor.getNome() + " - alterado");
        service2.update(diretor);
        DiretorRepository repository2 = new DiretorRepository();
        repository2.findAll();
        repository2.findById(10);

    }

}
