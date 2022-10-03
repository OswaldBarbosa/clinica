package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {

    /*
    
    Essa classe será responsável pela persistecia de dados
    das especialidades, por exemplo,adicionar uma nova especialidade
    excluir uma espeilaidade, etc.
    
     */
    private static ArrayList<Especialidade> especialidade = new ArrayList<>();

    public static void gravar(Especialidade e) {   // CREATE
        especialidade.add(e);
    }

    public static ArrayList<Especialidade> getEspecialidades() {  //READ
        return especialidade;
    }

    public static Especialidade getEspecialidade(Integer codigo) {

        for (Especialidade e : especialidade) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        return null;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {  // UPDATE
        for (Especialidade e : especialidade) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidade.set(especialidade.indexOf(e), especialidadeAtualizada);
                break;
            }
            i++;
        }
    }

    public static void excluir(Integer codigo) {  //DELETE

        for (Especialidade e : especialidade) {
            if (e.getCodigo() == codigo) {
                especialidade.remove(e);
                break;
            }
        }
    }

}
