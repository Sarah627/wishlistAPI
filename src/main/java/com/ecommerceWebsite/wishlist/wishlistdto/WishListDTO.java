package com.ecommerceWebsite.wishlist.wishlistdto;

import com.ecommerceWebsite.wishlist.DataModel.WishListEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WishListDTO {
    private Long id;
    private String productName;
    // mapping entity to object
    public static WishListDTO convertToDTO(WishListEntity entity){
        return WishListDTO.builder()
                .id(entity.getId())
                .productName(entity.getProductName())
                .build();
    }
}
