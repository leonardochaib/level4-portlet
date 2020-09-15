package br.com.smiles.service.treinamento;

import br.com.smiles.helper.client.MemberClientHelper;
import br.com.smiles.helper.treinamento.TreinamentoHelper;
import br.com.smiles.services.member.v1.GetMemberResponseType;
import br.com.smiles.services.member.v1.MemberPort;
import br.com.smiles.vo.treinamento.TreinamentoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreinamentoServiceImpl implements TreinamentoService {

    private static final Logger LOGGER        = LoggerFactory.getLogger(TreinamentoServiceImpl.class);
    private static final String ERROR_CLIENT  = "ERROR: Ocorreu um erro na chamada do SOA: {}";

    @Autowired
    private MemberPort memberPortClient;

    @Autowired
    private MemberClientHelper memberClientHelper;

    @Autowired
    private TreinamentoHelper treinamentoHelper;

    @Override
    public TreinamentoVO getTreinamentoInfo(String memberNumber){
        return treinamentoHelper.createTreinamentoVO(getMemberResponseType(memberNumber));
    }

    private GetMemberResponseType getMemberResponseType(String memberNumber){
        try {
            return memberPortClient.getMember(memberClientHelper.createGetMemberRequestTypeWithNumber(memberNumber));
        } catch (Exception exception) {
            LOGGER.error(ERROR_CLIENT,exception.getMessage());
            return null;
        }
    }
}
