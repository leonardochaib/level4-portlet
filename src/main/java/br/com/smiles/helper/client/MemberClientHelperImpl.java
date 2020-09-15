package br.com.smiles.helper.client;

import br.com.smiles.services.member.v1.GetMemberRequestType;
import org.springframework.stereotype.Component;

@Component
public class MemberClientHelperImpl implements MemberClientHelper {

    @Override
    public GetMemberRequestType createGetMemberRequestTypeWithNumber(String memberNumber){
        GetMemberRequestType getMemberRequestType = new GetMemberRequestType();
        getMemberRequestType.setMemberNumber(memberNumber);
        return getMemberRequestType;
    }

    @Override
    public GetMemberRequestType createGetMemberRequestTypeWithCpf(String cpf){
        GetMemberRequestType getMemberRequestType = new GetMemberRequestType();
        getMemberRequestType.setCpf(cpf);
        return getMemberRequestType;
    }
}
