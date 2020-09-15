package br.com.smiles.helper.client;


import br.com.smiles.services.member.v1.GetMemberRequestType;

public interface MemberClientHelper {
    GetMemberRequestType createGetMemberRequestTypeWithNumber(String memberNumber);

    GetMemberRequestType createGetMemberRequestTypeWithCpf(String cpf);
}
