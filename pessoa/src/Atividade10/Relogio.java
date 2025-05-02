package Atividade10;


/**
 * Relógio digital simples (formato 24 h).
 */
public class Relogio {
    private int hora;    // 0–23
    private int minuto;  // 0–59
    private int segundo; // 0–59

    /**
     * Construtor. Aceita qualquer valor e normaliza para 0 h–23 h.
     */
    public Relogio(int hora, int minuto, int segundo) {
        // Converte tudo para segundos totais
        int totalSeg = hora * 3600 + minuto * 60 + segundo;

        // Normaliza para o intervalo de um dia (0 a 86 399)
        totalSeg = ((totalSeg % 86_400) + 86_400) % 86_400; // garante positivo

        // Decompõe de volta
        this.hora    = totalSeg / 3600;
        this.minuto  = (totalSeg % 3600) / 60;
        this.segundo = totalSeg % 60;
    }

    /** Avança 1 segundo, tratando rolagem de minuto e hora. */
    public void tic() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora = (hora + 1) % 24;
            }
        }
    }

    /** Devolve a hora no formato “HH:MM:SS”. */
    public String exibir() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}

