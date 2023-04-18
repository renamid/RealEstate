package com.example.realestate.dto;

import com.example.realestate.entity.Purchases;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PurchasesDTO {
    private Long id;
    private Long objectId;
    private Long userId;
    private Long agentId;
    private Double price;
    private LocalDate date;

    public static PurchasesDTO fromEntity(Purchases purchases){
        PurchasesDTO dto = new PurchasesDTO();
        dto.setId(purchases.getId());
        dto.setObjectId(purchases.getObjectId());
        dto.setUserId(purchases.getUserId());
        dto.setAgentId(purchases.getAgentId());

        return dto;
    }

    public static Purchases toEntity(PurchasesDTO dto){
        Purchases purchases = new Purchases();
        purchases.setId(dto.getId());
        purchases.setObjectId(dto.getObjectId());
        purchases.setUserId(dto.getUserId());
        purchases.setAgentId(dto.getAgentId());

        return purchases;
    }
}
