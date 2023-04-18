package com.example.realestate.dto;

import com.example.realestate.entity.Listing;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListingDTO {
    private Long id;
    private Long object_id;
    private String name;
    private String type;
    private Double price;
    private String address;
    private String thumbnail;
    private Long user_id;

    public static ListingDTO fromEntity(Listing listing){
        ListingDTO dto = new ListingDTO();
        dto.setId(listing.getId());
        dto.setObject_id(listing.getObjectId());
        dto.setUser_id(listing.getUserId());

        return dto;
    }

    public static Listing toEntity(ListingDTO dto){
        Listing listing = new Listing();
        listing.setId(dto.getId());
        listing.setObjectId(dto.getObject_id());
        listing.setUserId(dto.getUser_id());

        return listing;
    }
}
