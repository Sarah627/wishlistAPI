package com.ecommerceWebsite.wishlist.repository;

import com.ecommerceWebsite.wishlist.DataModel.WishListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishListEntity,Long> {


}
