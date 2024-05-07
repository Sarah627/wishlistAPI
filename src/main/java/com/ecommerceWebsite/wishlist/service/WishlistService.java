package com.ecommerceWebsite.wishlist.service;

import com.ecommerceWebsite.wishlist.DataModel.WishListEntity;
import com.ecommerceWebsite.wishlist.repository.WishListRepository;
import com.ecommerceWebsite.wishlist.wishlistdto.WishListDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishlistService {

    @Autowired
    private WishListRepository wishListRepository;

    public WishListDTO getItemFromWishList(Long productId){
        Optional<WishListEntity> item = this.wishListRepository.findById(productId);
        if(item.isPresent())
            return WishListDTO.convertToDTO(item.get());
        else
            return null;

    }

    public void addNewItem(WishListEntity wishListEntity){
        this.wishListRepository.save(wishListEntity);
    }

    public String deleteItem(Long id){
        this.wishListRepository.deleteById(id);
        return "deleted successfully";
    }
}
