package br.com.smiles.vo.treinamento;

import br.com.smiles.vo.MemberVO;

public class TreinamentoVO {

    private boolean logged;
    private MemberVO member;

    public TreinamentoVO(){

    }

    public TreinamentoVO(boolean logged){
        this.logged = logged;
    }

    public boolean isLogged() {
        return logged;
    }

    public void setLogged(boolean logged) {
        logged = logged;
    }

    public MemberVO getMember() {
        return member;
    }

    public void setMember(MemberVO member) {
        this.member = member;
    }
}
