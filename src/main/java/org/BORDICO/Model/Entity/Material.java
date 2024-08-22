package org.BORDICO.Model.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.BORDICO.Model.Enum.Unit;

@Entity
@Table(name = "materials")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @Enumerated(EnumType.STRING)
    @Column(name = "unit", nullable = false, length = 50)
    private Unit unit;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supply_id", nullable = false)
    private Supply supply;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pattern_id", nullable = false)
    private Pattern pattern;
}