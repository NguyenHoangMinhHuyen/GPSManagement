package com.example.demo.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "adminitrators")
public class Adminitrator {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "code", nullable = false, unique = true)
  private String code;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "phone", nullable = false)
  private String phone;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "address_detail")
  private String addressDetail;

  @Column(name = "id_card")
  private String idCard;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ward_code", referencedColumnName = "code")
  private Ward ward;

}
