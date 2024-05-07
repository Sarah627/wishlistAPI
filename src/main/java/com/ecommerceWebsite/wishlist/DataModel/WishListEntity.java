package com.ecommerceWebsite.wishlist.DataModel;


import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "WishListEntity")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WishListEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String productName;




}
