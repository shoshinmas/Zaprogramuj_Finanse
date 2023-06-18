package com.zaprogramujzycie.finanse.income;

import com.zaprogramujzycie.finanse.category.CategoryDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
public record AddIncomeDTO(
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate date,

        @Valid
        CategoryDTO category,

        @NotNull
        @Min(0)
        BigDecimal price
) {
}