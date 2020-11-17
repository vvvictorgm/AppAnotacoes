package com.barbaburguer.minhasanotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencias {
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private static final String NOME_ARQUIVO = "anotacao.preferencias";
    private static final String CHAVE_NOME = "nome";

    public AnotacaoPreferencias(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao){
        editor.putString(CHAVE_NOME, anotacao);
        editor.commit();
    }
    public String recuperarAnotacao(){


        return preferences.getString(CHAVE_NOME, "");
    }
}
