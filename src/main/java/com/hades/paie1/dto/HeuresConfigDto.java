package com.hades.paie1.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class HeuresConfigDto {
    private boolean heuresNormalesActive;
    private boolean heuresSup1Active;
    private BigDecimal tauxSup1;
}
