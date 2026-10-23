package org.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Controller único de TODAS as telas da atividade.
 * Cada FXML carrega sua própria instância; só os campos (fx:id) que
 * existem naquela tela são preenchidos, os outros ficam null.
 */
public class Atividade2Controller {

    // ---------- campos de todas as telas ----------
    @FXML private TextField tfNome, tfCidade, tfEstoque, tfReceberMercadoria, tfVenderPecas;          // LojaRoupas
    @FXML private TextField tfCor, tfTamanho, tfPreco, tfAplicarDesconto, tfAjustarTamanho;          // Terno
    @FXML private TextField tfEstampa, tfCalcularTotal, tfTrocarCor;                                  // Camisa
    @FXML private TextField tfPrecoIngresso;                                                          // AtracaoTuristica
    @FXML private TextField tfRoteiro, tfDuracaoHoras, tfEstenderDuracao;                             // Passeio
    @FXML private TextField tfIdioma, tfAnosExperiencia, tfConduzirGrupo, tfTrocarIdioma;             // GuiaTuristico
    @FXML private TextField tfOrigem, tfMaterial, tfUsarEmCerimonia;                                  // Mascara
    @FXML private TextField tfAlturaCm, tfRedimensionar;                                              // Escultura
    @FXML private TextField tfDiametroCm, tfTocar;                                                    // Tambor
    @FXML private TextField tfEstilo, tfIdade, tfDesenhar, tfMudarEstilo;                             // PersonagemManga
    @FXML private TextField tfTitulo, tfAutor, tfVolumes, tfCalcularPaginas;                          // Manga
    @FXML private TextField tfObraPrincipal, tfAnosCarreira, tfDesenharCapitulo, tfPublicarObra;      // Mangaka
    @FXML private TextArea taSaida;

    // ---------- objetos ----------
    private Roupas loja;
    private Terno terno;
    private Camisa camisa;
    private Atracao atracao;
    private Passeio passeio;
    private Guia guia;
    private Mascara mascara;
    private Escultura escultura;
    private Tambor tambor;
    private Personagem personagem;
    private Manga manga;
    private Mangaka mangaka;

    // ---------- auxiliares ----------
    private void log(String msg) {
        taSaida.appendText(msg + "\n");
    }

    private boolean ok(Object o) {
        if (o == null) {
            log("Crie o objeto primeiro.");
            return false;
        }
        return true;
    }

    private int inteiro(TextField tf) {
        return Integer.parseInt(tf.getText().trim());
    }

    private double decimal(TextField tf) {
        return Double.parseDouble(tf.getText().trim().replace(",", "."));
    }

    /** Descobre qual tela está aberta pelo campo que só ela possui. */
    private String tela() {
        if (tfEstoque != null) return "loja";
        if (tfTamanho != null) return "terno";
        if (tfEstampa != null) return "camisa";
        if (tfPrecoIngresso != null) return "atracao";
        if (tfRoteiro != null) return "passeio";
        if (tfIdioma != null) return "guia";
        if (tfOrigem != null) return "mascara";
        if (tfAlturaCm != null) return "escultura";
        if (tfDiametroCm != null) return "tambor";
        if (tfEstilo != null) return "personagem";
        if (tfTitulo != null) return "manga";
        if (tfObraPrincipal != null) return "mangaka";
        return "";
    }

    // ---------- navegação (tela Atividade2) ----------
    @FXML private void abrirLojaRoupas(ActionEvent e)       { Navegacao.ir(e, "Roupas.fxml", "Loja de Roupas"); }
    @FXML private void abrirTerno(ActionEvent e)            { Navegacao.ir(e, "Terno.fxml", "Terno"); }
    @FXML private void abrirCamisa(ActionEvent e)           { Navegacao.ir(e, "camisa.fxml", "Camisa"); }
    @FXML private void abrirAtracaoTuristica(ActionEvent e) { Navegacao.ir(e, "Atracao.fxml", "Atração Turística"); }
    @FXML private void abrirPasseio(ActionEvent e)          { Navegacao.ir(e, "passeio.fxml", "Passeio"); }
    @FXML private void abrirGuiaTuristico(ActionEvent e)    { Navegacao.ir(e, "Guia.fxml", "Guia Turístico"); }
    @FXML private void abrirMascara(ActionEvent e)          { Navegacao.ir(e, "mascara.fxml", "Máscara"); }
    @FXML private void abrirEscultura(ActionEvent e)        { Navegacao.ir(e, "Escultura.fxml", "Escultura"); }
    @FXML private void abrirTambor(ActionEvent e)           { Navegacao.ir(e, "Tambor.fxml", "Tambor"); }
    @FXML private void abrirPersonagemManga(ActionEvent e)  { Navegacao.ir(e, "Personagem.fxml", "Personagem de Mangá"); }
    @FXML private void abrirManga(ActionEvent e)            { Navegacao.ir(e, "Manga.fxml", "Mangá"); }
    @FXML private void abrirMangaka(ActionEvent e)          { Navegacao.ir(e, "Mangaka.fxml", "Mangaká"); }

    // ---------- voltar ----------
    @FXML private void voltar(ActionEvent e)     { Navegacao.ir(e, "BotoesImagem.fxml", "Imagens"); }
    @FXML private void voltarMenu(ActionEvent e) { Navegacao.ir(e, "Menu.fxml", "Menu"); }

    // ---------- CRIAR (todas as telas) ----------
    @FXML
    private void criar() {
        try {
            switch (tela()) {
                case "loja" -> { loja = new Roupas(tfNome.getText(), tfCidade.getText(), inteiro(tfEstoque)); log("Loja criada com sucesso."); }
                case "terno" -> { terno = new Terno(tfCor.getText(), tfTamanho.getText(), decimal(tfPreco)); log("Terno criado com sucesso."); }
                case "camisa" -> { camisa = new Camisa(tfCor.getText(), tfEstampa.getText(), decimal(tfPreco)); log("Camisa criada com sucesso."); }
                case "atracao" -> { atracao = new Atracao(tfNome.getText(), tfCidade.getText(), decimal(tfPrecoIngresso)); log("Atração criada com sucesso."); }
                case "passeio" -> { passeio = new Passeio(tfRoteiro.getText(), inteiro(tfDuracaoHoras), decimal(tfPreco)); log("Passeio criado com sucesso."); }
                case "guia" -> { guia = new Guia(tfNome.getText(), tfIdioma.getText(), inteiro(tfAnosExperiencia)); log("Guia criado com sucesso."); }
                case "mascara" -> { mascara = new Mascara(tfNome.getText(), tfOrigem.getText(), tfMaterial.getText()); log("Máscara criada com sucesso."); }
                case "escultura" -> { escultura = new Escultura(tfNome.getText(), decimal(tfAlturaCm), tfMaterial.getText()); log("Escultura criada com sucesso."); }
                case "tambor" -> { tambor = new Tambor(tfNome.getText(), decimal(tfDiametroCm), tfMaterial.getText()); log("Tambor criado com sucesso."); }
                case "personagem" -> { personagem = new Personagem(tfNome.getText(), tfEstilo.getText(), inteiro(tfIdade)); log("Personagem criado com sucesso."); }
                case "manga" -> { manga = new Manga(tfTitulo.getText(), tfAutor.getText(), inteiro(tfVolumes)); log("Mangá criado com sucesso."); }
                case "mangaka" -> { mangaka = new Mangaka(tfNome.getText(), tfObraPrincipal.getText(), inteiro(tfAnosCarreira)); log("Mangaká criado com sucesso."); }
                default -> { }
            }
        } catch (NumberFormatException e) {
            log("Preencha os campos numéricos corretamente.");
        }
    }

    // ---------- métodos com o mesmo nome em várias telas ----------
    @FXML
    private void descrever() {
        switch (tela()) {
            case "terno" -> { if (ok(terno)) log(terno.descrever()); }
            case "camisa" -> { if (ok(camisa)) log(camisa.descrever()); }
            case "atracao" -> { if (ok(atracao)) log(atracao.descrever()); }
            case "passeio" -> { if (ok(passeio)) log(passeio.descrever()); }
            case "mascara" -> { if (ok(mascara)) log(mascara.descrever()); }
            case "escultura" -> { if (ok(escultura)) log(escultura.descrever()); }
            case "tambor" -> { if (ok(tambor)) log(tambor.descrever()); }
            case "manga" -> { if (ok(manga)) log(manga.descrever()); }
            default -> { }
        }
    }

    @FXML
    private void apresentar() {
        switch (tela()) {
            case "loja" -> { if (ok(loja)) log(loja.apresentar()); }
            case "guia" -> { if (ok(guia)) log(guia.apresentar()); }
            case "personagem" -> { if (ok(personagem)) log(personagem.apresentar()); }
            case "mangaka" -> { if (ok(mangaka)) log(mangaka.apresentar()); }
            default -> { }
        }
    }

    @FXML
    private void aplicarDesconto() {
        try {
            switch (tela()) {
                case "terno" -> { if (ok(terno)) log(terno.aplicarDesconto(decimal(tfAplicarDesconto))); }
                case "atracao" -> { if (ok(atracao)) log(atracao.aplicarDesconto(decimal(tfAplicarDesconto))); }
                default -> { }
            }
        } catch (NumberFormatException e) {
            log("Valor inválido.");
        }
    }

    @FXML
    private void calcularTotal() {
        try {
            switch (tela()) {
                case "camisa" -> { if (ok(camisa)) log(String.format("Total: R$ %.2f", camisa.calcularTotal(inteiro(tfCalcularTotal)))); }
                case "atracao" -> { if (ok(atracao)) log(String.format("Total: R$ %.2f", atracao.calcularTotal(inteiro(tfCalcularTotal)))); }
                default -> { }
            }
        } catch (NumberFormatException e) {
            log("Valor inválido.");
        }
    }

    // ---------- LojaRoupas ----------
    @FXML
    private void receberMercadoria() {
        if (!ok(loja)) return;
        try { log(loja.receberMercadoria(inteiro(tfReceberMercadoria))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    @FXML
    private void venderPecas() {
        if (!ok(loja)) return;
        try { log(loja.venderPecas(inteiro(tfVenderPecas))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    // ---------- Terno ----------
    @FXML
    private void ajustarTamanho() {
        if (!ok(terno)) return;
        log(terno.ajustarTamanho(tfAjustarTamanho.getText()));
    }

    // ---------- Camisa ----------
    @FXML
    private void trocarCor() {
        if (!ok(camisa)) return;
        log(camisa.trocarCor(tfTrocarCor.getText()));
    }

    // ---------- Passeio ----------
    @FXML
    private void calcularPrecoPorHora() {
        if (!ok(passeio)) return;
        log(String.format("Preço por hora: R$ %.2f", passeio.calcularPrecoPorHora()));
    }

    @FXML
    private void estenderDuracao() {
        if (!ok(passeio)) return;
        try { log(passeio.estenderDuracao(inteiro(tfEstenderDuracao))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    // ---------- GuiaTuristico ----------
    @FXML
    private void conduzirGrupo() {
        if (!ok(guia)) return;
        try { log(guia.conduzirGrupo(inteiro(tfConduzirGrupo))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    @FXML
    private void trocarIdioma() {
        if (!ok(guia)) return;
        log(guia.trocarIdioma(tfTrocarIdioma.getText()));
    }

    // ---------- Mascara ----------
    @FXML
    private void usarEmCerimonia() {
        if (!ok(mascara)) return;
        log(mascara.usarEmCerimonia(tfUsarEmCerimonia.getText()));
    }

    @FXML
    private void restaurar() {
        if (!ok(mascara)) return;
        log(mascara.restaurar());
    }

    // ---------- Escultura ----------
    @FXML
    private void redimensionar() {
        if (!ok(escultura)) return;
        try { log(escultura.redimensionar(decimal(tfRedimensionar))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    @FXML
    private void polir() {
        if (!ok(escultura)) return;
        log(escultura.polir());
    }

    // ---------- Tambor ----------
    @FXML
    private void tocar() {
        if (!ok(tambor)) return;
        log(tambor.tocar(tfTocar.getText()));
    }

    @FXML
    private void afinar() {
        if (!ok(tambor)) return;
        log(tambor.afinar());
    }

    // ---------- PersonagemManga ----------
    @FXML
    private void desenhar() {
        if (!ok(personagem)) return;
        log(personagem.desenhar(tfDesenhar.getText()));
    }

    @FXML
    private void mudarEstilo() {
        if (!ok(personagem)) return;
        log(personagem.mudarEstilo(tfMudarEstilo.getText()));
    }

    // ---------- Manga ----------
    @FXML
    private void lancarVolume() {
        if (!ok(manga)) return;
        log(manga.lancarVolume());
    }

    @FXML
    private void calcularPaginas() {
        if (!ok(manga)) return;
        try { log("Total de páginas: " + manga.calcularPaginas(inteiro(tfCalcularPaginas))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    // ---------- Mangaka ----------
    @FXML
    private void desenharCapitulo() {
        if (!ok(mangaka)) return;
        try { log(mangaka.desenharCapitulo(inteiro(tfDesenharCapitulo))); }
        catch (NumberFormatException e) { log("Valor inválido."); }
    }

    @FXML
    private void publicarObra() {
        if (!ok(mangaka)) return;
        log(mangaka.publicarObra(tfPublicarObra.getText()));
    }
}
