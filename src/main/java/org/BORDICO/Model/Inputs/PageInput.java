package org.BORDICO.Model.Inputs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.BORDICO.Model.Enum.ESort;

@Data
public class PageInput {
    private Integer pageNo = 0;
    private Integer pageSize = 10;
    private String sortBy = "id";
    private ESort sort = ESort.DES;
    @JsonCreator
    public PageInput(
            @JsonProperty("pageNo") Integer pageNo,
            @JsonProperty("pageSize") Integer pageSize,
            @JsonProperty("sortBy") String sortBy,
            @JsonProperty("sort") ESort sort) {
        this.pageNo = pageNo != null ? pageNo : this.pageNo;
        setPageSize(pageSize);
        this.sortBy = sortBy != null ? sortBy : this.sortBy;
        this.sort = sort != null ? sort : this.sort;
    }
    public void setPageSize(Integer pageSize) {
        if (pageSize != null && pageSize > 100) {
            throw new IllegalArgumentException("Page size cannot be greater than 100");
        }
        this.pageSize = pageSize != null ? pageSize : this.pageSize;
    }
}