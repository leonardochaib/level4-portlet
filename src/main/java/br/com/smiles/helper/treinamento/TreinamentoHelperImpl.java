package br.com.smiles.helper.treinamento;

import br.com.smiles.ebo.member.v1.MemberType;
import br.com.smiles.services.member.v1.GetMemberResponseType;
import br.com.smiles.vo.MemberVO;
import br.com.smiles.vo.treinamento.TreinamentoVO;
import org.springframework.stereotype.Component;

@Component
public class TreinamentoHelperImpl implements TreinamentoHelper {

    @Override
    public TreinamentoVO createTreinamentoVO(GetMemberResponseType getMemberResponseType){
        TreinamentoVO treinamentoVO = new TreinamentoVO(false);
        setMemberInfo(treinamentoVO,getMemberResponseType);
        return treinamentoVO;
    }

    private void setMemberInfo(TreinamentoVO treinamentoVO, GetMemberResponseType getMemberResponseType){
        if(getMemberResponseType != null && getMemberResponseType.getMember() != null){
            treinamentoVO.setMember(createMemberVO(getMemberResponseType.getMember()));
            treinamentoVO.setLogged(true);
        }
    }

    private MemberVO createMemberVO(MemberType memberType){
        MemberVO memberVO = new MemberVO();
        memberVO.setFirstName(memberType.getFirstName());
        memberVO.setLastName(memberType.getLastName());
        memberVO.setClub(memberType.isIsClubMember());
        memberVO.setCobranded("ACTIVE".equals(memberType.getStatusCobranded()));
        return memberVO;
    }
}
