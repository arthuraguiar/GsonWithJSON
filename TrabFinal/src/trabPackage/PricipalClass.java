package trabPackage;

import com.google.gson.Gson;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PricipalClass {

    static StringBuffer memoria = new StringBuffer();

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = GetAlunos();
        Turma turma = new Turma();
        turma.setAlunos(alunos);
        SaveTurmaToJson(turma);
        RunMenu();

    }

    public static void RunMenu() {
        try {
            int opcao = 0;

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Opcao:"
                        + "\n" + "1: Mostrar todos os Alunos"
                        + "\n" + "2: Pesquisar por Matricula"
                        + "\n" + "3: Sair do Menu"));

                switch (opcao) {
                    case 1:
                        ShowAllAlunos();
                        break;
                    case 2:
                        GetAlunoByMatricula();
                        break;
                    default:
                        break;
                }
            } while (opcao != 3);

        } catch (Exception ex) {

        }
    }

    public static Turma GetTurmaFromJson() {

        try {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Arthur\\Documents\\turma.json"));
            Turma turma = gson.fromJson(br, Turma.class);
            return turma;
            //Converte String JSON para objeto Java
        } catch (Exception e) {
            return null;
        }
    }

    public static void SaveTurmaToJson(Turma turma) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(turma);
            FileWriter writer = new FileWriter("C:\\Users\\Arthur\\Documents\\turma.json");
            writer.write(json);
            writer.close();

        } catch (Exception e) {
            System.out.println("");
        }
    }

    public static ArrayList<Aluno> GetAlunos() {
        try {
            String arquivo = EscolherArquivo.caminho();
            BufferedReader arqentrada;
            arqentrada = new BufferedReader(new FileReader(arquivo));
            String linha;
            int cont = 0;
            String[] linhas = new String[50];
            while ((linha = arqentrada.readLine()) != null) {
                linhas[cont] = linha;
                cont++;
            }
            ArrayList<Aluno> alunos = MontaAlunos(linhas, cont);
            arqentrada.close();

            return alunos;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public static ArrayList<Aluno> MontaAlunos(String[] vet, int count) {
        ArrayList<Aluno> alunos = new ArrayList();

        for (int i = 1; i < count; i++) {
            Aluno aluno = new Aluno();
            String[] values = vet[i].split(",");
            aluno.setMatricula(values[1]);
            aluno.setIdade(values[2]);
            aluno.setCR(values[3]);
            aluno.setPeriodoVigente(values[4]);
            aluno.setAltura(values[5]);
            aluno.setFazEstagio(values[6]);
            aluno.setNlivros(values[7]);
            aluno.setCidade(values[8]);
            aluno.setLinguagem(values[9]);
            aluno.setSerieFav(values[10]);
            aluno.setTime(values[11]);
            aluno.setSistemaOperacional(values[12]);
            alunos.add(aluno);
        }

        return alunos;
    }

    public static void DisplayText(String texto) {
        JTextArea textArea = new JTextArea(texto);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        JOptionPane.showMessageDialog(null, scrollPane, "Alunos",
                JOptionPane.YES_NO_OPTION);
        
    }

    public static void ShowAllAlunos() {
        try {
            Turma turma = GetTurmaFromJson();
            String alunos = "";
            for (Aluno aluno : turma.getAlunos()) {
                alunos += aluno.toString();
                alunos += "********************************* \n \n";
            }
            DisplayText(alunos);
        } catch (Exception e) {
        }
    }

    public static void GetAlunoByMatricula(){
        try {
            String matricula = JOptionPane.showInputDialog("Digite a Matrícula "
                    + "do Aluno desejado");
            
            Turma turma = GetTurmaFromJson();
            for (Aluno aluno : turma.getAlunos()) {
                String matriculaList = aluno.getMatricula();
                if(matricula.equals(matriculaList)){
                    JOptionPane.showMessageDialog(null, aluno.toString());
                }
                return;
            }
            
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar o Aluno");
            
        } catch (Exception e) {
        }
    }
}
