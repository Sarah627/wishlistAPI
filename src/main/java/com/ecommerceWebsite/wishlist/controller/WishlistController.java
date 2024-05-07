package com.ecommerceWebsite.wishlist.controller;

import com.ecommerceWebsite.wishlist.DataModel.WishListEntity;
import com.ecommerceWebsite.wishlist.service.WishlistService;
import com.ecommerceWebsite.wishlist.wishlistdto.WishListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {
    @Autowired
    private WishlistService wishlistService;
    @GetMapping("/get-item")
    public WishListDTO getWishList(@RequestParam  Long pID){
        return wishlistService.getItemFromWishList(pID);
    }
    //handling adding new item request in controller
    // calling wishListService bean
   @PostMapping("/add-item-to-wishlist")
    public void addItem(@RequestBody WishListEntity wishListEntity){
       wishlistService.addNewItem(wishListEntity);
   }

    @GetMapping("/delete-item-from-wishlist")
    public void deleteItem(@RequestParam Long pID){
        wishlistService.deleteItem(pID);
    }


}
