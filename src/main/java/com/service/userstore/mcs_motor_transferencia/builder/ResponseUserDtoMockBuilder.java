package com.service.userstore.mcs_motor_transferencia.builder;

import com.service.userstore.mcs_motor_transferencia.dto.ResponseUserDto;

import java.util.Arrays;
import java.util.List;

public class ResponseUserDtoMockBuilder {

    public static ResponseUserDto buildMock(String username) {
        // Lista de grupos del JSON
        List<String> groups = Arrays.asList(
                "AD/GA_MotorTransferencias_Aprobar_CentroAutorizador",
                "AD/GA_MotorTransferencias_Aprobar_TXN_NAC",
                "AD/GA_MotorTransferencias_TXN_BP",
                "AD/GA_MotorTransferencias_ConsultasCaso",
                "AD/GA_MotorTransferencias_ConsultasCO",
                "Internal/everyone",
                "AD/GA_MotorTransferencias_IngresoTI",
                "AD/GA_MotorTransferencias_ConsultasTI",
                "AD/GA_MotorTransferencias_AdminCO",
                "AD/GA_MotorTransferencias_IngresoIF",
                "AD/GA_MotorTransferencias_ConsultasRO",
                "AD/GA_MotorTransferencias_Consultas_GR",
                "AD/GA_MotorTransferencias_Correccion_GR",
                "AD/GA_TEST_MotorTransferencias_IngresoRemesas",
                "AD/GA_LOGINC_BANCS",
                "AD/GA_MotorTransferencias_ConsultasAF",
                "AD/GA_MotorTransferencias_ConsultasTI_CC",
                "AD/GA_MotorTransferencias_Aprobar_TXN_NA_RA1",
                "AD/GA_MotorTransferencias_TXN_IB",
                "AD/GA_MotorTransferencias_IngresoAC",
                "AD/GA_MotorTransferencias_Consulta_TXN_NAC"
        );

        return new ResponseUserDto(
                List.of(), // amr (vacío según el JSON)
                "TXavRxyDPORmny2s7WMsog", // at_hash
                "FbGs7r8dfBVcYfZd6alp0Wnnfe0a", // aud
                "FbGs7r8dfBVcYfZd6alp0Wnnfe0a", // azp
                1750803017L, // exp (timestamp)
                groups, // Lista de grupos
                1750799417L, // iat (timestamp)
                "https://identity.apps.ocptest.uiotest.bpichinchatest.test/oauth2/token", // iss
                "Rodney Pompeyo Salazar Bassante", // name
                "TUZXVWFtaHB-LWlPeVhRRWNaUi1jcGM1NWlrQlJZc2oyQlJpY3NkVkV1V090", // nonce
                "1dbe48cc-026f-4665-903e-bbd7c8e24396", // sid
                "rsalaza3" // sub (username)
        );
    }
}
