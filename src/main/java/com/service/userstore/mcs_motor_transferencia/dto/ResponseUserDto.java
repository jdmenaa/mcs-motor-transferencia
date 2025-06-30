package com.service.userstore.mcs_motor_transferencia.dto;

import lombok.Data;
import java.util.List;

@Data
public class ResponseUserDto {
    private List<String> amr; // Authentication Methods References
    private String atHash; // Access Token hash
    private String aud; // Audience
    private String azp; // Authorized party
    private Long exp; // Expiration time (timestamp)
    private List<String> groups; // Grupos/roles del usuario
    private Long iat; // Issued at (timestamp)
    private String iss; // Issuer
    private String name; // Nombre completo del usuario
    private String nonce; // Valor de seguridad
    private String sid; // Session ID
    private String sub; // Subject (username único)

    // Constructor vacío (necesario para deserialización)
    public ResponseUserDto() {
    }

    // Constructor con todos los campos (opcional)
    public ResponseUserDto(List<String> amr, String atHash, String aud, String azp,
                           Long exp, List<String> groups, Long iat, String iss,
                           String name, String nonce, String sid, String sub) {
        this.amr = amr;
        this.atHash = atHash;
        this.aud = aud;
        this.azp = azp;
        this.exp = exp;
        this.groups = groups;
        this.iat = iat;
        this.iss = iss;
        this.name = name;
        this.nonce = nonce;
        this.sid = sid;
        this.sub = sub;
    }
}