package br.com.smiles.helper.treinamento;

import br.com.smiles.services.member.v1.GetMemberResponseType;
import br.com.smiles.vo.treinamento.TreinamentoVO;

public interface TreinamentoHelper {
    TreinamentoVO createTreinamentoVO(GetMemberResponseType getMemberResponseType);
}
