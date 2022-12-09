public static String getDiaPorExtenso(int dia) throws Exception {
    String dias[] = {"zero", "um", "dois", "três","quatro", "cinco", "seis", "sete", "oito", "nove"};
    String retorno = "";

    if (dia < 1 || dia > 31) {
        throw new Exception("Não existe esse dia em nenhum mês do ano");
    }
    else if (dia < 10) {
        retorno = dias[dia];
    }
    else if (dia < 20) {
        retorno = new String[]{
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
        }[dia - 10];
    }
    else if (dia < 30) {
        if (dia == 20) {
            retorno = "vinte";
        }
        else {
            retorno = "vinte e " + dias[dia - 20];
        }
    }
    else {
        if (dia == 30) {
            retorno = "trinta";
        }
        else {
            retorno = "trinta e " + dias[dia - 30];
        }
    }

    // Capitaliza apenas a primeira letra do dia.
    return retorno.substring(0, 1).toUpperCase() + retorno.substring(1);
}