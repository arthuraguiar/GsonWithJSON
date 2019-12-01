package trabPackage;

public class Aluno {

    private String Matricula;
    private String Idade;
    private String CR;
    private String PeriodoVigente;
    private String Altura;
    private String FazEstagio;
    private String Nlivros;
    private String Cidade;
    private String Linguagem;
    private String SerieFav;
    private String Time;
    private String SistemaOperacional;

    /**
     * @return the Matricula
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the Idade
     */
    public String getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the CR
     */
    public String getCR() {
        return CR;
    }

    /**
     * @param CR the CR to set
     */
    public void setCR(String CR) {
        this.CR = CR;
    }

    /**
     * @return the PeriodoVigente
     */
    public String getPeriodoVigente() {
        return PeriodoVigente;
    }

    /**
     * @param PeriodoVigente the PeriodoVigente to set
     */
    public void setPeriodoVigente(String PeriodoVigente) {
        this.PeriodoVigente = PeriodoVigente;
    }

    /**
     * @return the Altura
     */
    public String getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the FazEstagio
     */
    public String getFazEstagio() {
        return FazEstagio;
    }

    /**
     * @param FazEstagio the FazEstagio to set
     */
    public void setFazEstagio(String FazEstagio) {
        this.FazEstagio = FazEstagio;
    }

    /**
     * @return the Nlivros
     */
    public String getNlivros() {
        return Nlivros;
    }

    /**
     * @param Nlivros the Nlivros to set
     */
    public void setNlivros(String Nlivros) {
        this.Nlivros = Nlivros;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Linguagem
     */
    public String getLinguagem() {
        return Linguagem;
    }

    /**
     * @param Linguagem the Linguagem to set
     */
    public void setLinguagem(String Linguagem) {
        this.Linguagem = Linguagem;
    }

    /**
     * @return the SerieFav
     */
    public String getSerieFav() {
        return SerieFav;
    }

    /**
     * @param SerieFav the SerieFav to set
     */
    public void setSerieFav(String SerieFav) {
        this.SerieFav = SerieFav;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the SistemaOperacional
     */
    public String getSistemaOperacional() {
        return SistemaOperacional;
    }

    /**
     * @param SistemaOperacional the SistemaOperacional to set
     */
    public void setSistemaOperacional(String SistemaOperacional) {
        this.SistemaOperacional = SistemaOperacional;
    }

    public Aluno() {

    }
    
    @Override
    public String toString(){
        return ("Aluno: "+ this.Matricula +"\n"+
                "Coeficiente: "+ this.CR +"\n"+
                "Idade: "+ this.Idade +"\n"+
                "Altura: "+ this.Altura +"\n"+
                "Faz Estagio: "+ this.FazEstagio +"\n"+
                "Cidade: "+ this.Cidade +"\n"+
                "Periodo: "+ this.PeriodoVigente +"\n"+
                "Serie Favorita: "+ this.SerieFav +"\n"+
                "Linguagem de Programacao: "+ this.Linguagem +"\n"+
                "Sistema Operacional: "+ this.SistemaOperacional +"\n"+
                "Numero de Livros: "+ this.Nlivros +"\n"+
                "Time de Futebol: "+ this.Time +"\n");
    }

}
