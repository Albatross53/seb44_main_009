package com.main.MainProject.cart.entity;

import com.main.MainProject.order.entity.OrderProduct;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
public class Cart {
    @Id
    private Long cartId;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<OrderProduct> orderProductList = new ArrayList<>();


    public Cart(List<OrderProduct> orderProductList) {
        this.orderProductList = orderProductList;
    }

    //TODO: 회원과 연관관계 추가하기
//    @OneToOne
//    @JoinColumn(name = "member_id")
//    private Member member;
}
